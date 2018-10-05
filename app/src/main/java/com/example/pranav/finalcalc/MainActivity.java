package com.example.pranav.finalcalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b5,b6,b7,b9,b10,b11,b12,b14;
    EditText edit;
    float i, j, c;
    String s,h,sb;
    char op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b9=findViewById(R.id.button9);
        b10=findViewById(R.id.button10);
        b11=findViewById(R.id.button11);
        b12=findViewById(R.id.button12);

        edit = findViewById(R.id.Text1);

        //Added b14 findViewById to avoid crash when 0 button is clicked
        b14 = findViewById(R.id.button14);
    }

    public void one(View view) {
        setTextFromButton(b1);
    }

    public void two(View view) {
        setTextFromButton(b2);
    }

    public void three(View view) {
        setTextFromButton(b3);
    }

    public void four(View view) {
        setTextFromButton(b5);

    }

    public void five(View view) {

        setTextFromButton(b6);

    }

    public void six(View view) {
       setTextFromButton(b7);
    }

    public void seven(View view) {
        setTextFromButton(b9);
    }

    public void eight(View view) {
        setTextFromButton(b10);
    }

    public void nine(View view) {

        setTextFromButton(b11);
    }

    public void zero(View view) {
       setTextFromButton(b14);
    }

    public void reset(View view) {

        edit.setText("");

    }

    public void addition(View view) {

        h = edit.getText().toString();
        edit.setText("");
        op='+';
    }

    public void subtract(View view) {

        h= edit.getText().toString();
        edit.setText("");
        op='-';
    }

    public void multiply(View view) {

        h= edit.getText().toString();
        edit.setText("");
        op='*';

    }

    public void divide(View view) {

        h= edit.getText().toString();
        edit.setText("");
        op='/';

    }

    public void result(View view) {

        if (op == '+') {

            i=Float.parseFloat(h);
            j=Float.parseFloat(s+sb);
            c=i+j;
            edit.setText(c+"");

        } else if (op == '-') {

            i=Float.parseFloat(h);
            j=Float.parseFloat(s+sb);
            c=i-j;
            edit.setText(c+"");

        } else if (op == '*') {

            i=Float.parseFloat(h);
            j=Float.parseFloat(s+sb);
            c=i*j;
            edit.setText(c+"");

        } else if (op == '/') {

            i=Float.parseFloat(h);
            j=Float.parseFloat(s+sb);
            if (j==0){
                edit.setText("Error");
            }
            else
                c=i/j;
            edit.setText(c+"");

        }
    }

    /** Get text from button and concatenate with edit**/
    public void setTextFromButton(Button button)
    {
        s = edit.getText().toString();
        sb = button.getText().toString();
        edit.setText(s+sb);
    }
}
