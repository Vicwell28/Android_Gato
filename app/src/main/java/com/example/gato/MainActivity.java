package com.example.gato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int Turno = 1;
    String Letra = "";
    Button idbtn1, idbtn2, idbtn3, idbtn4, idbtn5, idbtn6, idbtn7, idbtn8, idbtn9, idbtn10, idbtn11;
    int idbtn;
    TextView idtxt;
    String Chbtn1, Chbtn2, Chbtn3, Chbtn4, Chbtn5, Chbtn6, Chbtn7, Chbtn8, Chbtn9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Button b = findViewById(R.id.btn1);
        b.setText("Hola");
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lo que haces esto es crear un objeto de tipo evento y
                // cuando tu lo cres vas a sobrescribir el evento onClick
                //ESTO NO ES RECOMENDABLE PORUQE HAY QUE PONERLE A CADA VIEW UN EVENTO UNO POR UNO
                //NO ES COMO CUANDO CREAS UN EVENTO CON UN IDENTIFICADRO.
            }
        });

        View.OnClickListener eve = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //este es con identificador
            }
        };

        b.setOnClickListener(eve); */

        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
        findViewById(R.id.btn5).setOnClickListener(this);
        findViewById(R.id.btn6).setOnClickListener(this);
        findViewById(R.id.btn7).setOnClickListener(this);
        findViewById(R.id.btn8).setOnClickListener(this);
        findViewById(R.id.btn9).setOnClickListener(this);
        findViewById(R.id.btn10).setOnClickListener(this);
        findViewById(R.id.btn11).setOnClickListener(this);

        idtxt = findViewById(R.id.txt1);
    }

    @Override
    public void onClick(View view) {



        Button b = (Button) view;

        idbtn = b.getId();
        idbtn1 = findViewById(R.id.btn1);
        idbtn2 = findViewById(R.id.btn2);
        idbtn3 = findViewById(R.id.btn3);
        idbtn4 = findViewById(R.id.btn4);
        idbtn5 = findViewById(R.id.btn5);
        idbtn6 = findViewById(R.id.btn6);
        idbtn7 = findViewById(R.id.btn7);
        idbtn8 = findViewById(R.id.btn8);
        idbtn9 = findViewById(R.id.btn9);
        idbtn10 = findViewById(R.id.btn10);
        idbtn11 = findViewById(R.id.btn11);



        Chbtn1 =  idbtn1.getText().toString();
        Chbtn2 =  idbtn2.getText().toString();
        Chbtn3 =  idbtn3.getText().toString();
        Chbtn4 =  idbtn4.getText().toString();
        Chbtn5 =  idbtn5.getText().toString();
        Chbtn6 =  idbtn6.getText().toString();
        Chbtn7 =  idbtn7.getText().toString();
        Chbtn8 =  idbtn8.getText().toString();
        Chbtn9 =  idbtn9.getText().toString();

        Letra = b.getText().toString();

        if(b == idbtn10){
                System.exit(0);
        }
        if(b == idbtn11){
            idbtn1.setText("");
            idbtn2.setText("");
            idbtn3.setText("");
            idbtn4.setText("");
            idbtn5.setText("");
            idbtn6.setText("");
            idbtn7.setText("");
            idbtn8.setText("");
            idbtn9.setText("");
        }
        if(Letra.isEmpty()){
            if(Turno == 1){

                b.setText("X");
                Turno = Turno + 1;



            }else if(Turno == 2){

                b.setText("O");
                Turno = Turno - 1;
              }
        }

        if(Chbtn1 == "X" && Chbtn2 == "X" && Chbtn2 == "X"){

            idtxt.setText("El Ganador Es: X");

        }else if(Chbtn4 == "X" && Chbtn5 == "X" && Chbtn6 == "X"){

            idtxt.setText("El Ganador Es: X");

        }else if(Chbtn7 == "X" && Chbtn8 == "X" && Chbtn9 == "X"){

            idtxt.setText("El Ganador Es: X");

        }else if(Chbtn1 == "X" && Chbtn4 == "X" && Chbtn7 == "X"){

            idtxt.setText("El Ganador Es: X");

        }else if(Chbtn2 == "X" && Chbtn5 == "X" && Chbtn8 == "X"){

            idtxt.setText("El Ganador Es: X");

        }else if(Chbtn3 == "X" && Chbtn5 == "X" && Chbtn9 == "X"){

            idtxt.setText("El Ganador Es: X");

        }else if(Chbtn7 == "X" && Chbtn5 == "X" && Chbtn3 == "X"){

            idtxt.setText("El Ganador Es: X");

        }else if(Chbtn1 == "X" && Chbtn5 == "X" && Chbtn9 == "X"){

            idtxt.setText("El Ganador Es: X");

        }





        if(Chbtn1 == "O" && Chbtn2 == "O" && Chbtn2 == "O"){

            idtxt.setText("El Ganador Es: O");

        }else if(Chbtn4 == "O" && Chbtn5 == "O" && Chbtn6 == "O"){

            idtxt.setText("El Ganador Es: O");

        }else if(Chbtn7 == "O" && Chbtn8 == "O" && Chbtn9 == "O"){

            idtxt.setText("El Ganador Es: O");

        }else if(Chbtn1 == "O" && Chbtn4 == "O" && Chbtn7 == "O"){

            idtxt.setText("El Ganador Es: O");

        }else if(Chbtn2 == "O" && Chbtn5 == "O" && Chbtn8 == "O"){

            idtxt.setText("El Ganador Es: O");

        }else if(Chbtn3 == "O" && Chbtn5 == "O" && Chbtn9 == "O"){

            idtxt.setText("El Ganador Es: O");

        }else if(Chbtn7 == "O" && Chbtn5 == "O" && Chbtn3 == "O"){

            idtxt.setText("El Ganador Es: O");

        }else if(Chbtn1 == "O" && Chbtn5 == "O" && Chbtn9 == "O"){

            idtxt.setText("El Ganador Es: O");

        }




        /*if(Letra == "X"){

            idtxt.setText("El Ganador Es: X");

        }else if(Letra == "O"){

            idtxt.setText("El Ganador Es: O");

        }else{

            if(Turno == 1){

                b.setText("X");
                Turno = Turno + 1;

            }else if(Turno == 2){

                b.setText("O");
                Turno = Turno - 1;

            }

        }*/

    }


}