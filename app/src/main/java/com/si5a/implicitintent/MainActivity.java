package com.si5a.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etwebsite, etlokasi, etteks;
    Button btnwebsite, btnlokasi, btnteks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etwebsite = findViewById(R.id.et_website);
        etlokasi = findViewById(R.id.et_lokasi);
        etteks = findViewById(R.id.et_teks);

        btnwebsite = findViewById(R.id.btn_website);
        btnlokasi = findViewById(R.id.btn_lokasi);
        btnteks = findViewById(R.id.btn_teks);

        btnwebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlWebsite = etwebsite.getText().toString();
                Uri uriurlWebsite = Uri.parse(urlWebsite);
                Intent intentWebsite = new Intent(Intent.ACTION_VIEW, uriurlWebsite);
                try {
                    startActivity(intentWebsite);
                }catch (Exception e){
                    etwebsite.setError("url Tidak sesuai");
                }
            }
        });


    }
}