package com.example.dashboardproject.Repository

import com.example.dashboardproject.service.TSClient
import javax.inject.Inject

class ApiCalls @Inject constructor(private val client : TSClient)  {
    fun getRandomContacts(page:Int)= client.getRandomContacts(page,"gender,name,picture,phone,cell,id,email")

}