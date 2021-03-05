package com.example.comparao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;

import java.text.NumberFormat;
import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view) {

        int alcool;
        int gasolina;

        TextView resultado = findViewById(R.id.txtResultado);
        EditText valueAlcool, valueGasolina;
        valueAlcool = findViewById(R.id.txtAlcool);
        valueGasolina = findViewById(R.id.txtGasolina);

        try {
            alcool = Integer.parseInt(valueAlcool.getText().toString().replaceAll(",", ""));
            gasolina = Integer.parseInt(valueGasolina.getText().toString().replaceAll(",", ""));

            if (alcool < gasolina)
                resultado.setText("A melhor opção é: Álcool");
            else
                resultado.setText("A melhor opção é: Gasolina");

        }catch(NumberFormatException nfe){
            System.out.println("Erro: " + nfe);
            resultado.setText("ERRO!");
        }
    }
}