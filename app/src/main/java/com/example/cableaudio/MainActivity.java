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

public class MainActivity extends AppCompatActivity {
private TextView tex1,tex2,tex3,tex4,tex5,tex6;
private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tex1 = findViewById(R.id.inicio);
        tex2 = findViewById(R.id.nombre);
        tex3 = findViewById(R.id.contra);
        tex4 = findViewById(R.id.cuenta);
        tex5 = findViewById(R.id.registro);
        tex6 = findViewById(R.id.olvidar);
        btn1 = findViewById(R.id.ingreso);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void nuevo(View view){
        Intent nuevoo = new Intent(this, nuevo_user.class);
        startActivity(nuevoo);
    }
    public void contra(View view){
        Intent contraaa = new Intent(this, olvido_contra.class);
        startActivity(contraaa);
    }
}