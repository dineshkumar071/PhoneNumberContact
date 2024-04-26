package com.example.dashboardproject.ui.detail_screen

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.dashboardproject.Repository.ApiCalls
import com.example.dashboardproject.Repository.Model.ContactModel
import com.example.dashboardproject.Repository.Model.Name
import com.example.dashboardproject.Repository.Model.ResultOne
import com.example.dashboardproject.Repository.TSResponse
import com.example.dashboardproject.database.PNDatabase
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class PNContactViewModel @Inject constructor(
    private val mApplication: Application,
    private val apiCall: ApiCalls,
    private val database: PNDatabase
) : AndroidViewModel(mApplication) {
    val contacts by lazy { MutableLiveData<TSResponse<ContactModel>>() }

    fun getDeviceRandomContact(page: Int) {
        val call = apiCall.getRandomContacts(page)
        contacts.postValue(TSResponse.loading(ContactModel()))
        call.enqueue(object : Callback<ContactModel> {
            override fun onResponse(call: Call<ContactModel>, response: Response<ContactModel>) {
                if (response.isSuccessful) {
                    contacts.postValue(TSResponse.success(response.body()))
                    saveUsers(response)
                    saveUserNames(response.body())
                } else {
                    contacts.postValue(TSResponse.error("Invalid API Link"))
                }
            }

            override fun onFailure(call: Call<ContactModel>, t: Throwable) {
                contacts.postValue(TSResponse.error("Something went wrong"))
            }
        })
    }

    private fun saveUserNames(contactModel: ContactModel?) {
        val nameList = mutableListOf<Name>()
        if(contactModel?.results != null) {
            for (contact in contactModel.results!!) {
                contact.name?.let { nameList.add(it) }
            }
        }
        Thread{
            database.userDOA().saveNames(nameList)
        }.start()
    }

    private fun saveUsers(response: Response<ContactModel>) {
        Thread {
            response.body()!!.results?.let { database.userDOA().saveUsers(it) }
        }.start()
    }

    fun fetchRandomContact(callback: ContactListCallBack){
            Thread{
               val contacts = database.userDOA().readUser()
                callback.getContacts(contacts)
            }.start()
    }

    interface ContactListCallBack{
        fun getContacts(contactList:List<ResultOne>)
    }

}