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
                pannanas.setText("0.50€");
                pbasilikum.setText("0.40€");
                pbrokkoli.setText("0.40€");
                pchampignon.setText("0.70€");
                pchili.setText("0.10€");
                pspinat.setText("0.50€");
                pthunfisch.setText("0.60€");
                ptomate.setText("0.50€");
                pfetakaese.setText("0.80€");
                pknoblauch.setText("0.20€");
                pmais.setText("0.50€");
                poliven.setText("0.60€");
                pmorzarella.setText("0.60€");
                pchicken.setText("1.00€");
                pgorgonzola.setText("0.80€");
                psalami.setText("0.60€");
                pschinken.setText("0.60€");
                predonion.setText("0.50€");
            }
        });
        grossR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grosse = (float) 1;
                pannanas.setText("0.80 €");
                pbasilikum.setText("0.70€");
                pbrokkoli.setText("0.70€");
                pchampignon.setText("1.00€");
                pchili.setText("0.30€");
                pspinat.setText("0.80€");
                pthunfisch.setText("1.00€");
                ptomate.setText("0.80€");
                pfetakaese.setText("1.20€");
                pknoblauch.setText("0.35€");
                pmais.setText("0.85€");
                poliven.setText("0.90€");
                pmorzarella.setText("1.00€");
                pchicken.setText("0.19€");
                pgorgonzola.setText("1.20€");
                psalami.setText("1.00€");
                pschinken.setText("1.00€");
                predonion.setText("0.80€");
            }
        });
        familieR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grosse = (float) 1.4;
                pannanas.setText("1.20");
                pbasilikum.setText("0.90€");
                pbrokkoli.setText("1.00€");
                pchampignon.setText("1.30€");
                pchili.setText("0.50€");
                pspinat.setText("1.10€");
                pthunfisch.setText("1.40€");
                ptomate.setText("1.10€");
                pfetakaese.setText("1.60€");
                pknoblauch.setText("0.50€");
                pmais.setText("1.10€");
                poliven.setText("1.30€");
                pmorzarella.setText("1.35€");
                pchicken.setText("2.00€");
                pgorgonzola.setText("1.60€");
                psalami.setText("1.40€");
                pschinken.setText("1.40€");
                predonion.setText("1.10€");
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
                        gannanas = (float) 0.50;
                    }if (grossR.isChecked()){
                    gannanas = (float) 0.80;
                }if (familieR.isChecked()){
                    gannanas = (float) 1.20;
                }
                }else{
                    gannanas = 0;
                }if (brokkoli.isChecked())
                {
                    if (kleinR.isChecked()){
                        gbrokkoli = (float) 0.40;
                    }if (grossR.isChecked()){
                    gbrokkoli = (float) 0.70;
                }if (familieR.isChecked()){
                    gbrokkoli = (float) 1.00;
                }
                }else{
                    gbrokkoli = 0;
                }if (basilikum.isChecked())
                {
                    if(kleinR.isChecked()){
                        gbasilikum = (float)0.40;
                    }if (grossR.isChecked()){
                    gbasilikum = (float)0.70;
                }if (familieR.isChecked()){
                    gbasilikum = (float)0.90;
                }
                }else{
                    gbasilikum = 0;
                }if (chili.isChecked())
                {
                    if(kleinR.isChecked()){
                        gchili = (float) 0.10;
                    }if (grossR.isChecked()){
                    gchili = (float)0.30;
                }if (familieR.isChecked()){
                    gchili = (float) 0.50;
                }
                }else{
                    gchili = 0;
                }if (champignon.isChecked())
                {
                    if(kleinR.isChecked()){
                        gchampignon = (float)0.70;
                    }if (grossR.isChecked()){
                    gchampignon = (float)1.00;
                }if (familieR.isChecked()){
                    gchampignon = (float)1.30;
                }
                }else{
                    gchampignon = 0;
                }if (fetakaese.isChecked())
                {
                    if(kleinR.isChecked()){
                        gfetakaese = (float) 0.80;
                    }if (grossR.isChecked()){
                    gfetakaese = (float) 1.20;
                }if (familieR.isChecked()){
                    gfetakaese = (float) 1.60;
                }
                }else{
                    gfetakaese = 0;
                }if (gorgonzola.isChecked())
                {
                    if(kleinR.isChecked()){
                        ggorgonzola= (float)0.80;
                    }if (grossR.isChecked()){
                    ggorgonzola= (float)1.20;
                }if (familieR.isChecked()){
                    ggorgonzola= (float)1.60;
                }
                }else{
                    ggorgonzola = 0;
                }if (haenchen.isChecked())
                {
                    if(kleinR.isChecked()){
                        gchicken = (float) 1.00;
                    }if (grossR.isChecked()) {
                    gchicken = (float) 1.50;
                }if (familieR.isChecked()){
                    gchicken = (float) 2.00;
                }
                }else{
                    gchicken = 0;
                }if (knoblauch.isChecked())
                {
                    if(kleinR.isChecked()){
                        gknoblauch = (float)0.20;
                    }if (grossR.isChecked()){
                    gknoblauch = (float)0.35;
                }if (familieR.isChecked()){
                    gknoblauch = (float)0.50;
                }
                }else{
                    gknoblauch = 0;
                }if (mais.isChecked())
                {
                    if(kleinR.isChecked()){
                        gmais = (float)0.50;
                    }if (grossR.isChecked()){
                    gmais = (float)0.85;
                }if (familieR.isChecked()){
                    gmais = (float)1.10;
                }
                }else{
                    gmais = 0;
                }if (morzarella.isChecked())
                {
                    if(kleinR.isChecked()){
                        gmorzarella = (float)0.60;
                    }if (grossR.isChecked()){
                    gmorzarella = (float)1.00;
                }if (familieR.isChecked()){
                    gmorzarella = (float)1.35;
                }
                }else{
                    gmorzarella = 0;
                }if (oliven.isChecked())
                {
                    if(kleinR.isChecked()){
                        goliven = (float)0.60;
                    }if (grossR.isChecked()){
                    goliven = (float)0.90;
                }if (familieR.isChecked()){
                    goliven = (float)1.30;
                }
                }else{
                    goliven = 0;
                }if (spinat.isChecked())
                {
                    if(kleinR.isChecked()){
                        gspinat = (float)0.50;
                    }if (grossR.isChecked()){
                    gspinat = (float)0.80;
                }if (familieR.isChecked()){
                    gspinat = (float)1.10;
                }
                }else{
                    gspinat = 0;
                }if (schinken.isChecked())
                {
                    if(kleinR.isChecked()){
                        gschinken = (float)0.60;
                    }if (grossR.isChecked()){
                    gschinken = (float)1.00;
                }if (familieR.isChecked()){
                    gschinken = (float)1.40;
                }
                }else{
                    gschinken = 0;
                }if (salami.isChecked())
                {
                    if(kleinR.isChecked()){
                        gsalami = (float)0.60;
                    }if (grossR.isChecked()){
                    gsalami = (float)1.00;
                }if (familieR.isChecked()){
                    gsalami = (float)1.40;
                }
                }else{
                    gsalami = 0;
                }if (thunfisch.isChecked())
                {
                    if(kleinR.isChecked()){
                        gthunfisch = (float)0.60;
                    }if (grossR.isChecked()){
                    gthunfisch = (float)1.00;
                }if (familieR.isChecked()){
                    gthunfisch = (float)1.40;
                }
                }else{
                    gthunfisch = 0;
                }if (tomate.isChecked())
                {
                    if(kleinR.isChecked()){
                        gtomate = (float)0.50;
                    }if (grossR.isChecked()){
                    gtomate = (float)0.80;
                }if (familieR.isChecked()){
                    gtomate = (float)1.10;
                }
                }else{
                    gtomate = 0;
                }if (redonion.isChecked())
                {
                    if(kleinR.isChecked()){
                        gredonion = (float) 0.50;
                    }if (grossR.isChecked()){
                    gredonion = (float) 0.80;
                }if (familieR.isChecked()){
                    gredonion = (float) 1.10;
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
