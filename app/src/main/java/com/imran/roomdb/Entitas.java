package com.imran.roomdb;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/*
 Mohamad Imran 10117170 IF5
 Dikerjakan Pada hari jumat 1 mei 2020
 */

@Entity
public class Entitas {

    @PrimaryKey
    private int uid;
    @ColumnInfo(name = "namalengkap")
    public String namalengkap;
    @ColumnInfo(name = "useremail")
    public String useremail;
    @ColumnInfo(name = "useralamat")
    public String useralamat;

    public void setNama (String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setEmail(String useremail) {
        this.useremail = useremail;
    }

    public void setAlamat(String useralamat) {
        this.useralamat = useralamat;
    }

    public String getAlamat() {
        return useralamat;
    }

    public String getEmail() {
        return useremail;
    }

    public String getNama() {
        return namalengkap;
    }

    public int getUid() {
        return uid;
    }
}

