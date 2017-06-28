package com.example.lucasferraz.educavida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.random);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] random = {"Frase1", "Frase2", "Frase3", "Frase4", "Frase5"};
                Random sorteio = new Random();
                String fraseSorteada = random[sorteio.nextInt(5)];
                Log.d("Sorteio", ";" + fraseSorteada);
                TextView textView = (TextView) findViewById(R.id.frases_random);
                textView.setText(fraseSorteada);
            }
        });
    }
}
