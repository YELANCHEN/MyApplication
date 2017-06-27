package com.example.yvtc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v){
        TextView tv =(TextView) findViewById(R.id.textView1);
        tv.setText("安安");
    }
    public void click2(View v){
        TextView tv2 =(TextView) findViewById(R.id.textView2);
        EditText ed1=(EditText) findViewById(R.id.editText1);
        int s1 = Integer.parseInt(ed1.getText().toString()); //整數純量變數與字串轉換
        EditText ed2=(EditText) findViewById(R.id.editText2);
        int s2 = Integer.parseInt(ed2.getText().toString());
        tv2.setText("結果"+(s1+s2));




    }






}



