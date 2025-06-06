package com.jp.exercicio_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import controller.MaiorSomaImpar;

public class MainActivity extends AppCompatActivity {

    private EditText etNumPrimeiro;
    private EditText etNumSegundo;
    private Button btnMaior;
    private Button btnSomaImpar;
    private TextView textoMaior;
    private TextView textoSoma;

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

        etNumPrimeiro = findViewById(R.id.etNumPrimeiro);
        etNumSegundo = findViewById(R.id.etNumSegundo);
        btnMaior = findViewById(R.id.btnMaior);
        btnSomaImpar = findViewById(R.id.btnSomaImpar);
        textoMaior = findViewById(R.id.textoMaior);
        textoSoma = findViewById(R.id.textoSoma);

        btnMaior.setOnClickListener(operacao -> Maior());
        btnSomaImpar.setOnClickListener(operacao -> SomaImpar());
    }
        private void Maior(){
            MaiorSomaImpar maior = new MaiorSomaImpar();
            textoMaior.setText(String.valueOf(
                    maior.Maior(
                            Integer.parseInt(etNumPrimeiro.getText().toString()),
                            Integer.parseInt(etNumSegundo.getText().toString())
                    )
            ));
    }
        private void SomaImpar(){
            MaiorSomaImpar soma_impar = new MaiorSomaImpar();
            textoSoma.setText(String.valueOf(
                    soma_impar.SomaImpar(
                            Integer.parseInt(etNumPrimeiro.getText().toString()),
                            Integer.parseInt(etNumSegundo.getText().toString())
                    )
            ));
        }
}