package com.example.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText height, weight;
    private TextView bmi;
    private Button calc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = findViewById(R.id.et_height);
        weight = findViewById(R.id.et_weight);
        bmi = findViewById(R.id.tv_bmi);
        calc = findViewById(R.id.btn_bmi);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BMI();
            }
        });
    }
    private void BMI(){
        Double height1, weight1, result1;
       height1 = Double.parseDouble(height.getText().toString());
       weight1 = Double.parseDouble(weight.getText().toString());
       result1 = weight1/((height1*height1)/10000);
       bmi.setText(result1.toString());

       if (result1<=18.5){
           Toast.makeText(this, "You are under weight, EAT SOME MORE!!!", Toast.LENGTH_SHORT).show();
       }
       if (result1>=18.5 && result1<=24.9){
           Toast.makeText(this, "Youre weight is normal, GOOD JOB!!!", Toast.LENGTH_SHORT).show();
        }
        if (result1>=25 && result1<=29.9){
            Toast.makeText(this, "You are over weight, EXERCISE MORE & AVOID JUNK FOOD!!!", Toast.LENGTH_SHORT).show();
        }
        if (result1>=30){
            Toast.makeText(this, "You are obessed, EXERCISE HARD & GO ON A HEALTHY DIET!!!", Toast.LENGTH_SHORT).show();
        }

    }

}
