package de.tu_clausthal.in.informatikwerkstatt.deinepizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity3 extends AppCompatActivity {

    boolean gross, familie;
    RadioGroup radiog;
    RadioButton grossR, familieR;
    CheckBox annanas, basilikum, brokkoli, champignon, chili, spinat, thunfisch, tomate, fetakaese, knoblauch, mais, oliven, morzarella, haenchen, gorgonzola, salami, schinken, redonion;
    float preis; //preisa1, preisa2, preisa3, preisa4, preisa5, preisa6, preisa7, preisa8, preisa9, preisa10, preisa11, preisa12, preisa13, preisa14, preisa15, preisa16, preisa17, preisa18;
    TextView euro;
    Button wppreis;



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

        brokkoli = (CheckBox) findViewById(R.id.brokkoli );
        if (brokkoli.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }


        champignon = (CheckBox) findViewById(R.id.champignon );
        if (champignon.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        chili = (CheckBox) findViewById(R.id.chili );
        if (chili.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        spinat = (CheckBox) findViewById(R.id.spinat );
        if (spinat.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        thunfisch = (CheckBox) findViewById(R.id.thunfisch );
        if (thunfisch.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }


        tomate = (CheckBox) findViewById(R.id.tomate );
        if (tomate.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        fetakaese = (CheckBox) findViewById(R.id.fetakaese );
        if (fetakaese.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        knoblauch = (CheckBox) findViewById(R.id.knoblauch );
        if (knoblauch.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        mais = (CheckBox) findViewById(R.id.mais );
        if (mais.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        oliven = (CheckBox) findViewById(R.id.oliven );
        if (oliven.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        morzarella = (CheckBox) findViewById(R.id.morzarella );
        if (morzarella.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        haenchen = (CheckBox) findViewById(R.id.haenchen );
        if (haenchen.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        gorgonzola = (CheckBox) findViewById(R.id.gorgonzola );
        if (gorgonzola.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        salami = (CheckBox) findViewById(R.id.salami );
        if (salami.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        schinken = (CheckBox) findViewById(R.id.schinken );
        if (schinken.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        redonion = (CheckBox) findViewById(R.id.redonion );
        if (redonion.isChecked()) {
            if (familie = true) {
                preis = (float) (preis + 0.7) ;

            }
            if (gross = true) {
                preis = (float) (preis + 0.5);
            }
        }

        euro = (TextView) findViewById(R.id.euro);

        wppreis = (Button) findViewById(R.id.wppreis);
        wppreis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //preis = preisa1+ preisa2+ preisa3+ preisa4+ preisa5+ preisa6+ preisa7+ preisa8+ preisa9+ preisa10+ preisa11+ preisa12+ preisa13+ preisa14+ preisa15+ preisa16+ preisa17+ preisa18;
                euro.setText(String.valueOf(preis));
            }
        });






    }
}
