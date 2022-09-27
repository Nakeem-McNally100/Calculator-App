package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button minus;
    private Button multiply;
    private Button divide;
    private Button decimalpoint;
    private Button bracket;
    private Button modulus;
    private Button equal;
    private Button negative;
    private Button clear;
    private Button clearbtn;
    private TextView result, resultTop;
    private char operationval;

    private  final char ADDITION = '+';
    private  final char SUBTRACTION = '-';
    private  final char MULTIPLICATION = '*';
    private  final char DIVISION = '/';
    private  final char MODULUS = '%';
    private  final char EQUALS  = '=';

    private double val1 = Double.NaN;
    private  double val2;
    private float value1 = 0;
    private  float value2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIWidgets();

        /// Onclicklistener set for numbers
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "1");
            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "4");
            }
        });


        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "5");
            }
        });


        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "6");
            }
        });


        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "7");
            }
        });


        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "8");
            }
        });



        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "9");
            }
        });

        decimalpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().toString().isEmpty() == true){
                    result.setText("");

                }else {
                    if (result.getText().toString().contains(".") == false) {
                        result.setText(result.getText() + ".");
                    }
                }
            }
        });


        //// end of setup for numbers
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(result.getText().length()>0) {

                    result.setText(result.getText().subSequence(0, result.getText().length() - 1));

                }else{
                    result.setText(null);
                    resultTop.setText(null);
                }

            }
        });



        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.setText(null);
                resultTop.setText(null);
            }
        });



        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(result.getText().toString().isEmpty() == true){
                    result.setText("");

                }else {
                    float val = Float.parseFloat(result.getText() + "");
                    //String neg = result.getText().toString();

                    result.setText(val * -1 + "");

                    /*
                    if(neg.substring(0,1).contains("-")) {
                        result.setText(null);
                        result.setText(neg.substring(1,neg.length()-1));
                    }else {
                        result.setText(null);
                        result.setText("-" + neg);
                    }
                    */
                    }

            }
        });


        // onclicklistener setup for operators
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().toString().isEmpty() == true && resultTop.getText().toString().isEmpty() == true){
                    result.setText("");

                }else{
                    if(resultTop.getText().toString().isEmpty() == true){
                        value1 = Float.parseFloat(result.getText() + "");
                        operationval = ADDITION;
                        resultTop.setText(null);
                        resultTop.setText(result.getText().toString() + " +");
                        result.setText(null);


                    }else{

                        //Toast.makeText(MainActivity.this,"We're here to switch ",Toast.LENGTH_SHORT).show();
                        resultTop.setText(resultTop.getText().toString().substring(0,resultTop.getText().toString().length()-1) + "+");
                        operationval = ADDITION;
                    }

                }
            }
        });


        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().toString().isEmpty() == true && resultTop.getText().toString().isEmpty() == true){
                    result.setText("");

                }else{
                    if(resultTop.getText().toString().isEmpty() == true){
                        value1 = Float.parseFloat(result.getText() + "");
                        operationval = SUBTRACTION;
                        resultTop.setText(null);
                        resultTop.setText(result.getText().toString() + " -");
                        result.setText(null);
                    }else{
                        resultTop.setText(resultTop.getText().toString().substring(0,resultTop.getText().toString().length()-1) + "-");
                        operationval = SUBTRACTION;
                    }

                }
            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().toString().isEmpty() == true && resultTop.getText().toString().isEmpty() == true){
                    result.setText("");

                }else{

                    if(resultTop.getText().toString().isEmpty() == true){
                        value1 = Float.parseFloat(result.getText() + "");
                        operationval = MULTIPLICATION;
                        resultTop.setText(null);
                        resultTop.setText(result.getText().toString() + " x");
                        result.setText(null);
                    }else{
                        resultTop.setText(resultTop.getText().toString().substring(0,resultTop.getText().toString().length()-1) + "x");
                        operationval = MULTIPLICATION;
                    }

                }
            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().toString().isEmpty() == true && resultTop.getText().toString().isEmpty() == true){
                    result.setText("");

                }else{

                    if(resultTop.getText().toString().isEmpty() == true){
                        value1 = Float.parseFloat(result.getText() + "");
                        operationval = DIVISION;
                        resultTop.setText(null);
                        resultTop.setText(result.getText().toString() + " /");
                        result.setText(null);
                    }else{
                        resultTop.setText(resultTop.getText().toString().substring(0,resultTop.getText().toString().length()-1) + "/");
                        operationval = DIVISION;
                    }

            }
            }
        });


        modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().toString().isEmpty() == true && resultTop.getText().toString().isEmpty() == true){
                    result.setText("");

                }else{
                    if(resultTop.getText().toString().isEmpty() == true){
                        value1 = Float.parseFloat(result.getText() + "");
                        operationval = MODULUS;
                        resultTop.setText(null);
                        resultTop.setText(result.getText().toString() + " %");
                        result.setText(null);
                    }else{
                        resultTop.setText(resultTop.getText().toString().substring(0,resultTop.getText().toString().length()-1) + "%");
                        operationval = MODULUS;
                    }

                }
            }

        });
        //end of setup for operators

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{

                    value2 = Float.parseFloat(result.getText() + "");

                    if (operationval == ADDITION) {
                        resultTop.setText(null);
                        result.setText(value1 + value2 + "");
                        operationval = 'n';

                    }


                    if (operationval == SUBTRACTION) {
                        resultTop.setText(null);
                        result.setText(value1 - value2 + "");
                        operationval = 'n';

                    }

                    if (operationval == MULTIPLICATION) {
                        resultTop.setText(null);
                        result.setText(value1 * value2 + "");
                        operationval = 'n';

                    }

                    if (operationval == DIVISION) {
                        result.setText(value1 / value2 + "");
                        resultTop.setText(null);
                        operationval = 'n';

                    }

                    if (operationval == MODULUS) {
                        result.setText(value1 % value2 + "");
                        resultTop.setText(null);
                        operationval = 'n';

                    }

                }catch(Exception e){

                }
            }
        });


            

    }

    /*
    private void calculate(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(result.getText().toString());

        }


    }

     */



    private void setupUIWidgets(){
        add = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);
        decimalpoint = (Button)findViewById(R.id.dp);
        bracket = (Button)findViewById(R.id.plusOrminus);
        modulus = (Button)findViewById(R.id.mod);
        equal = (Button)findViewById(R.id.equal);
        negative = (Button)findViewById(R.id.plusOrminus);
        clear = (Button)findViewById(R.id.cancel);
        clearbtn = (Button)findViewById(R.id.clearbtn);
        result = (TextView) findViewById(R.id.result);
        resultTop = (TextView) findViewById(R.id.resulttop);


        zero = (Button)findViewById(R.id.number0);
        one = (Button)findViewById(R.id.number1);
        two = (Button)findViewById(R.id.number2);
        three = (Button)findViewById(R.id.number3);
        four = (Button)findViewById(R.id.number4);
        five = (Button)findViewById(R.id.number5);
        six = (Button)findViewById(R.id.number6);
        seven = (Button)findViewById(R.id.number7);
        eight = (Button)findViewById(R.id.number8);
        nine = (Button)findViewById(R.id.number9);




    }
}