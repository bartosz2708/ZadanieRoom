package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    SamochodyDataBase samochodyDataBase;
    ArrayAdapter<Samochody> arrayAdapter;
    List<Samochody> samochody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        samochodyDataBase = Room.databaseBuilder(
                getApplicationContext(),
                SamochodyDataBase.class,
                "samochody_db")
                .allowMainThreadQueries()
                .build();
        samochodyDataBase.zwrocSamochodyDao().wstawDoBazySamochodow(new Samochody("Bmw",false,2020,"Auto_Sportowe"));
    }
}