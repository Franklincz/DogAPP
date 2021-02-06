package com.example.dogapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Micuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_micuenta);





        BottomNavigationView bottomNavigationView = findViewById(R.id.botomm_nav);




        bottomNavigationView.setSelectedItemId(R.id.Micuenta);


        //dagsgasud

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){


            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId()){
                    case R.id.home:


                        startActivity(new Intent(getApplicationContext() ,BottomNavigation.class));
                        overridePendingTransition(0,0


                        );

                        return true;


                    case R.id.Buscar:
                        startActivity(new Intent(getApplicationContext() ,Busqueda.class));
                        overridePendingTransition(0,0
                        );

                        return true;


                    case R.id.Mis_Donaciones:
                        startActivity(new Intent(getApplicationContext() ,Donaciones.class));
                        overridePendingTransition(0,0
                        );

                        return true;


                    case R.id.Notificaciones:
                        startActivity(new Intent(getApplicationContext() ,Notificaciones.class));
                        overridePendingTransition(0,0
                        );

                        return true;





                    case R.id.Micuenta:

                        return true;







                }

                return false;
            }
        });













    }














}