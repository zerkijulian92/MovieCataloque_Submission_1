package com.takatutustudio.projectrecyclerview.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.takatutustudio.projectrecyclerview.R;

public class AboutActivity extends AppCompatActivity {
    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //Menganti Judul Halaman
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Tentang Saya");
        }
        //--

        btnLogout = findViewById(R.id.btn_logout);

        //Event Logout
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        //--
    }
}
