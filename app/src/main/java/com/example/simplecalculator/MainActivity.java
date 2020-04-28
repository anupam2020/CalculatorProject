package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

            private EditText num1;
            private EditText num2;
            private Button zero0;
            private Button one1;
            private Button two2;
            private Button three3;
            private Button four4;
            private Button five5;
            private Button six6;
            private Button seven7;
            private Button eight8;
            private Button nine9;
            private Button plus;
            private Button minus;
            private Button into;
            private Button divide;
            private Button power;
            private Button erase;
            private TextView result;
            private Button close;
            long n1,n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.etNum1);
        num2 = (EditText) findViewById(R.id.etNum2);
        zero0 = (Button) findViewById(R.id.zero);
        one1 = (Button) findViewById(R.id.one);
        two2 = (Button) findViewById(R.id.two);
        three3 = (Button) findViewById(R.id.three);
        four4 = (Button) findViewById(R.id.four);
        five5 = (Button) findViewById(R.id.five);
        six6 = (Button) findViewById(R.id.six);
        seven7 = (Button) findViewById(R.id.seven);
        eight8 = (Button) findViewById(R.id.eight);
        nine9 = (Button) findViewById(R.id.nine);
        plus = (Button) findViewById(R.id.add);
        minus = (Button) findViewById(R.id.sub);
        into = (Button) findViewById(R.id.mul);
        divide = (Button) findViewById(R.id.div);
        power = (Button) findViewById(R.id.pow);
        erase = (Button) findViewById(R.id.AC);
        result = (TextView) findViewById(R.id.tvAnswer);
        close = (Button) findViewById(R.id.exit);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { // API 21
            num1.setShowSoftInputOnFocus(false);
        } else { // API 11-20
            num1.setTextIsSelectable(true);
        }


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { // API 21
            num2.setShowSoftInputOnFocus(false);
        } else { // API 11-20
            num2.setTextIsSelectable(true);
        }



        plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if((num1.getText().toString().equals(null) || num2.getText().toString().equals(null))||(num1.getText().toString().equals("") || num2.getText().toString().equals("")))
                    {
                        String res="Invalid Input";
                        result.setText(res);

                    }
                    else {
                        n1 = Long.parseLong(num1.getText().toString());
                        n2 = Long.parseLong(num2.getText().toString());
                        long sum = n1 + n2;
                        result.setText("= " + String.valueOf(sum));
                    }


                }
                }
            );



            minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if((num1.getText().toString().equals(null) || num2.getText().toString().equals(null))||(num1.getText().toString().equals("") || num2.getText().toString().equals("")))
                    {
                        String res="Invalid Input";
                        result.setText(res);

                    }
                    else {
                        n1 = Long.parseLong(num1.getText().toString());
                        n2 = Long.parseLong(num2.getText().toString());
                        long diff = n1 - n2;
                        result.setText("= " + String.valueOf(diff));

                    }



                }
            });

            into.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if((num1.getText().toString().equals(null) || num2.getText().toString().equals(null))||(num1.getText().toString().equals("") || num2.getText().toString().equals("")))
                    {
                        String res="Invalid Input";
                        result.setText(res);

                    }
                    else {
                        n1 = Long.parseLong(num1.getText().toString());
                        n2 = Long.parseLong(num2.getText().toString());
                        long multi = n1 * n2;
                        if (multi <= Math.pow(2, 64))
                            result.setText("= " + String.valueOf(multi));
                        else
                            result.setText("Invalid!");

                    }


                }
            });

            divide.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double n3,n4;

                    if((num1.getText().toString().equals(null) || num2.getText().toString().equals(null))||(num1.getText().toString().equals("") || num2.getText().toString().equals("")))
                    {
                        String res="Invalid Input";
                        result.setText(res);

                    }
                    else {
                        n3 = Double.parseDouble(num1.getText().toString());
                        n4 = Double.parseDouble(num2.getText().toString());
                        if(n4==0)
                        {
                            result.setText("Invalid Input");
                        }
                        else if(n3==0)
                        {
                            result.setText("= 0");
                        }
                        else {
                            double divide = (double) (n3 / n4);
                            result.setText("= " + String.valueOf(divide));
                        }
                    }



                }
            });

            erase.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    num1.setText("");
                    num2.setText("");
                    result.setText("0");
                }
            });

            power.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if((num1.getText().toString().equals(null) || num2.getText().toString().equals(null))||(num1.getText().toString().equals("") || num2.getText().toString().equals("")))
                    {
                        String res="Invalid Input";
                        result.setText(res);

                    }
                    else {
                        n1 = Long.parseLong(num1.getText().toString());
                        n2 = Long.parseLong(num2.getText().toString());
                        long p = (long) Math.pow(n1, n2);
                        if (p <=  (long) Math.pow(2,62))
                            result.setText("= " + String.valueOf(p));
                        else
                            result.setText("Invalid");
                    }



                }
            });


            num1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    zero0.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num1.setText(num1.getText().toString() + "0");

                        }
                    });
                    one1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num1.setText(num1.getText().toString() + "1");

                        }
                    });
                    two2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num1.setText(num1.getText().toString() + "2");

                        }
                    });
                    three3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num1.setText(num1.getText().toString() + "3");

                        }
                    });
                    four4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num1.setText(num1.getText().toString() + "4");

                        }
                    });
                    five5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num1.setText(num1.getText().toString() + "5");

                        }
                    });
                    six6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num1.setText(num1.getText().toString() + "6");

                        }
                    });
                    seven7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num1.setText(num1.getText().toString() + "7");

                        }
                    });
                    eight8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num1.setText(num1.getText().toString() + "8");

                        }
                    });
                    nine9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num1.setText(num1.getText().toString() + "9");

                        }
                    });

                    num1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                        @Override
                        public void onFocusChange(View v, boolean hasFocus) {
                            if (hasFocus) {
                                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                                imm.hideSoftInputFromWindow(num1.getWindowToken(), 0);
                            }
                        }
                    });


                }
            });

            num2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    zero0.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num2.setText(num2.getText().toString() + "0");

                        }
                    });
                    one1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num2.setText(num2.getText().toString() + "1");

                        }
                    });
                    two2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num2.setText(num2.getText().toString() + "2");

                        }
                    });
                    three3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num2.setText(num2.getText().toString() + "3");

                        }
                    });
                    four4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num2.setText(num2.getText().toString() + "4");

                        }
                    });
                    five5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num2.setText(num2.getText().toString() + "5");

                        }
                    });
                    six6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num2.setText(num2.getText().toString() + "6");

                        }
                    });
                    seven7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num2.setText(num2.getText().toString() + "7");

                        }
                    });
                    eight8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num2.setText(num2.getText().toString() + "8");

                        }
                    });
                    nine9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            num2.setText(num2.getText().toString() + "9");

                        }
                    });

                    num2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                        @Override
                        public void onFocusChange(View v, boolean hasFocus) {
                            if (hasFocus) {
                                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                                imm.hideSoftInputFromWindow(num2.getWindowToken(), 0);
                            }
                        }
                    });


                }
            });

            close.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             finish();
                                             System.exit(0);
                                         }
                                     }
            );


    }
    }

