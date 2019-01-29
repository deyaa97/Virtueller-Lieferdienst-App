package de.tu_clausthal.in.informatikwerkstatt.virtueller_lieferdienst_app;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
public class MainActivity2 extends AppCompatActivity {
    // Buttons definieren
    Button pl_sa, mi_sa, pl_ma, mi_ma, pl_ha, mi_ha, pl_veg, mi_veg, pl_spec, mi_spec, pl_pica, mi_pica, pl_mex, mi_mex, preis,warenkorb, wunsch;
    boolean pl_sat, mi_sat, pl_mat, mi_mat, pl_hat, mi_hat, pl_vegt, mi_vegt, pl_spect, mi_spect, pl_picat, mi_picat, pl_mext, mi_mext;
    EditText e_sa, e_ma, e_ha, e_veg, e_spec, e_pica, e_mex;
    Spinner spin_sa, spin_ma, spin_ha, spin_veg, spin_spec, spin_pica, spin_mex;
    int quantity1, quantity2, quantity3, quantity4, quantity5, quantity6, quantity7, quantity;
    float gespreis, preis1, preis2, preis3, preis4, preis5, preis6, preis7, preis_sa, preis_ma, preis_ha, preis_veg, preis_spec, preis_pica, preis_mex;
    TextView gespreist,txtv_sa,txtv_ma,txtv_ha,txtv_veg,txtv_spec,txtv_pica,txtv_mex,
            gsalami,gmargherita,ghawaii,gvegetaria,gspeciale,gpicante,gmexicana;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Text veränderung
        gsalami = (TextView) findViewById(R.id.gsalami);
        gmargherita = (TextView) findViewById(R.id.gmargherita);
        ghawaii = (TextView) findViewById(R.id.ghawaii);
        gvegetaria = (TextView) findViewById(R.id.gvegetaria);
        gspeciale = (TextView) findViewById(R.id.gspeciale);
        gpicante = (TextView) findViewById(R.id.gpicante);
        gmexicana = (TextView) findViewById(R.id.gmexicana);
        // Variablen und Id Verbindungen
        txtv_sa = (TextView) findViewById(R.id.txtv_sa);
        txtv_ma = (TextView) findViewById(R.id.txtv_ma);
        txtv_ha = (TextView) findViewById(R.id.txtv_ha);
        txtv_veg = (TextView) findViewById(R.id.txtv_veg);
        txtv_spec = (TextView) findViewById(R.id.txtv_spec);
        txtv_pica = (TextView) findViewById(R.id.txtv_pic);
        txtv_mex = (TextView) findViewById(R.id.txtv_mex);

        pl_sa = (Button) findViewById(R.id.pl_sa);
        pl_ma = (Button) findViewById(R.id.pl_ma);
        pl_ha = (Button) findViewById(R.id.pl_ha);
        pl_veg = (Button) findViewById(R.id.pl_veg);
        pl_spec = (Button) findViewById(R.id.pl_spec);
        pl_pica = (Button) findViewById(R.id.pl_pica);
        pl_mex = (Button) findViewById(R.id.pl_mex);

        mi_sa = (Button) findViewById(R.id.mi_sa);
        mi_ma = (Button) findViewById(R.id.mi_ma);
        mi_ha = (Button) findViewById(R.id.mi_ha);
        mi_veg = (Button) findViewById(R.id.mi_veg);
        mi_spec = (Button) findViewById(R.id.mi_spec);
        mi_pica = (Button) findViewById(R.id.mi_pica);
        mi_mex = (Button) findViewById(R.id.mi_mex);

        e_sa = (EditText) findViewById(R.id.e_sa);
        e_ma = (EditText) findViewById(R.id.e_ma);
        e_ha = (EditText) findViewById(R.id.e_ha);
        e_veg = (EditText) findViewById(R.id.e_veg);
        e_spec = (EditText) findViewById(R.id.e_spec);
        e_pica = (EditText) findViewById(R.id.e_pica);
        e_mex = (EditText) findViewById(R.id.e_mex);

        gespreist = (TextView) findViewById(R.id.gespreis);
        preis = (Button) findViewById(R.id.preis);


