package br.com.ibh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import br.com.ibh.R;

public class MainActivity extends AppCompatActivity {
    private LinearLayout igreja,ministerio,oferta,live,videos,devocional,agenda,biblia,oracao,social,localizacao,programacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        igreja = findViewById(R.id.igreja);
        ministerio = findViewById(R.id.ministerio);
        oferta = findViewById(R.id.oferta);
        live = findViewById(R.id.live);
        videos = findViewById(R.id.videos);
        devocional = findViewById(R.id.devocional);
        agenda = findViewById(R.id.agenda);
        biblia = findViewById(R.id.biblia);
        oracao = findViewById(R.id.oracao);
        social = findViewById(R.id.social);
        localizacao = findViewById(R.id.localizacao);
        programacao = findViewById(R.id.programacao);

        igreja.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, igreja.class);
                startActivity(intent);
            }
        });
        ministerio.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Ministerio.class);
                startActivity(intent);
            }
        });
        oferta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Oferta.class);
                startActivity(intent);
            }
        });
        live.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Live.class);
                startActivity(intent);
            }
        });
        videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Video.class);
                startActivity(intent);
            }
        });
        devocional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Devocional.class);
                startActivity(intent);
            }
        });
        oracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Oracao.class);
                startActivity(intent);
            }
        });
        agenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Agenda.class);
                startActivity(intent);
            }
        });
        biblia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Biblia.class);
                startActivity(intent);
            }
        });
        social.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Social.class);
                startActivity(intent);
            }
        });
        localizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Localizacao.class);
                startActivity(intent);
            }
        });
        programacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Programacao.class);
                startActivity(intent);
            }
        });
    }
}