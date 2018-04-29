package com.whitaaplikasi.app.librarycreation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.whitaaplikasi.app.textalay.AlayHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String text = "Sarimin pergi ke pasar katanya";
        String result = AlayHelper.alaynize(text);

        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        TextView tv = findViewById(R.id.txtView);
        tv.setText(result);
    }
}
