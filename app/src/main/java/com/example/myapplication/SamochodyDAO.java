package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface SamochodyDAO {
    @Insert
    public void wstawDoBazySamochodow(Samochody samochody);
    @Insert
    public  void wstawListeSamochodowDoBazy(Samochody ... samochody);
    @Delete
    public void usunzBazy(Samochody samochody);
    @Update
    public void aktualizujSamochodyWBazie(Samochody samochody);

    @Query("SELECT * FROM samochody")
    public List<Samochody> zwrocWszystkieSamochodyZBazy();
    @Query("SELECT marka FROM samochody where rok >:rokParametr")
    public  List<String> zwrocTytulSamochoduODanymRoku(int rokParametr);


}

