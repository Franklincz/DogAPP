package com.example.dogapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Notificaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificaciones);





        BottomNavigationView bottomNavigationView = findViewById(R.id.botomm_nav);




        bottomNavigationView.setSelectedItemId(R.id.Notificaciones);


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


                        return true;





                    case R.id.Micuenta:
                        startActivity(new Intent(getApplicationContext() ,Micuenta.class));
                        overridePendingTransition(0,0
                        );
                        return true;







                }

                return false;
            }
        });
















    }
}