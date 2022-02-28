package com.example.ex1602;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int x=0,y=0;
    int success=0;
    String st;
    int uAnswer,sum;
    ImageView iv1,iv2,iv3;
    Button btn1,btn2,btn3,newBtn;
    TextView tv1,tv2,tv3,tv1p2,tv2p2,tv3p2;
    EditText et1,et2,et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv1 =(ImageView) findViewById(R.id.iv1);
        iv2 =(ImageView) findViewById(R.id.iv2);
        iv3 =(ImageView) findViewById(R.id.iv3);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        newBtn = findViewById(R.id.newbtn);
        tv1=(TextView) findViewById(R.id.tv1);
        tv2=(TextView) findViewById(R.id.tv2);
        tv3=(TextView) findViewById(R.id.tv3);
        tv1p2=(TextView) findViewById(R.id.tv1p2);
        tv2p2=(TextView) findViewById(R.id.tv2p2);
        tv3p2=(TextView) findViewById(R.id.tv3p2);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        et3=(EditText) findViewById(R.id.et3);
        btn1.setEnabled(true);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        newBtn.setEnabled(true);
        tv2.setText("");
        tv2p2.setText("");
        tv3.setText("");
        tv3p2.setText("");
        iv1.setImageResource(R.drawable.w);
        iv2.setImageResource(R.drawable.w);
        iv3.setImageResource(R.drawable.w);
        x =  (int) (Math.random() * 90) + 10;
        y= (int) (Math.random() * 90 )+ 10;
        sum=x+y;
        tv1.setText(Integer.toString(x));
        tv1p2.setText(Integer.toString(y));


    }

    public void click1(View view) {
        st=et1.getText().toString();
        uAnswer=Integer.parseInt(st);
        if(uAnswer==sum){
            iv1.setImageResource(R.drawable.t);
            success++;
        }
        else{
            iv1.setImageResource(R.drawable.f);
        }
        btn2.setEnabled(true);
        btn1.setEnabled(false);
        tv1.setText("answer: "+Integer.toString(sum));

        x =  (int) (Math.random() * 90) + 10;
        y= (int) (Math.random() * 90 )+ 10;
        sum=x+y;
        tv2.setText(Integer.toString(x));
        tv2p2.setText(Integer.toString(y));
    }

    public void click2(View view) {
        st=et2.getText().toString();
        uAnswer=Integer.parseInt(st);
        if(uAnswer==sum){
            iv2.setImageResource(R.drawable.t);
            success++;
        }
        else{
            iv2.setImageResource(R.drawable.f);
        }
        btn3.setEnabled(true);
        btn2.setEnabled(false);
        tv2.setText("answer: "+Integer.toString(sum));
        x =  (int) (Math.random() * 90) + 10;
        y= (int) (Math.random() * 90 )+ 10;
        sum=x+y;
        tv3.setText(Integer.toString(x));
        tv3p2.setText(Integer.toString(y));
    }

    public void click3(View view) {
        st=et3.getText().toString();
        uAnswer=Integer.parseInt(st);
        if(uAnswer==sum){
            iv3.setImageResource(R.drawable.t);
            success++;
        }
        else{
            iv3.setImageResource(R.drawable.f);
        }
        btn3.setEnabled(false);
        tv3.setText("answer: "+Integer.toString(sum));
        Toast.makeText(this, "Success rate: "+success+"/3", Toast.LENGTH_LONG).show();
    }

    public void newGame(View view) {
        et1.setText("");
        et2.setText("");
        et3.setText("");
        tv2.setText("");
        tv2p2.setText("");
        tv3.setText("");
        tv3p2.setText("");
        x =  (int) (Math.random() * 90) + 10;
        y= (int) (Math.random() * 90 )+ 10;
        sum=x+y;
        tv1.setText(Integer.toString(x));
        tv1p2.setText(Integer.toString(y));
        iv1.setImageResource(R.drawable.w);
        iv2.setImageResource(R.drawable.w);
        iv3.setImageResource(R.drawable.w);
        btn1.setEnabled(true);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        success=0;
    }
}