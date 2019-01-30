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

    RadioGroup radiog;
    RadioButton kleinR, grossR, familieR;
    CheckBox annanas, basilikum, brokkoli, champignon, chili, spinat, thunfisch, tomate, fetakaese, knoblauch, mais, oliven, morzarella, haenchen, gorgonzola, salami, schinken, redonion;
    float gpreis, preis = (float) 5.5, grosse, gannanas, gbasilikum, gbrokkoli, gchampignon, gchili, gspinat, gthunfisch, gtomate, gfetakaese, gknoblauch, gmais, goliven, gmorzarella, gchicken, ggorgonzola, gsalami, gschinken, gredonion;
    TextView euro ,pannanas, pbasilikum, pbrokkoli, pchampignon, pchili, pspinat, pthunfisch, ptomate, pfetakaese, pknoblauch, pmais, poliven, pmorzarella, pchicken, pgorgonzola, psalami, pschinken, predonion;
    Button preis1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        radiog = (RadioGroup) findViewById(R.id.radiog);
        kleinR = (RadioButton) findViewById(R.id.kleinR);
        grossR = (RadioButton) findViewById(R.id.grossR);
        familieR = (RadioButton) findViewById(R.id.familieR);
        //Textveränderung
        euro = (TextView)findViewById(R.id.euro);

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
        annanas = (CheckBox) findViewById(R.id.annanas);
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
                grosse = (float) 0.7;
                pannanas.setText("0.05€");
                pbasilikum.setText("0.05€");
                pbrokkoli.setText("0.10€");
                pchampignon.setText("0.10€");
                pchili.setText("0.05€");
                pspinat.setText("0.12€");
                pthunfisch.setText("0.05€");
                ptomate.setText("0.10€");
                pfetakaese.setText("0.05€");
                pknoblauch.setText("0.20€");
                pmais.setText("0.20€");
                poliven.setText("0.25€");
                pmorzarella.setText("0.15€");
                pchicken.setText("0.15€");
                pgorgonzola.setText("0.20€");
                psalami.setText("0.05€");
                pschinken.setText("0.08€");
                predonion.setText("0.05€");
            }
        });
        grossR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grosse = (float) 1;
                pannanas.setText("0.10 €");
                pbasilikum.setText("0.08€");
                pbrokkoli.setText("0.15€");
                pchampignon.setText("0.15€");
                pchili.setText("0.10€");
                pspinat.setText("0.18€");
                pthunfisch.setText("0.08€");
                ptomate.setText("0.15€");
                pfetakaese.setText("0.08€");
                pknoblauch.setText("0.25€");
                pmais.setText("0.25€");
                poliven.setText("0.30€");
                pmorzarella.setText("0.20€");
                pchicken.setText("0.19€");
                pgorgonzola.setText("0.25€");
                psalami.setText("0.09€");
                pschinken.setText("0.10€");
                predonion.setText("0.08€");
            }
        });
        familieR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grosse = (float) 1.4;
                pannanas.setText("0.15");
                pbasilikum.setText("0.10€");
                pbrokkoli.setText("0.20€");
                pchampignon.setText("0.17€");
                pchili.setText("0.12€");
                pspinat.setText("0.21€");
                pthunfisch.setText("0.12€");
                ptomate.setText("0.17€");
                pfetakaese.setText("0.10€");
                pknoblauch.setText("0.27€");
                pmais.setText("0.30€");
                poliven.setText("0.35€");
                pmorzarella.setText("0.25€");
                pchicken.setText("0.22€");
                pgorgonzola.setText("0.30€");
                psalami.setText("0.13€");
                pschinken.setText("0.15€");
                predonion.setText("0.10€");
            }
        });
        preis1=(Button) findViewById(R.id.preis2);
        preis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (annanas.isChecked())
                {
                    if (kleinR.isChecked())
                    {
                        gannanas = (float) 0.05;
                    }if (grossR.isChecked()){
                    gannanas = (float) 0.10;
                }if (familieR.isChecked()){
                    gannanas = (float) 0.15;
                }
                }else{
                    gannanas = 0;
                }if (brokkoli.isChecked())
                {
                    if (kleinR.isChecked()){
                        gbrokkoli = (float) 0.10;
                    }if (grossR.isChecked()){
                    gbrokkoli = (float) 0.15;
                }if (familieR.isChecked()){
                    gbrokkoli = (float) 0.20;
                }
                }else{
                    gbrokkoli = 0;
                }if (basilikum.isChecked())
                {
                    if(kleinR.isChecked()){
                        gbasilikum = (float)0.05;
                    }if (grossR.isChecked()){
                    gbasilikum = (float)0.08;
                }if (familieR.isChecked()){
                    gbasilikum = (float)0.10;
                }
                }else{
                    gbasilikum = 0;
                }if (chili.isChecked())
                {
                    if(kleinR.isChecked()){
                        gchili = (float) 0.05;
                    }if (grossR.isChecked()){
                    gchili = (float)0.10;
                }if (familieR.isChecked()){
                    gchili = (float) 0.12;
                }
                }else{
                    gchili = 0;
                }if (champignon.isChecked())
                {
                    if(kleinR.isChecked()){
                        gchampignon = (float)0.10;
                    }if (grossR.isChecked()){
                    gchampignon = (float)0.15;
                }if (familieR.isChecked()){
                    gchampignon = (float)0.17;
                }
                }else{
                    gchampignon = 0;
                }if (fetakaese.isChecked())
                {
                    if(kleinR.isChecked()){
                        gfetakaese = (float) 0.05;
                    }if (grossR.isChecked()){
                    gfetakaese = (float) 0.08;
                }if (familieR.isChecked()){
                    gfetakaese = (float) 0.10;
                }
                }else{
                    gfetakaese = 0;
                }if (gorgonzola.isChecked())
                {
                    if(kleinR.isChecked()){
                        ggorgonzola= (float)0.20;
                    }if (grossR.isChecked()){
                    ggorgonzola= (float)0.25;
                }if (familieR.isChecked()){
                    ggorgonzola= (float)0.30;
                }
                }else{
                    ggorgonzola = 0;
                }if (haenchen.isChecked())
                {
                    if(kleinR.isChecked()){
                        gchicken = (float) 0.15;
                    }if (grossR.isChecked()) {
                    gchicken = (float) 0.19;
                }if (familieR.isChecked()){
                    gchicken = (float) 0.22;
                }
                }else{
                    gchicken = 0;
                }if (knoblauch.isChecked())
                {
                    if(kleinR.isChecked()){
                        gknoblauch = (float)0.20;
                    }if (grossR.isChecked()){
                    gknoblauch = (float)0.25;
                }if (familieR.isChecked()){
                    gknoblauch = (float)0.27;
                }
                }else{
                    gknoblauch = 0;
                }if (mais.isChecked())
                {
                    if(kleinR.isChecked()){
                        gmais = (float)0.20;
                    }if (grossR.isChecked()){
                    gmais = (float)0.25;
                }if (familieR.isChecked()){
                    gmais = (float)0.30;
                }
                }else{
                    gmais = 0;
                }if (morzarella.isChecked())
                {
                    if(kleinR.isChecked()){
                        gmorzarella = (float)0.15;
                    }if (grossR.isChecked()){
                    gmorzarella = (float)0.20;
                }if (familieR.isChecked()){
                    gmorzarella = (float)0.25;
                }
                }else{
                    gmorzarella = 0;
                }if (oliven.isChecked())
                {
                    if(kleinR.isChecked()){
                        goliven = (float)0.25;
                    }if (grossR.isChecked()){
                    goliven = (float)0.30;
                }if (familieR.isChecked()){
                    goliven = (float)0.35;
                }
                }else{
                    goliven = 0;
                }if (spinat.isChecked())
                {
                    if(kleinR.isChecked()){
                        gspinat = (float)0.12;
                    }if (grossR.isChecked()){
                    gspinat = (float)0.18;
                }if (familieR.isChecked()){
                    gspinat = (float)0.21;
                }
                }else{
                    gspinat = 0;
                }if (schinken.isChecked())
                {
                    if(kleinR.isChecked()){
                        gschinken = (float)0.08;
                    }if (grossR.isChecked()){
                    gschinken = (float)0.10;
                }if (familieR.isChecked()){
                    gschinken = (float)0.15;
                }
                }else{
                    gschinken = 0;
                }if (salami.isChecked())
                {
                    if(kleinR.isChecked()){
                        gsalami = (float)0.05;
                    }if (grossR.isChecked()){
                    gsalami = (float)0.09;
                }if (familieR.isChecked()){
                    gsalami = (float)0.13;
                }
                }else{
                    gsalami = 0;
                }if (thunfisch.isChecked())
                {
                    if(kleinR.isChecked()){
                        gthunfisch = (float)0.05;
                    }if (grossR.isChecked()){
                    gthunfisch = (float)0.08;
                }if (familieR.isChecked()){
                    gthunfisch = (float)0.12;
                }
                }else{
                    gthunfisch = 0;
                }if (tomate.isChecked())
                {
                    if(kleinR.isChecked()){
                        gtomate = (float)0.10;
                    }if (grossR.isChecked()){
                    gtomate = (float)0.15;
                }if (familieR.isChecked()){
                    gtomate = (float)0.17;
                }
                }else{
                    gtomate = 0;
                }if (redonion.isChecked())
                {
                    if(kleinR.isChecked()){
                        gredonion = (float) 0.05;
                    }if (grossR.isChecked()){
                    gredonion = (float) 0.08;
                }if (familieR.isChecked()){
                    gredonion = (float) 0.10;
                }
                }else{
                    gredonion = 0;
                }
                preis();
            }
        });
    }
    public void preis () {
        gpreis = preis + grosse + gbrokkoli + gbasilikum + gannanas + gchampignon + gchili + gspinat + gthunfisch + gtomate + gfetakaese +
                gknoblauch + gmais + goliven + gmorzarella + gchicken + ggorgonzola + gsalami + gschinken + gredonion;
        euro.setText(String.format("%.2f",gpreis)+ "€");
    }
}
