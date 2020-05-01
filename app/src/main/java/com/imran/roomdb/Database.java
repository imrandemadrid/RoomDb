package com.imran.roomdb;

import androidx.room.RoomDatabase;

/*
 Mohamad Imran 10117170 IF5
 Dikerjakan Pada hari jumat 1 mei 2020
 */

@androidx.room.Database(entities = {Entitas.class}, version = 2, exportSchema = false)
public abstract class Database extends RoomDatabase {
    public abstract DAO DAO();
}
