package com.example.exerciseone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailKontakActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kontak);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("nama");
        String nomor = bundle.getString("nomor");

        TextView tNama = findViewById(R.id.tvNama);
        TextView tNomor = findViewById(R.id.tvNomor);
        tNama.setText(nama);
        tNomor.setText(nomor);
    }
}