package com.example.cableaudio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class nuevo_user extends AppCompatActivity {
private TextView tx1,tx2,tx3,tx4,tx5;
private Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nuevo_user);

        tx1 = findViewById(R.id.nombre1);
        tx2 = findViewById(R.id.apellido);
        tx3 = findViewById(R.id.telefono);
        tx4 = findViewById(R.id.contraseñaa);
        tx5 = findViewById(R.id.repetir_contra);
        b1 = findViewById(R.id.crear_user);
        b2 = findViewById(R.id.volverr);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void volver(View view){
        Intent volverrr = new Intent(this, MainActivity.class);
        startActivity(volverrr);
    }
}