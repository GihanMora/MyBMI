package com.blogspot.gihanmora.mybmi;

import android.content.Intent;
import android.icu.text.NumberFormat;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    EditText e1;
    EditText e2;
    Button b;
    TextView t;
    public static double bmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.editText2);
        e2=(EditText)findViewById(R.id.editText);
        b=(Button)findViewById(R.id.button);
        mp=MediaPlayer.create(this,R.raw.aa);
        t=(TextView)findViewById(R.id.textView6);
        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            Double weight = Double.parseDouble(e1.getText().toString());
                            Double height = Double.parseDouble(e2.getText().toString());
                            bmi = (weight) / (height * height);
                        //t.setText(bmi.toString());
                        Intent i=new Intent(MainActivity.this,Main2Activity.class);
                        mp.start();
                        startActivity(i);}
                        catch(NumberFormatException e){
                            t.setText("Please enter Height and Weight Correctly!");
                        }
                    }
                }
        );



    }

}
