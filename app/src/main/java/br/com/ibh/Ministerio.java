package br.com.ibh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import br.com.ibh.R;

public class Ministerio extends AppCompatActivity {
    private ImageView sabermais3,sabermais4,sabermais5,sabermais6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ministerio);
        sabermais3 = findViewById(R.id.sabermais3);
        sabermais4 = findViewById(R.id.sabermais4);
        sabermais5 = findViewById(R.id.sabermais5);
        sabermais6 = findViewById(R.id.sabermais6);

        sabermais3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ministerio.this,Sabermais3.class);
                startActivity(intent);
            }
        });
        sabermais4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ministerio.this,Sabermais4.class);
                startActivity(intent);
            }
        });
        sabermais5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ministerio.this,Sabermais5.class);
                startActivity(intent);
            }
        });
        sabermais6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ministerio.this,Sabermais6.class);
                startActivity(intent);
            }
        });
    }
}