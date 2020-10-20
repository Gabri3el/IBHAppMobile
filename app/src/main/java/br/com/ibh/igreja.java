package br.com.ibh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import br.com.ibh.R;

public class igreja extends AppCompatActivity {
    private ImageView sabermais,sabermais2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_igreja);
        sabermais = findViewById(R.id.sabermais);
        sabermais2 = findViewById(R.id.sabermais2);

        sabermais.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(igreja.this, sabermais.class);
                startActivity(intent);
            }
        });

        sabermais2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(igreja.this, Sabermais2.class);
                startActivity(intent);
            }
        });


    }
}