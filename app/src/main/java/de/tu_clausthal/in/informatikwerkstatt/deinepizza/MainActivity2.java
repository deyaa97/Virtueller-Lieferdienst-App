package de.tu_clausthal.in.informatikwerkstatt.deinepizza;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    // Buttons definieren
    Button pl_sa, mi_sa, pl_ma, mi_ma, pl_ha, mi_ha, pl_veg, mi_veg, pl_spec, mi_spec, pl_pica, mi_pica, pl_mex, mi_mex;
    boolean pl_sat, mi_sat, pl_mat, mi_mat, pl_hat, mi_hat, pl_vegt, mi_vegt, pl_spect, mi_spect, pl_picat, mi_picat, pl_mext, mi_mext;
    EditText e_sa, e_ma, e_ha, e_veg, e_spec, e_pica, e_mex;
    Spinner spin_sa, spin_ma, spin_ha, spin_veg, spin_spec, spin_pica, spin_mex, spin;
    int quantity1 = 0;
    int quantity2 = 0;
    int quantity3 = 0;
    int quantity4 = 0;
    String item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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


        pl_sa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                increment(quantity1);
                pl_sat = true;
                display(quantity1);
            }
        });
        mi_sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrement(quantity1);
                mi_sat = true;
                display(quantity1);
            }
        });

        pl_ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increment(quantity2);
                pl_mat = true;
                display(quantity2);
            }
        });
        mi_ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrement(quantity2);
                mi_mat = true;
                display(quantity2);
            }
        });
        //Spinner definieren
        spin = (Spinner) findViewById(R.id.spin_sa);
        //Die Liste von Elementen im Spinner
        List<String> list = new ArrayList<>();
        list.add ("Wähle aus");
        list.add ("Pizza");
        list.add ("Burger");
        list.add ("Pommes");
        list.add ("Fisch");
        list.add ("Hotdog");

        //Adapter, um die Listenelemente in Spinner zu übertragen
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spin.setAdapter(adapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                item = parent.getItemAtPosition(position).toString();

                //wenn das 1. Element gewählt ist, macht nichts, wenn ein anderes dann zeigt den Toast
                if (position > 0) {
                    Toast.makeText(MainActivity2.this, "Lecker! du bekommst " + item, Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {


            }
        });
    }
    public void increment (int view) {
        quantity1 = quantity1 + 1;
        quantity2 = quantity2 + 1;
    }
    public void decrement (int view) {
        if (quantity1 >0){
            quantity1 = quantity1 - 1;
        }if (quantity2 >0){
            quantity2 = quantity2 - 1;
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
        }else if(pl_vegt == true || mi_vegt == true){
            e_veg.setText(""+ number);
        }else if(pl_spect == true || mi_spect == true){
            e_spec.setText(""+ number);
        }else if(pl_mext == true || mi_mext == true){
            e_mex.setText(""+ number);
        }
    }

}