package com.example.calculator1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

Button btnclear, btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
Button btn_multiply, btn_divide, btn_add, btn_minus, btn_point, btn_bracket;
TextView textview, result1;
String numbers;
Boolean bracketopen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 bracketopen=false;


        btnclear= (Button) findViewById(R.id.btndelete);
        textview= (TextView) findViewById(R.id. textview1);
        result1=(TextView) findViewById(R.id.result);
        btn_0=(Button) findViewById(R.id.btn0);
        btn_1=(Button) findViewById(R.id.btn1);
        btn_2=(Button) findViewById(R.id.btn2);
        btn_3=(Button) findViewById(R.id.btn3);
        btn_4=(Button) findViewById(R.id.btn4);
        btn_5=(Button) findViewById(R.id.btn5);
        btn_6=(Button) findViewById(R.id.btn6);
        btn_7=(Button) findViewById(R.id.btn7);
        btn_8=(Button) findViewById(R.id.btn8);
        btn_9=(Button) findViewById(R.id.btn9);

        btn_multiply=(Button) findViewById(R.id.btnmultiply);
        btn_divide=(Button) findViewById(R.id.btndiv);
        btn_add=(Button) findViewById(R.id.btnadd);
        btn_minus=(Button) findViewById(R.id.btnminus);
        btn_point=(Button) findViewById(R.id.btnpoint);
        btn_bracket=(Button) findViewById(R.id.btnbracket);

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText(" ");
                result1.setText(" ");
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers= textview.getText().toString();
                textview.setText(numbers+"0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers= textview.getText().toString();
                textview.setText(numbers+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers= textview.getText().toString();
                textview.setText(numbers+"2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers= textview.getText().toString();
                textview.setText(numbers+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers= textview.getText().toString();
                textview.setText(numbers+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers= textview.getText().toString();
                textview.setText(numbers+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers= textview.getText().toString();
                textview.setText(numbers+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers= textview.getText().toString();
                textview.setText(numbers+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers= textview.getText().toString();
                textview.setText(numbers+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers= textview.getText().toString();
                textview.setText(numbers+"9");
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers= textview.getText().toString();
                textview.setText(numbers+"/");
            }
        });

        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers= textview.getText().toString();
                textview.setText(numbers+"X");
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers= textview.getText().toString();
                textview.setText(numbers+"+");
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers= textview.getText().toString();
                textview.setText(numbers+"-");
            }
        });

        btn_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers= textview.getText().toString();
                textview.setText(numbers+".");
            }
        });

        btn_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bracketopen){
                    numbers= textview.getText().toString();
                    textview.setText(numbers+")");
                    bracketopen= false;
                }
                else {
                    numbers= textview.getText().toString();
                    textview.setText(numbers+"(");
                    bracketopen= true;
                }
            }
        });

    }
}
