package com.blogspot.gihanmora.mybmi;

import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static android.R.attr.onClick;

public class Main2Activity extends AppCompatActivity {
    RelativeLayout rl;
    TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);


            tt = (TextView) findViewById(R.id.textView3);
            tt.setText(Double.toString(Math.round(MainActivity.bmi * 1000.0) / 1000.0));
            rl = (RelativeLayout) findViewById(R.id.as);
            if (MainActivity.bmi <= 18.5) {
                rl.setBackgroundResource(R.drawable.under);
            }
            if (18.5 < MainActivity.bmi && MainActivity.bmi <= 24.9) {
                rl.setBackgroundResource(R.drawable.nor);
            }
            if (MainActivity.bmi >= 25 && MainActivity.bmi <= 29.9) {
                rl.setBackgroundResource(R.drawable.ov);
            }
            if (MainActivity.bmi >= 30) {
                rl.setBackgroundResource(R.drawable.over);
            }

        }
        catch(Exception e){

        }
    }
    public void onClick(){
        Intent w=new Intent(Main2Activity.this,MainActivity.class);
        startActivity(w);
    }
}
