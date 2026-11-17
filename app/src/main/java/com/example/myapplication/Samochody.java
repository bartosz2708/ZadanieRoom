package com.example.myapplication;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "samochody")
public class Samochody {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String Marka;
    private boolean CzyUszkodzone;
    @ColumnInfo(name = "rok")
    private int rokProdukcji;
    private String kategoria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public boolean isCzyUszkodzone() {
        return CzyUszkodzone;
    }

    public void setCzyUszkodzone(boolean czyUszkodzone) {
        CzyUszkodzone = czyUszkodzone;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    public Samochody() {
    }

    public Samochody(String marka, boolean czyUszkodzone, int rokProdukcji, String kategoria) {
        Marka = marka;
        CzyUszkodzone = czyUszkodzone;
        this.rokProdukcji = rokProdukcji;
        this.kategoria = kategoria;
    }
}

