package com.example.seunghyun.calculator;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Operation oper = new Operation();
    InputOutput io = new InputOutput();

    TextView txtResult;
    EditText edtInput;
    String val = "";
    String result="";
    String log="";

    Button btnNum0;
    Button btnNum1;
    Button btnNum2;
    Button btnNum3;
    Button btnNum4;
    Button btnNum5;
    Button btnNum6;
    Button btnNum7;
    Button btnNum8;
    Button btnNum9;

    Button btnRes;
    Button btnHis;
    Button btnDel;

    Button btnMod;
    Button btndivi;
    Button btnMult;
    Button btnMinu;
    Button btnPlus;

    Button btnFac;
    Button btnRoot;
    Button btnLog;
    Button btnPow;
    Button btnExp;

    Button btnSin;
    Button btnCos;
    Button btnTan;

    Button btnDot;
    Button btnResult;

    Button btnBracR;
    Button btnBracL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = (TextView) findViewById(R.id.resultTextView);
        edtInput = (EditText) findViewById(R.id.workingsEditText);

        btnNum0 = (Button) findViewById(R.id.btnzero);
        btnNum1 = (Button) findViewById(R.id.btnone);
        btnNum2 = (Button) findViewById(R.id.btntwo);
        btnNum3 = (Button) findViewById(R.id.btnthree);
        btnNum4 = (Button) findViewById(R.id.btnfour);
        btnNum5 = (Button) findViewById(R.id.btnfive);
        btnNum6 = (Button) findViewById(R.id.btnsix);
        btnNum7 = (Button) findViewById(R.id.btnseven);
        btnNum8 = (Button) findViewById(R.id.btneight);
        btnNum9 = (Button) findViewById(R.id.btnnine);

        btnDot = (Button) findViewById(R.id.btnpoint);

        btnResult = (Button) findViewById(R.id.btnequal);
        btnHis = (Button) findViewById(R.id.btnHIS);
        btnDel = (Button) findViewById(R.id.btndel);
        btnRes = (Button) findViewById(R.id.btnRe);

        //btnBracRight = (Button) findViewById(R.id.btnRightBrac);
        //btnBracLeft = (Button) findViewById(R.id.btnLeftBrac);

        btnMod = (Button) findViewById(R.id.btnmod);
        btndivi = (Button) findViewById(R.id.btndiv);
        btnMult = (Button) findViewById(R.id.btnmult);
        btnMinu = (Button) findViewById(R.id.btnmin);
        btnPlus = (Button) findViewById(R.id.btnplus);

        btnSin = (Button) findViewById(R.id.btnsin);
        btnCos = (Button) findViewById(R.id.btncos);
        btnTan = (Button) findViewById(R.id.btntan);

        btnFac = (Button) findViewById(R.id.btnfac);
        btnLog = (Button) findViewById(R.id.btnlog);
        btnRoot = (Button) findViewById(R.id.btnroot);
        btnPow = (Button) findViewById(R.id.btnpow);
        btnExp = (Button) findViewById(R.id.btnEXP);

        btnBracL = (Button) findViewById(R.id.btnLeftBrac);
        btnBracR = (Button) findViewById(R.id.btnRightBrac);

        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtInput.setText("");
            }
        });

        btnHis.setOnClickListener(new View.OnClickListener() {

            public static final int sub = 1001;

            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                //intent.putExtra("expression",val);
                //intent.putExtra("result",result);
                intent.putExtra("log",log);
                startActivity(intent);
            }
        });



        btnBracL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+")");

            }
        });

        btnBracR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"(");
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = edtInput.getText().toString();
                if(val.length()!=0) {
                    val = val.substring(0, val.length() - 1);
                    edtInput.setText(val);
                }
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"+");
                //expression = edtInput.getText().toString()
            }
        });

        btnMinu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"-");
                //expression = edtInput.getText().toString()
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"*");
                //expression = edtInput.getText().toString()
            }
        });

        btndivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"/");
                //expression = edtInput.getText().toString()
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"%");
                //expression = edtInput.getText().toString()
            }
        });

        btnFac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"!");
                //expression = edtInput.getText().toString()
            }
        });
//
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"log");
                //expression = edtInput.getText().toString()
            }
        });
//
        btnRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"√");
                //expression = edtInput.getText().toString()
            }
        });

        btnPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"^");
            }
        });

        btnExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"e");
            }
        });


        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"sin");
                //expression = edtInput.getText().toString()
            }
        });
//
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"cos");
                //expression = edtInput.getText().toString()
            }
        });
//
        btnTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"tan");
                //expression = edtInput.getText().toString()
            }
        });



        btnNum0.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"0");
            }

        });

        btnNum1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"1");
            }

        });

        btnNum2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"2");
            }
        });

        btnNum3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"3");
            }

        });

        btnNum4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"4");
            }

        });
        btnNum5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"5");
            }

        });
        btnNum6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"6");
            }

        });
        btnNum7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"7");
            }

        });
        btnNum8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"8");
            }

        });
        btnNum9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+"9");
            }

        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtInput.setText(edtInput.getText()+".");
            }
        });

        btnResult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                val = edtInput.getText().toString();
                val = val.replace("sin","s");
                val = val.replace("cos","c");
                val = val.replace("tan","t");
                val = val.replace("log","l");
                log = log.concat(val);
                result = io.expression(val);
                log = log.concat("="+result+"\n");
                txtResult.setText(result);
            }
        });
    }
}
