package com.example.cabaudio;

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

public class olvido_contra extends AppCompatActivity {
private TextView t1,t2;
private Button bo1,bo2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_olvido_contra);

        t1 = findViewById(R.id.correo_elec);
        t2 = findViewById(R.id.mensaje_mo);
        bo1 = findViewById(R.id.restablecer_contra);
        bo2 = findViewById(R.id.volver_rr);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void volve(View view){
        Intent vol = new Intent(this, MainActivity.class);
        startActivity(vol);
    }
}