package com.example.sumoftwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num1,num2;
    private Button button;
    private TextView tv;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.editNumber1);
        num2=findViewById(R.id.editNumber2);
        button=findViewById(R.id.btnAdd);
        tv=findViewById(R.id.tvAnswer);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(num1.getText().toString().isEmpty())
                {

                    Toast.makeText(MainActivity.this, "Enter number in First Box", Toast.LENGTH_SHORT).show();
                }

                else if(num2.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter number in Second Box", Toast.LENGTH_SHORT).show();
                }
                else{
                    int number1=Integer.parseInt(num1.getText().toString());
                    int number2=Integer.parseInt(num2.getText().toString());

                    int sum=number1+number2;
                    tv.setText("Answer:"+String.valueOf(sum));

                }

            }
        });
    }
}