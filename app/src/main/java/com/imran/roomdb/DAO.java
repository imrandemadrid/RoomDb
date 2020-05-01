package com.imran.roomdb;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DAO {
    @Query("SELECT * FROM Entitas")
    List<Entitas> tampilSemua();

    @Query("SELECT * FROM Entitas WHERE useralamat LIKE :useralamat")
    List<Entitas> listAlamat(String useralamat);

    @Insert
    void tambahData(Entitas entitas);

}

