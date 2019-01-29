package de.tu_clausthal.in.informatikwerkstatt.deinepizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView Pizza_sort,Pizza_sort2,Pizza_sort3,Pizza_sort4,Pizza_sort5,Pizza_sort6,Pizza_sort7,
            Pizza_quantity,Pizza_quantity2,Pizza_quantity3,Pizza_quantity4,Pizza_quantity5,
            Pizza_quantity6,Pizza_quantity7,Pizza_grosse,Pizza_grosse2,Pizza_grosse3,Pizza_grosse4,Pizza_grosse5,Pizza_grosse6,Pizza_grosse7;
    String sort,sort2,sort3,sort4,sort5,sort6,sort7,quan,quan2,quan3,quan4,quan5,quan6,quan7,grosse,grosse2,grosse3,grosse4,grosse5,grosse6,grosse7;
    Button liefern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        liefern = (Button) findViewById(R.id.liefern1);
        liefern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liefernIntent = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(liefernIntent);
            }
        });

        Pizza_sort = (TextView) findViewById(R.id.pizza_sort);
        Pizza_sort2= (TextView) findViewById(R.id.pizza_sort2);
        Pizza_sort3= (TextView) findViewById(R.id.pizza_sort3);
        Pizza_sort4= (TextView) findViewById(R.id.pizza_sort4);
        Pizza_sort5= (TextView) findViewById(R.id.pizza_sort5);
        Pizza_sort6= (TextView) findViewById(R.id.pizza_sort6);
        Pizza_sort7= (TextView) findViewById(R.id.pizza_sort7);
        Pizza_quantity = (TextView) findViewById(R.id.pizza_quantity);
        Pizza_quantity2 = (TextView) findViewById(R.id.pizza_quantity2);
        Pizza_quantity3 = (TextView) findViewById(R.id.pizza_quantity3);
        Pizza_quantity4 = (TextView) findViewById(R.id.pizza_quantity4);
        Pizza_quantity5 = (TextView) findViewById(R.id.pizza_quantity5);
        Pizza_quantity6 = (TextView) findViewById(R.id.pizza_quantity6);
        Pizza_quantity7 = (TextView) findViewById(R.id.pizza_quantity7);
        Pizza_grosse = (TextView) findViewById(R.id.grosse);
        Pizza_grosse2 = (TextView) findViewById(R.id.grosse2);
        Pizza_grosse3 = (TextView) findViewById(R.id.grosse3);
        Pizza_grosse4 = (TextView) findViewById(R.id.grosse4);
        Pizza_grosse5 = (TextView) findViewById(R.id.grosse5);
        Pizza_grosse6 = (TextView) findViewById(R.id.grosse6);
        Pizza_grosse7 = (TextView) findViewById(R.id.grosse7);


        Bundle extras = getIntent().getExtras();
        if (extras != null){
            sort = extras.getString("sort");
            sort2 = extras.getString("sort2");
            sort3 = extras.getString("sort3");
            sort4 = extras.getString("sort4");
            sort5 = extras.getString("sort5");
            sort6 = extras.getString("sort6");
            sort7 = extras.getString("sort7");
            quan = extras.getString("quantity");
            quan2 = extras.getString("quantity2");
            quan3 = extras.getString("quantity3");
            quan4 = extras.getString("quantity4");
            quan5 = extras.getString("quantity5");
            quan6 = extras.getString("quantity6");
            quan7 = extras.getString("quantity7");
            grosse = extras.getString("grosse");
            grosse2 = extras.getString("grosse2");
            grosse3 = extras.getString("grosse3");
            grosse4 = extras.getString("grosse4");
            grosse5 = extras.getString("grosse5");
            grosse6 = extras.getString("grosse6");
            grosse7 = extras.getString("grosse7");
        }
        Pizza_sort.setText(sort);
        Pizza_sort2.setText(sort2);
        Pizza_sort3.setText(sort3);
        Pizza_sort4.setText(sort4);
        Pizza_sort5.setText(sort5);
        Pizza_sort6.setText(sort6);
        Pizza_sort7.setText(sort7);
        Pizza_quantity.setText(quan);
        Pizza_quantity2.setText(quan2);
        Pizza_quantity3.setText(quan3);
        Pizza_quantity4.setText(quan4);
        Pizza_quantity5.setText(quan5);
        Pizza_quantity6.setText(quan6);
        Pizza_quantity7.setText(quan7);
        Pizza_grosse.setText(grosse);
        Pizza_grosse2.setText(grosse2);
        Pizza_grosse3.setText(grosse3);
        Pizza_grosse4.setText(grosse4);
        Pizza_grosse5.setText(grosse5);
        Pizza_grosse6.setText(grosse6);
        Pizza_grosse7.setText(grosse7);

    }
}
