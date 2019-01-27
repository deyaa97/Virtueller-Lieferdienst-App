package de.tu_clausthal.in.informatikwerkstatt.virtueller_lieferdienst_app;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class WunschPizzaActivity extends AppCompatActivity {

    RadioGroup radiog;
    RadioButton kleinR, grossR, familieR;
    CheckBox annanas, basilikum, brokkoli, champignon, chili, spinat, thunfisch, tomate, fetakaese, knoblauch, mais, oliven, morzarella, haenchen, gorgonzola, salami, schinken, redonion;
    float gpreis, preis = (float) 5.5, grosse, gannanas, gbasilikum, gbrokkoli, gchampignon, gchili, gspinat, gthunfisch, gtomate, gfetakaese, gknoblauch, gmais, goliven, gmorzarella, gchicken, ggorgonzola, gsalami, gschinken, gredonion;
    TextView euro ,pannanas, pbasilikum, pbrokkoli, pchampignon, pchili, pspinat, pthunfisch, ptomate, pfetakaese, pknoblauch, pmais, poliven, pmorzarella, pchicken, pgorgonzola, psalami, pschinken, predonion;
    Button preis1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wunsch_pizza);
        euro = (TextView)findViewById(R.id.euro);
        radiog = (RadioGroup) findViewById(R.id.radiog);
        kleinR = (RadioButton) findViewById(R.id.kleinR);
        grossR = (RadioButton) findViewById(R.id.grossR);
        familieR = (RadioButton) findViewById(R.id.familieR);
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
            }
        });
        grossR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grosse = (float) 1;
            }
        });

        familieR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grosse = (float) 1.4;
            }
        });

        preis1=(Button) findViewById(R.id.preis2);
        preis1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (annanas.isChecked())
                {
                    gannanas = (float) 0.15;
                }else{
                    gannanas = 0;
                }if (brokkoli.isChecked())
                {
                    gbrokkoli = (float) 0.2;
                }else{
                    gbrokkoli = 0;
                }if (basilikum.isChecked())
                {
                    gbasilikum = (float)0.1;
                }else{
                    gbasilikum = 0;
                }if (chili.isChecked())
                {
                    gchili = (float) 0.12;
                }else{
                    gchili = 0;
                }if (champignon.isChecked())
                {
                    gchampignon = (float)0.17;
                }else{
                    gchampignon = 0;
                }if (fetakaese.isChecked())
                {
                    gfetakaese = (float) 0.1;
                }else{
                    gfetakaese = 0;
                }if (gorgonzola.isChecked())
                {
                    ggorgonzola= (float)0.3;
                }else{
                    ggorgonzola = 0;
                }if (haenchen.isChecked())
                {
                    gchicken = (float) 0.22;
                }else{
                    gchicken = 0;
                }if (knoblauch.isChecked())
                {
                    gknoblauch = (float)0.27;
                }else{
                    gknoblauch = 0;
                }if (mais.isChecked())
                {
                    gmais = (float)0.3;
                }else{
                    gmais = 0;
                }if (morzarella.isChecked())
                {
                    gmorzarella = (float)0.25;
                }else{
                    gmorzarella = 0;
                }if (oliven.isChecked())
                {
                    goliven = (float)0.35;
                }else{
                    goliven = 0;
                }if (spinat.isChecked())
                {
                    gspinat = (float)0.21;
                }else{
                    gspinat = 0;
                }if (schinken.isChecked())
                {
                    gschinken = (float)0.15;
                }else{
                    gschinken = 0;
                }if (salami.isChecked())
                {
                    gsalami = (float)0.13;
                }else{
                    gsalami = 0;
                }if (thunfisch.isChecked())
                {
                    gthunfisch = (float)0.12;
                }else{
                    gthunfisch = 0;
                }if (tomate.isChecked())
                {
                    gtomate = (float)0.17;
                }else{
                    gtomate = 0;
                }if (redonion.isChecked()){
                    gredonion = (float) 0.10;
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
