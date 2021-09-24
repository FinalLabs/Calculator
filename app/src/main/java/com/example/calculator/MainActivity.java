package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String operator;
    double first_num;
    double second_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txv = findViewById(R.id.output);

        Button btn1 = findViewById(R.id.one);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txv.append("1");
            }
        });

        Button btn2 = findViewById(R.id.two);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txv.append("2");
            }
        });

        Button btn3 = findViewById(R.id.three);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txv.append("3");
            }
        });

        Button btn4 = findViewById(R.id.four);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txv.append("4");
            }
        });

        Button btn5 = findViewById(R.id.five);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txv.append("5");
            }
        });

        Button btn6 = findViewById(R.id.six);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txv.append("6");
            }
        });

        Button btn7 = findViewById(R.id.seven);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txv.append("7");
            }
        });

        Button btn8 = findViewById(R.id.eight);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txv.append("8");
            }
        });

        Button btn9 = findViewById(R.id.nine);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txv.append("9");
            }
        });

        Button btn0 = findViewById(R.id.zero);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txv.append("0");
            }
        });

        Button clearbtn = findViewById(R.id.clear);
        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txv.setText("");
            }
        });

        Button btnadd = findViewById(R.id.add);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = txv.getText().toString();
                first_num = Double.parseDouble(first);
                operator = "+";
                txv.setText("");
            }
        });

        Button btnsub = findViewById(R.id.sub);
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = txv.getText().toString();
                first_num = Double.parseDouble(first);
                operator = "-";
                txv.setText("");
            }
        });

        Button btnmul = findViewById(R.id.mul);
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = txv.getText().toString();
                first_num = Double.parseDouble(first);
                operator = "*";
                txv.setText("");
            }
        });

        Button btndiv = findViewById(R.id.div);
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = txv.getText().toString();
                first_num = Double.parseDouble(first);
                operator = "/";
                txv.setText("");
            }
        });

        Button btnneg = findViewById(R.id.neg);
        btnneg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txv.append("-");
            }
        });

        Button btndec = findViewById(R.id.dec);
        btndec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txv.append(".");
            }
        });

        Button btnsolve = findViewById(R.id.solve);
        btnsolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String second = txv.getText().toString();
                second_num = Double.parseDouble(second);

                double result;
                String strresult;

                switch(operator)
                {
                    case "+":
                        result = first_num + second_num;
                        strresult = String.valueOf(result);
                        txv.setText(strresult);
                        break;
                    case "-":
                        result = first_num - second_num;
                        strresult = String.valueOf(result);
                        txv.setText(strresult);
                        break;
                    case "*":
                        result = first_num * second_num;
                        strresult = String.valueOf(result);
                        txv.setText(strresult);
                        break;
                    case "/":
                        result = first_num / second_num;
                        strresult = String.valueOf(result);
                        txv.setText(strresult);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}