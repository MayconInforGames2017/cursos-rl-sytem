package br.com.mayconsantana.ifood.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import br.com.mayconsantana.ifood.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }
}