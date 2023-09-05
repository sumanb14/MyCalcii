package com.example.calculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calculator.R;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAdd,btnSub,btnMul,btnDiv,btnEqual,btnDot,btnClear;
    EditText display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 =findViewById(R.id.b1);
        btn2 =findViewById(R.id.b2);
        btn3 =findViewById(R.id.b3);
        btn4 =findViewById(R.id.b4);
        btn5 =findViewById(R.id.b5);
        btn6 =findViewById(R.id.b6);
        btn7 =findViewById(R.id.b7);
        btn8 =findViewById(R.id.b8);
        btn9 =findViewById(R.id.b9);
        btn0 =findViewById(R.id.b0);
        btnAdd =findViewById(R.id.badd);
        btnSub =findViewById(R.id.bsub);
        btnMul =findViewById(R.id.bmul);
        btnDiv =findViewById(R.id.bdiv);
        btnDot =findViewById(R.id.bdot);
        btnEqual=findViewById(R.id.beq);
        btnClear=findViewById(R.id.bclr);
        display=findViewById(R.id.dis);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                display.append("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("0");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("+");
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("-");
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("x");
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append("/");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.append(".");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = display.getText().toString();

                if(data.contains("-")){
                    String operands[] = data.split("-");
                    double op1 = Double.parseDouble(operands[0]);
                    double op2 = Double.parseDouble(operands[1]);
                    double res = op1-op2; display.setText(String.valueOf(res));}
                if(data.contains("x")){
                    String operands[] = data.split("x");
                    double op1 = Double.parseDouble(operands[0]);
                    double op2 = Double.parseDouble(operands[1]);
                    double res = op1*op2;
                    display.setText(String.valueOf(res));
                }
                if(data.contains("/")){

                    String operands[] = data.split("/");
                    double op1 = Double.parseDouble(operands[0]);
                    double op2 = Double.parseDouble(operands[1]);
                    if(op2==0){
                        Toast.makeText(MainActivity.this,
                                "Divide by zero is not possible",
                                Toast.LENGTH_SHORT).show();
                    }
                    double res = op1/op2;
                    display.setText(String.valueOf(res));
                }
                if(data.contains("+")){

                    String operands[] =data.split(Pattern.quote("+"));
                    double op1 = Double.parseDouble(operands[0]);
                    double op2 = Double.parseDouble(operands[1]);
                    double res = op1+op2;
                    display.setText(String.valueOf(res));
                }
            }
        });
    }
}