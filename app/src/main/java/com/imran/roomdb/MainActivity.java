package com.imran.roomdb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/*
 Mohamad Imran 10117170 IF5
 Dikerjakan Pada hari jumat 1 mei 2020
 */

public class MainActivity extends AppCompatActivity {

    private Entitas entitas;
    public static Database db;

    List<Entitas> entities = new ArrayList<>();
    List<Entitas> entitasListAlamat = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = Room.databaseBuilder(getApplicationContext(),Database.class,"Data Diri")
                .allowMainThreadQueries().build();

        entitas = new Entitas();
        entitas.setUid(1);
        entitas.setNama("Mohamad");
        entitas.setEmail("imrandemadrid02@gmail.com");
        entitas.setAlamat("Bandung");
        Log.d("TAMBAH","  Tambah Data Diri  ");
        Log.d("TAMBAH","====================");
        Log.d("TAMBAH","ID            : "+ entitas.getUid());
        Log.d("TAMBAH","Nama Lengkap  : "+ entitas.getNama());
        Log.d("TAMBAH","Email User    : "+ entitas.getEmail());
        Log.d("TAMBAH","Alamat        : "+ entitas.getAlamat());


        entitas.setUid(2);
        entitas.setNama("Asep");
        entitas.setEmail("asepronaldo7@gmail.com");
        entitas.setAlamat("Lisbon");
        Log.d("TAMBAH","  Tambah Data Diri  ");
        Log.d("TAMBAH","====================");
        Log.d("TAMBAH","ID            : "+ entitas.getUid());
        Log.d("TAMBAH","Nama Lengkap  : "+ entitas.getNama());
        Log.d("TAMBAH","Email User    : "+ entitas.getEmail());
        Log.d("TAMBAH","Alamat        : "+ entitas.getAlamat());


    }
}
