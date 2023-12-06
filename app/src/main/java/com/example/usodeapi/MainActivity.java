package com.example.usodeapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //inicia tela
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //liga vars ao ambiente
        txt = findViewById(R.id.txt);
        btn = findViewById(R.id.btn);

        //listener pro botao funcionar
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pesquisa bitcoin aqui
                try {
                    Bitcoin retorno = new HttpService().execute().get();
                    txt.setText(retorno.toString());
                    //mostra mensagem que deu certo
                    Toast.makeText(MainActivity.this, "Sucesso na pesquisa!",
                            Toast.LENGTH_LONG).show();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }

            }
        });
    }
}