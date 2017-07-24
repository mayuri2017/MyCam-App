package com.example.mayuri.mycam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GettextfromImage extends AppCompatActivity {
TextView tvGetData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gettextfrom_image);

        tvGetData=(TextView)findViewById(R.id.tvGetText);
        Intent intent = getIntent();
        tvGetData.setText(intent.getStringExtra("GetText"));
    }
}
