package de.tu_clausthal.in.informatikwerkstatt.deinepizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity3 extends AppCompatActivity {

    boolean klein, gross, familie;
    RadioGroup radiog;
    RadioButton kleinR, grossR, familieR;
    CheckBox annanas, basilikum, brokkoli, champignon, chili, spinat, thunfisch, tomate, fetakaese, knoblauch, mais, oliven, morzarella, haenchen, gorgonzola, salami, schinken, redonion;
    float gpreis, preis = (float) 5.5, grosse, gannanas, gbasilikum, gbrokkoli, gchampignon, gchili, gspinat, gthunfisch, gtomate, gfetakaese, gknoblauch, gmais, goliven, gmorzarella, gchicken, ggorgonzola, gsalami, gschinken, gredonion;
    TextView euro ,pannanas, pbasilikum, pbrokkoli, pchampignon, pchili, pspinat, pthunfisch, ptomate, pfetakaese, pknoblauch, pmais, poliven, pmorzarella, pchicken, pgorgonzola, psalami, pschinken, predonion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        RadioGroup radiog = (RadioGroup) findViewById(R.id.radiog);
        RadioButton kleinR = (RadioButton) findViewById(R.id.kleinR);
        RadioButton grossR = (RadioButton) findViewById(R.id.grossR);
        RadioButton familieR = (RadioButton) findViewById(R.id.familieR);
        //Textveränderung
        pannanas = (TextView) findViewById(R.id.pannanas);
        pbasilikum = (TextView) findViewById(R.id.pbasilikum);
        pbrokkoli = (TextView) findViewById(R.id.pbrokkoli);
        pchampignon = (TextView) findViewById(R.id.pchampignon);
        pchili = (TextView) findViewById(R.id.pchili);
        pfetakaese = (TextView) findViewById(R.id.pfetakaese);
        pgorgonzola = (TextView) findViewById(R.id.pgorgonzola);
        pchicken = (TextView) findViewById(R.id.pchicken);
        pknoblauch = (TextView) findViewById(R.id.pknoblauch);
        pmais = (TextView) findViewById(R.id.pmais);
        pmorzarella = (TextView) findViewById(R.id.pmorzarella);
        poliven= (TextView) findViewById(R.id.poliven);
        predonion= (TextView) findViewById(R.id.predonion);
        psalami= (TextView) findViewById(R.id.psalami);
        pschinken= (TextView) findViewById(R.id.pschinken);
        pspinat= (TextView) findViewById(R.id.pspinat);
        pthunfisch= (TextView) findViewById(R.id.pthunfisch);
        ptomate= (TextView) findViewById(R.id.ptomate);
        //CheckBox deklaration
        annanas = (CheckBox) findViewById(R.id. annanas);
        basilikum = (CheckBox) findViewById(R.id.basilikum);
        brokkoli = (CheckBox) findViewById(R.id.brokkoli);
        champignon = (CheckBox) findViewById(R.id.champignon);
        chili = (CheckBox) findViewById(R.id.chili);
        fetakaese = (CheckBox) findViewById(R.id.fetakaese);
        gorgonzola = (CheckBox) findViewById(R.id.gorgonzola);
        haenchen = (CheckBox) findViewById(R.id.haenchen);
        knoblauch = (CheckBox) findViewById(R.id.knoblauch);
        mais = (CheckBox) findViewById(R.id.mais);
        morzarella = (CheckBox) findViewById(R.id.morzarella);
        oliven = (CheckBox) findViewById(R.id.oliven);
        redonion = (CheckBox) findViewById(R.id.redonion);
        salami= (CheckBox) findViewById(R.id.salami);
        schinken= (CheckBox) findViewById(R.id.schinken);
        spinat= (CheckBox) findViewById(R.id.spinat);
        thunfisch= (CheckBox) findViewById(R.id.thunfisch);
        tomate= (CheckBox) findViewById(R.id.tomate);


        kleinR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                klein = true;
            }
        });

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


        // Relative Einstellungen für die größe der Wunschpizza
        if (familie == true){
            grosse = (float) 1.4;
        }
        else if(klein == true)
        {
            grosse = (float) 0.7;
        }
        else
            {
                grosse = (float) 1;
            }


        if (annanas.isChecked())
        {
                preis = (float) (preis + 0.15);
        }
        gannanas = (float) (0.15 * grosse);
        pannanas.setText(String.valueOf(gannanas) + "€");
        if (brokkoli.isChecked())
        {
            preis = (float) (preis + 0.2);
        }
        gbrokkoli = (float) (0.2 * grosse);
        pbrokkoli.setText(String.valueOf(gbrokkoli) + "€");
        if (basilikum.isChecked())
        {
            preis = (float) (preis + 0.1);
        }
        gbasilikum = (float) (0.1 * grosse);
        pbasilikum.setText(String.valueOf(gbasilikum) + "€");
        if (chili.isChecked())
        {
            preis = (float) (preis + 0.12);
        }
        gchili = (float) (0.12 * grosse);
        pchili.setText(String.valueOf(gchili) + "€");
        if (champignon.isChecked())
        {
            preis = (float) (preis + 0.17);
        }
        gchampignon = (float) (0.17 * grosse);
        pchampignon.setText(String.valueOf(gchampignon) + "€");
        if (fetakaese.isChecked())
        {
            preis = (float) (preis + 0.1);
        }
        gfetakaese = (float) (0.1 * grosse);
        pfetakaese.setText(String.valueOf(gfetakaese) + "€");
        if (gorgonzola.isChecked())
        {
            preis = (float) (preis + 0.3);
        }
        ggorgonzola = (float) (0.3 * grosse);
        pgorgonzola.setText(String.valueOf(ggorgonzola) + "€");
        if (haenchen.isChecked())
        {
            preis = (float) (preis + 0.22);
        }
        gchicken = (float) (0.22 * grosse);
        pchicken.setText(String.valueOf(gchicken) + "€");
        if (knoblauch.isChecked())
        {
            preis = (float) (preis + 0.27);
        }
        gknoblauch = (float) (0.27 * grosse);
        pknoblauch.setText(String.valueOf(gknoblauch) + "€");
        if (mais.isChecked())
        {
            preis = (float) (preis + 0.3);
        }
        gmais = (float) (0.13 * grosse);
        pmais.setText(String.valueOf(gmais) + "€");
        if (morzarella.isChecked())
        {
            preis = (float) (preis + 0.25);
        }
        gmorzarella = (float) (0.25 * grosse);
        pmorzarella.setText(String.valueOf(gmorzarella) + "€");
        if (oliven.isChecked())
        {
            preis = (float) (preis + 0.35);
        }
        goliven = (float) (0.35 * grosse);
        poliven.setText(String.valueOf(goliven) + "€");
        if (spinat.isChecked())
        {
            preis = (float) (preis + 0.21);
        }
        gspinat = (float) (0.21 * grosse);
        pspinat.setText(String.valueOf(gspinat) + "€");
        if (schinken.isChecked())
        {
            preis = (float) (preis + 0.15);
        }
        gschinken = (float) (0.15 * grosse);
        pschinken.setText(String.valueOf(gschinken) + "€");
        if (salami.isChecked())
        {
            preis = (float) (preis + 0.13);
        }
        gsalami = (float) (0.13 * grosse);
        psalami.setText(String.valueOf(gsalami) + "€");
        if (thunfisch.isChecked())
        {
            preis = (float) (preis + 0.12);
        }
        gthunfisch = (float) (0.12 * grosse);
        pthunfisch.setText(String.valueOf(gthunfisch) + "€");
        if (tomate.isChecked())
        {
            preis = (float) (preis + 0.17);
        }
        gtomate = (float) (0.17 * grosse);
        ptomate.setText(String.valueOf(gtomate) + "€");
        




    }
    public void preis () {
     gpreis= preis* grosse;
     euro.setText(String.valueOf(gpreis) + "€");
    }

}
