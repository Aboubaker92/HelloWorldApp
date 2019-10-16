package com.example.helloworldapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Erzeuge Knopf
        Button IDKnopf = (Button) findViewById(R.id.IDKnopf);


        //Setze Listener
        //IDKnopf.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                //Editierbares Textfeld für die erste Zahl
                EditText IDZahlEins = (EditText) findViewById(R.id.IDZahlEins);
                //Editierbares Textfeld für die zweit Zahl
                EditText IDZahlZwei = (EditText) findViewById(R.id.IDZahlZwei);
                //Nicht editierbares Textfeld für das Ergebniss
                TextView resultTextView = (TextView) findViewById(R.id.IDTextView);

                //Wandle Inhalt erstes Textfeldes in Typ Integer um
                int Zahl1 = Integer.parseInt(IDZahlEins.getText().toString());
                //Wandle Inhalt zweites Textfeldes in Typ Integer um
                int Zahl2 = Integer.parseInt(IDZahlZwei.getText().toString());
                //Ergebniss berechnen
                int result = Zahl1 + Zahl2;
                //Setzte das Ergebniss in das Ergebniss-Textfeld ein
                resultTextView.setText(result + "");

            }
        });
    }
}


