package com.example.toolsty;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainTelaInicial extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tela_inicio);

        int splash_screen_timeout = 5000;
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainTelaInicial.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, splash_screen_timeout);

    }
}
