package de.tu_clausthal.in.informatikwerkstatt.deinepizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity3 extends AppCompatActivity {

    boolean gross, familie;
    RadioGroup radiog;
    RadioButton grossR, familieR;
    CheckBox annanas, basilikum, brokkoli, champignon, chili, spinat, thunfisch, tomate, fetakaese, knoblauch, mais, oliven, morzarella, haenchen, gorgonzola, salami, schinken, redonion;
    float preis = (float) 5.5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        RadioGroup radiog = (RadioGroup) findViewById(R.id.radiog);
        RadioButton grossR = (RadioButton) findViewById(R.id.grossR);
        RadioButton familieR = (RadioButton) findViewById(R.id.familieR);

        grossR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gross = true;
            }
        });

        familieR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                familie = true;
            }
        });

        annanas = (CheckBox) findViewById(R.id. annanas);
        if (annanas.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        basilikum = (CheckBox) findViewById(R.id.basilikum);
        if (basilikum.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        brokkoli= (CheckBox) findViewById(R.id.brokkoli);
        if (brokkoli.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.8) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.6);
            }
        }

        champignon = (CheckBox) findViewById(R.id.champignon);
        if (champignon.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        chili = (CheckBox) findViewById(R.id.chili);
        if (chili.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        spinat = (CheckBox) findViewById(R.id.spinat);
        if (spinat.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        thunfisch = (CheckBox) findViewById(R.id.thunfisch);
        if (thunfisch.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.8) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.6);
            }
        }

        tomate = (CheckBox) findViewById(R.id.tomate);
        if (tomate.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.4) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.3);
            }
        }

        fetakaese = (CheckBox) findViewById(R.id.fetakaese);
        if (fetakaese.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        knoblauch = (CheckBox) findViewById(R.id.knoblauch);
        if (knoblauch.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.4) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.2);
            }
        }

        mais = (CheckBox) findViewById(R.id.mais);
        if (mais.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.8) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        oliven = (CheckBox) findViewById(R.id.oliven);
        if (oliven.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.4);
            }
        }

        morzarella = (CheckBox) findViewById(R.id.morzarella);
        if (morzarella.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.9) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.6);
            }
        }

        haenchen = (CheckBox) findViewById(R.id.haenchen);
        if (haenchen.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 1.5) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.8);
            }
        }

        gorgonzola = (CheckBox) findViewById(R.id.gorgonzola);
        if (gorgonzola.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 1.0) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.6);
            }
        }

        salami = (CheckBox) findViewById(R.id.salami);
        if (salami.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 1.0) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.6);
            }
        }

        schinken = (CheckBox) findViewById(R.id.schinken);
        if (schinken.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 1.0) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.6);
            }
        }

        redonion = (CheckBox) findViewById(R.id.redonion);
        if (redonion.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.8) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }
        

    }
}
