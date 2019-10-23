package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public final static String EXTRA_MESSAGE = "com.example.holamundo.MESSAGE";
    //Variables String
    String item;
    String texto="Has comprado";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Recoge el click
    public void nevera(View view){item="nevera";}
    public void plancha(View view){item="plancha";}
    public void secadora(View view){item="secadora";}

    //Concadenamos
    String full=texto+" "+item;

    public void sendMessage(View view) {
        Intent intent = new Intent(this, displayMessageActivity.class);

        startActivity(intent);

    }
}
