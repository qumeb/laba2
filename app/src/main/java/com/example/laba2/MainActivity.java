package com.example.laba2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText a,b,answer;
    TextView opr, err;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=findViewById(R.id.editTextNumber4);
        b=findViewById(R.id.editTextNumber5);
        answer=findViewById(R.id.editTextNumber6);
        opr=findViewById(R.id.textView4);
        err=findViewById(R.id.textView6);

    }
    public void plusbtn(View view){
        int a_number=Integer.parseInt(a.getText().toString());
        int b_number=Integer.parseInt(b.getText().toString());
        int c=a_number+b_number;
        answer.setText(Integer.toString(c));
        opr.setText("+");

    }
    public void minusbtn(View view) {
        int a_number = Integer.parseInt(a.getText().toString());
        int b_number = Integer.parseInt(b.getText().toString());
        int c = a_number - b_number;
        answer.setText(Integer.toString(c));
        opr.setText("-");
    }
    public void btn(View view) {
        int a_number = Integer.parseInt(a.getText().toString());
        int b_number = Integer.parseInt(b.getText().toString());
        int c = a_number * b_number;
        answer.setText(Integer.toString(c));
        opr.setText("*");
    }
    public void btn1(View view) {
        int a_number = Integer.parseInt(a.getText().toString());
        int b_number = Integer.parseInt(b.getText().toString());
        if (b_number != 0) {
            int c = a_number / b_number;
            answer.setText(Integer.toString(c));
            opr.setText("/");
        }
        else
        {
            answer.setText("ERROR");
            err.setVisibility(View.VISIBLE);
        }

    }
    public void cleanbtn(View view){
        a.setText("");
        b.setText("");
        answer.setText("");
    }
}