package com.example.sample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editTextLacagta;
    Button button5;
    Button button10;
    Button button15;
    Button button25;
    Button button50;
    Button buttonCustom;
    EditText editTextNP;

    Button buttonReset;


    TextView tip2;
    TextView tipPP;

    String lacagta;
    String numPeaple;

    String PercentCustom;


    String custom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextLacagta = findViewById(R.id.editTextTextLacagta);

        tip2 = findViewById(R.id.textViewTip);
        tipPP = findViewById(R.id.textViewTipPP);

        editTextNP = findViewById(R.id.editTextNP);

        button5 = findViewById(R.id.button55);
        button10 = findViewById(R.id.button1010);
        button15 = findViewById(R.id.button1515);
        button25 = findViewById(R.id.button2525);
        button50 = findViewById(R.id.button5050);
        buttonReset = findViewById(R.id.buttonReset);

        buttonCustom = findViewById(R.id.buttoncCustom);


        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editTextLacagta.setText("");
                editTextNP.setText("");



            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lacagta = editTextLacagta.getText().toString();
                numPeaple = editTextNP.getText().toString();


                if (lacagta.matches("") || numPeaple.matches("")){
                    Toast.makeText(MainActivity.this, "Waxbaa khaldan! Faldan buuxi meelaha banaan ", Toast.LENGTH_SHORT).show();
                }else {

                    Integer lacagPP = Integer.parseInt(numPeaple);

                    Integer lacagta2 = Integer.parseInt(lacagta);

                    int percent = 5;

                    float tip = (float)percent/lacagta2*100;

                    String tip3 = Float.toString(tip);

                    float numberPeaple2 = (float)lacagPP;

                    float total2 = tip*numberPeaple2;

                    String total3 = Float.toString(total2);


                    tip2.setText("$"+tip3);
                    tipPP.setText("$"+total3);

                }



            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lacagta = editTextLacagta.getText().toString();
                numPeaple = editTextNP.getText().toString();


                if (lacagta.matches("") || numPeaple.matches("")){
                    Toast.makeText(MainActivity.this, "Waxbaa khaldan! Faldan buuxi meelaha banaan ", Toast.LENGTH_SHORT).show();
                }else {


                    Integer lacagPP = Integer.parseInt(numPeaple);

                    Integer lacagta2 = Integer.parseInt(lacagta);

                    int percent = 10;

                    float tip = (float)percent/lacagta2*100;

                    String tip3 = Float.toString(tip);

                    float numberPeaple2 = (float)lacagPP;

                    float total2 = tip*numberPeaple2;

                    String total3 = Float.toString(total2);

                    tip2.setText("$"+tip3);
                    tipPP.setText("$"+total3);


                }



            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lacagta = editTextLacagta.getText().toString();
                numPeaple = editTextNP.getText().toString();


                if (lacagta.matches("") || numPeaple.matches("")){
                    Toast.makeText(MainActivity.this, "Waxbaa khaldan! Faldan buuxi meelaha banaan ", Toast.LENGTH_SHORT).show();
                }else {


                    Integer lacagPP = Integer.parseInt(numPeaple);

                    Integer lacagta2 = Integer.parseInt(lacagta);

                    int percent = 15;

                    float tip = (float)percent/lacagta2*100;

                    String tip3 = Float.toString(tip);

                    float numberPeaple2 = (float)lacagPP;

                    float total2 = tip*numberPeaple2;

                    String total3 = Float.toString(total2);

                    tip2.setText("$"+tip3);
                    tipPP.setText("$"+total3);


                }



            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lacagta = editTextLacagta.getText().toString();
                numPeaple = editTextNP.getText().toString();


                if (lacagta.matches("") || numPeaple.matches("")){
                    Toast.makeText(MainActivity.this, "Waxbaa khaldan! Faldan buuxi meelaha banaan ", Toast.LENGTH_SHORT).show();
                }else {


                    Integer lacagPP = Integer.parseInt(numPeaple);

                    Integer lacagta2 = Integer.parseInt(lacagta);

                    int percent = 25;

                    float tip = (float)percent/lacagta2*100;

                    String tip3 = Float.toString(tip);

                    float numberPeaple2 = (float)lacagPP;

                    float total2 = tip*numberPeaple2;

                    String total3 = Float.toString(total2);

                    tip2.setText("$"+tip3);
                    tipPP.setText("$"+total3);


                }



            }
        });

        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lacagta = editTextLacagta.getText().toString();
                numPeaple = editTextNP.getText().toString();


                if (lacagta.matches("") && numPeaple.matches("")){
                    Toast.makeText(MainActivity.this, "Waxbaa khaldan! Faldan buuxi meelaha banaan ", Toast.LENGTH_SHORT).show();
                }else {


                    Integer lacagPP = Integer.parseInt(numPeaple);

                    Integer lacagta2 = Integer.parseInt(lacagta);

                    int percent = 50;

                    float tip = (float)percent/lacagta2*100;

                    String tip3 = Float.toString(tip);

                    float numberPeaple2 = (float)lacagPP;

                    float total2 = tip*numberPeaple2;

                    String total3 = Float.toString(total2);

                    tip2.setText("$"+tip3);
                    tipPP.setText("$"+total3);


                }



            }
        });


        buttonCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setTitle("Geli xadiga percentage-ka !");

                EditText lacagtaCustomInput = new EditText(MainActivity.this);
                lacagtaCustomInput.setInputType(InputType.TYPE_CLASS_NUMBER);

                alert.setView(lacagtaCustomInput);

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                        lacagta = editTextLacagta.getText().toString();
                        numPeaple = editTextNP.getText().toString();

                        PercentCustom =lacagtaCustomInput.getText().toString();



                        Toast.makeText(MainActivity.this, PercentCustom+"", Toast.LENGTH_SHORT).show();


                        if (lacagta.matches("") || numPeaple.matches("")){
                            Toast.makeText(MainActivity.this, "Waxbaa khaldan! Faldan buuxi meelaha banaan ", Toast.LENGTH_SHORT).show();
                        }else {

                            Integer customPercentage = Integer.parseInt(PercentCustom);

                            Integer lacagPP = Integer.parseInt(numPeaple);

                            Integer lacagta2 = Integer.parseInt(lacagta);

                            int percent = customPercentage;

                            float tip = (float)percent/lacagta2*100;

                            String tip3 = Float.toString(tip);

                            float numberPeaple2 = (float)lacagPP;

                            float total2 = tip*numberPeaple2;

                            String total3 = Float.toString(total2);

                            tip2.setText("$"+tip3);
                            tipPP.setText("$"+total3);


                        }

                    }
                });

                alert.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                    }
                });

                alert.show();

            }
        });


    }


}