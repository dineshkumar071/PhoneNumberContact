package com.example.dashboardproject.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.REPLACE
import androidx.room.Query
import com.example.dashboardproject.Repository.Model.ContactModel
import com.example.dashboardproject.Repository.Model.Name
import com.example.dashboardproject.Repository.Model.ResultOne

@Dao
interface ContactDAO {
    /** insert the user details in the database
     * */
    @Insert(onConflict = REPLACE)
    fun saveUser(user: ResultOne)

    /** getting the user details
     * */
    @Query("select * from ResultOne")
    fun readUser(): List<ResultOne>

    @Insert(onConflict = REPLACE)
    fun saveUsers(users:List<ResultOne>)

    @Insert(onConflict = REPLACE)
    fun saveNames(names:List<Name>)

    @Query("select * from Name")
    fun readName():List<Name>

    /** deleting the database
     **/
    @Query("DELETE FROM ResultOne")
    fun deleteDataBase()

}