        wunsch = (Button)findViewById(R.id.wunsch);
        wunsch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wunschIntent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(wunschIntent);
            }
        });

        warenkorb = (Button) findViewById(R.id.waren_korb);
        warenkorb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intIntent = new Intent(getApplicationContext(), MainActivity4.class);

                if (!TextUtils.isEmpty(e_sa.getText().toString()) && !e_sa.getText().toString().equals("0")) {
                    intIntent.putExtra("quantity","x" + e_sa.getText().toString());
                    intIntent.putExtra("sort", txtv_sa.getText());
                    String spinText_sa = spin_sa.getSelectedItem().toString();
                    intIntent.putExtra("grosse", spinText_sa);
                }if (!TextUtils.isEmpty(e_ma.getText().toString()) && !e_ma.getText().toString().equals("0")){
                    intIntent.putExtra("quantity2","x" + e_ma.getText().toString());
                    intIntent.putExtra("sort2", txtv_ma.getText());
                    String spinText_ma = spin_ma.getSelectedItem().toString();
                    intIntent.putExtra("grosse2", spinText_ma);
                }if (!TextUtils.isEmpty(e_ha.getText().toString()) && !e_ha.getText().toString().equals("0")){
                    intIntent.putExtra("quantity3","x" + e_ha.getText().toString());
                    intIntent.putExtra("sort3", txtv_ha.getText());
                    String spinText_ha = spin_ha.getSelectedItem().toString();
                    intIntent.putExtra("grosse3", spinText_ha);
                }if (!TextUtils.isEmpty(e_veg.getText().toString()) && !e_veg.getText().toString().equals("0")){
                    intIntent.putExtra("quantity4","x" + e_veg.getText().toString());
                    intIntent.putExtra("sort4", txtv_veg.getText());
                    String spinText_veg = spin_veg.getSelectedItem().toString();
                    intIntent.putExtra("grosse4", spinText_veg);
                }if (!TextUtils.isEmpty(e_spec.getText().toString()) && !e_spec.getText().toString().equals("0")){
                    intIntent.putExtra("quantity5","x" + e_spec.getText().toString());
                    intIntent.putExtra("sort5", txtv_spec.getText());
                    String spinText_spec = spin_spec.getSelectedItem().toString();
                    intIntent.putExtra("grosse5", spinText_spec);
                }if (!TextUtils.isEmpty(e_pica.getText().toString()) && !e_pica.getText().toString().equals("0")){
                    intIntent.putExtra("quantity6","x" + e_pica.getText().toString());
                    intIntent.putExtra("sort6", txtv_pica.getText());
                    String spinText_pica = spin_pica.getSelectedItem().toString();
                    intIntent.putExtra("grosse6", spinText_pica);
                }if (!TextUtils.isEmpty(e_mex.getText().toString()) && !e_mex.getText().toString().equals("0")){
                    intIntent.putExtra("quantity7","x" + e_mex.getText().toString());
                    intIntent.putExtra("sort7", txtv_mex.getText());
                    String spinText_mex = spin_mex.getSelectedItem().toString();
                    intIntent.putExtra("grosse7", spinText_mex);
                }
                startActivity(intIntent);
            }
        });

        preis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gesamtpreis();
            }
        });
        pl_sa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                pl_sat = true;
                increment();
                display(quantity1);
            }
        });
        mi_sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mi_sat = true;
                decrement();
                display(quantity1);
            }
        });
        pl_ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pl_mat = true;
                increment();
                display(quantity2);
            }
        });
        mi_ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mi_mat = true;
                decrement();
                display(quantity2);
            }
        });
        pl_ha.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                pl_hat = true;
                increment();
                display(quantity3);
            }
        });
        mi_ha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mi_hat = true;
                decrement();
                display(quantity3);
            }
        });

        pl_veg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                pl_vegt = true;
                increment();
                display(quantity4);
            }
        });
        mi_veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mi_vegt = true;
                decrement();
                display(quantity4);
            }
        });
        pl_spec.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                pl_spect = true;
                increment();
                display(quantity5);
            }
        });
        mi_spec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mi_spect = true;
                decrement();
                display(quantity5);
            }
        });

        pl_pica.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                pl_picat = true;
                increment();
                display(quantity6);
            }
        });
        mi_pica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mi_picat = true;
                decrement();
                display(quantity6);
            }
        });
        pl_mex.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                pl_mext = true;
                increment();
                display(quantity7);
            }
        });
        mi_mex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mi_mext = true;
                decrement();
                display(quantity7);
            }
        });
        //Spinner Salami definieren
        spin_sa = (Spinner) findViewById(R.id.spin_sa);
        //Die Liste von Elementen im Spinner
        List<String> list = new ArrayList<>();
        list.add ("Größe");
        list.add ("S");
        list.add ("M");
        list.add ("L");
        //Adapter, um die Listenelemente in Spinner zu übertragen
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_sa.setAdapter(adapter);
        spin_sa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (spin_sa.getSelectedItem().toString().trim().equals("S")) {
                    preis1 = (float) 3.90;

                }if (spin_sa.getSelectedItem().toString().trim().equals("M")) {
                    preis1 = (float)6.90;

                }if (spin_sa.getSelectedItem().toString().trim().equals("L")) {
                    preis1 = (float) 8.90;
                }
                gsalami.setText(String.format("%.2f",preis1) + "€");
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        //Spinner Margherita definieren
        spin_ma = (Spinner) findViewById(R.id.spin_ma);
        //Die Liste von Elementen im Spinner
        List<String> list2 = new ArrayList<>();
        list2.add ("Größe");
        list2.add ("S");
        list2.add ("M");
        list2.add ("L");
        //Adapter, um die Listenelemente in Spinner zu übertragen
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_ma.setAdapter(adapter2);
        spin_ma.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent2, View view2, int position2, long id2) {
                if (spin_ma.getSelectedItem().toString().trim().equals("S")) {
                    preis2 = (float)2.90;

                }if (spin_ma.getSelectedItem().toString().trim().equals("M")) {
                    preis2 = (float) 4.90;

                }if (spin_ma.getSelectedItem().toString().trim().equals("L")) {
                    preis2 = (float) 6.90;
                }
                gmargherita.setText(String.format("%.2f",preis2) + "€");
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        //Spinner Hawaii definieren
        spin_ha = (Spinner) findViewById(R.id.spin_ha);
        //Die Liste von Elementen im Spinner
        List<String> list3 = new ArrayList<>();
        list3.add ("Größe");
        list3.add ("S");
        list3.add ("M");
        list3.add ("L");
        //Adapter, um die Listenelemente in Spinner zu übertragen
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list3);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_ha.setAdapter(adapter3);
        spin_ha.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent3, View view3, int position3, long id3) {
                if (spin_ha.getSelectedItem().toString().trim().equals("S")) {
                    preis3 = (float) 4.50;
                }if (spin_ha.getSelectedItem().toString().trim().equals("M")) {
                    preis3 = (float) 6.70;
                }if (spin_ha.getSelectedItem().toString().trim().equals("L")) {
                    preis3 = (float) 8.90;
                }
                ghawaii.setText(String.format("%.2f",preis3) + "€");
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        //Spinner Vegetaria definieren
        spin_veg = (Spinner) findViewById(R.id.spin_veg);
        //Die Liste von Elementen im Spinner
        List<String> list4 = new ArrayList<>();
        list4.add ("Größe");
        list4.add ("S");
        list4.add ("M");
        list4.add ("L");
        //Adapter, um die Listenelemente in Spinner zu übertragen
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list4);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_veg.setAdapter(adapter4);
        spin_veg.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent4, View view4, int position4, long id4) {
                if (spin_veg.getSelectedItem().toString().trim().equals("S")) {
                    preis4 = (float) 4.90;

                }if (spin_veg.getSelectedItem().toString().trim().equals("M")) {
                    preis4 = (float) 6.90;

                }if (spin_veg.getSelectedItem().toString().trim().equals("L")) {
                    preis4 = (float) 9.50;
                }
                gvegetaria.setText(String.format("%.2f",preis4) + "€");
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        //Spinner Speciale definieren
        spin_spec = (Spinner) findViewById(R.id.spin_spec);
        //Die Liste von Elementen im Spinner
        List<String> list5 = new ArrayList<>();
        list5.add ("Größe");
        list5.add ("S");
        list5.add ("M");
        list5.add ("L");
        //Adapter, um die Listenelemente in Spinner zu übertragen
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list5);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_spec.setAdapter(adapter5);
        spin_spec.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent5, View view5, int position5, long id5) {
                if (spin_spec.getSelectedItem().toString().trim().equals("S")) {
                    preis5 = (float) 4.90;
                }if (spin_spec.getSelectedItem().toString().trim().equals("M")) {
                    preis5 = (float) 6.90;
                }if (spin_spec.getSelectedItem().toString().trim().equals("L")) {
                    preis5 = (float) 9.50;
                }
                gspeciale.setText(String.format("%.2f",preis5) + "€");
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        //Spinner Picante definieren
        spin_pica = (Spinner) findViewById(R.id.spin_pica);
        //Die Liste von Elementen im Spinner
        List<String> list6 = new ArrayList<>();
        list6.add ("Größe");
        list6.add ("S");
        list6.add ("M");
        list6.add ("L");
        //Adapter, um die Listenelemente in Spinner zu übertragen
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list6);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_pica.setAdapter(adapter6);
        spin_pica.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent6, View view6, int position6, long id6) {
                if (spin_pica.getSelectedItem().toString().trim().equals("S")) {
                    preis6 = (float) 4.90;
                }
                if (spin_pica.getSelectedItem().toString().trim().equals("M")) {
                    preis6 = (float) 6.90;
                }
                if (spin_pica.getSelectedItem().toString().trim().equals("L")) {
                    preis6 = (float) 9.50;
                }
                gpicante.setText(String.format("%.2f",preis6) + "€");
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        //Spinner Mexicana definieren
        spin_mex = (Spinner) findViewById(R.id.spin_mex);
        //Die Liste von Elementen im Spinner
        List<String> list7 = new ArrayList<>();
        list7.add ("Größe");
        list7.add ("S");
        list7.add ("M");
        list7.add ("L");
        //Adapter, um die Listenelemente in Spinner zu übertragen
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list7);
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_mex.setAdapter(adapter7);
        spin_mex.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent7, View view7, int position7, long id7) {
                if (spin_mex.getSelectedItem().toString().trim().equals("S")) {
                    preis7 = (float) 4.90;
                }if (spin_mex.getSelectedItem().toString().trim().equals("M")) {
                    preis7 = (float) 6.90;
                }if (spin_mex.getSelectedItem().toString().trim().equals("L")) {
                    preis7 = (float) 9.50;
                }
                gmexicana.setText(String.format("%.2f",preis7) + "€");
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
    // Anzahl an Pizzen +1
    public void increment () {
        if (pl_sat == true) {
            quantity1 = quantity1 + 1;
        }if (pl_mat == true) {
            quantity2 = quantity2 + 1;
        }if (pl_hat == true) {
            quantity3 = quantity3 + 1;
        }if (pl_vegt == true) {
            quantity4 = quantity4 + 1;
        }if (pl_spect == true) {
            quantity5 = quantity5 + 1;
        }if (pl_picat == true) {
            quantity6 = quantity6 + 1;
        }if (pl_mext == true) {
            quantity7 = quantity7 + 1;
        }
    }
    // Anzahl an pizzen -1
    public void decrement () {
        if (quantity1 >0 && mi_sat == true){
            quantity1 = quantity1 - 1;
        }if (quantity2 >0 && mi_mat == true){
            quantity2 = quantity2 - 1;
        }if (quantity3 >0 && mi_hat == true){
            quantity3 = quantity3 - 1;
        }if (quantity4 >0 && mi_vegt == true){
            quantity4 = quantity4 - 1;
        }if (quantity5 >0 && mi_spect == true){
            quantity5 = quantity5 - 1;
        }if (quantity6 >0 && mi_picat == true){
            quantity6 = quantity6 - 1;
        }if (quantity7 >0 && mi_mext == true){
            quantity7 = quantity7 - 1;
        }
    }
    private void display(int number) {
        if (pl_sat == true || mi_sat == true){
            e_sa.setText("" + number);
            pl_sat = false;
            mi_sat = false;

        }else if (pl_mat == true || mi_mat == true){
            e_ma.setText("" + number);
            pl_mat = false;
            mi_mat = false;
        }else if(pl_hat == true || mi_hat == true){
            e_ha.setText(""+ number);
            pl_hat = false;
            mi_hat = false;
        }else if(pl_vegt == true || mi_vegt == true){
            e_veg.setText(""+ number);
            pl_vegt = false;
            mi_vegt = false;
        }else if(pl_spect == true || mi_spect == true){
            e_spec.setText(""+ number);
            pl_spect = false;
            mi_spect = false;
        }else if(pl_picat == true || mi_picat == true){
            e_pica.setText(""+ number);
            pl_picat = false;
            mi_picat = false;
        }else if(pl_mext == true || mi_mext == true){
            e_mex.setText(""+ number);
            pl_mext = false;
            mi_mext = false;
        }
    }
    // Berechnung des Gesamtpreises
    public void gesamtpreis () {
        preis_sa = quantity1 * preis1;
        preis_ma = quantity2 * preis2;
        preis_ha = quantity3 * preis3;
        preis_veg = quantity4 * preis4;
        preis_spec = quantity5 * preis5;
        preis_pica = quantity6 * preis6;
        preis_mex = quantity7 * preis7;
        gespreis = preis_sa + preis_ma + preis_ha + preis_veg + preis_spec + preis_pica + preis_mex;
        gespreist.setText(String.format("%.2f",gespreis)+ "€");
    }
}