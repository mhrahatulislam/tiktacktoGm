package com.example.tictcktoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;

    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int flag =0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


    }


    private void init(){

        btn1 =findViewById(R.id.bt1);
        btn2 =findViewById(R.id.bt2);
        btn3 =findViewById(R.id.bt3);
        btn4 =findViewById(R.id.bt4);
        btn5 =findViewById(R.id.bt5);
        btn6 =findViewById(R.id.bt6);
        btn7 =findViewById(R.id.bt7);
        btn8 =findViewById(R.id.bt8);
        btn9 =findViewById(R.id.bt9);

    }

    public void Check(View view){

        Button btnCurrent = (Button) view;
        count++;

        if(flag == 0){
            btnCurrent.setText("X");
            flag=1;
        }
        else{
            btnCurrent.setText("O");
            flag=0;
        }

        if(count>4){

            b1=btn1.getText().toString();
            b2=btn2.getText().toString();
            b3=btn3.getText().toString();
            b4=btn4.getText().toString();
            b5=btn5.getText().toString();
            b6=btn6.getText().toString();
            b7=btn7.getText().toString();
            b8=btn8.getText().toString();
            b9=btn9.getText().toString();



        }




    }
}