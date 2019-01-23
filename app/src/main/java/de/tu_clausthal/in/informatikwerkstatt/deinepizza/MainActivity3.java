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




    }
}
