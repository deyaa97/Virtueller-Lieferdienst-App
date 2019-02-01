package de.tu_clausthal.in.informatikwerkstatt.deinepizza;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    String sort,sort2,sort3,sort4,sort5,sort6,sort7,quan,quan2,quan3,quan4,quan5,quan6,quan7,grosse,grosse2,grosse3,grosse4,grosse5,grosse6,grosse7;
    Button liefern;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        liefern = (Button) findViewById(R.id.liefern1);
        liefern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sort == null && sort2 == null && sort3 == null && sort4 == null && sort5 == null && sort6== null && sort7 == null){
                    Toast.makeText(MainActivity4.this, "Bitte eine Pizza auswählen", Toast.LENGTH_SHORT).show();
                }else {
                    Intent liefernIntent = new Intent(MainActivity4.this, MainActivity5.class);
                    startActivity(liefernIntent);
                }
            }
        });
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
        listView = (ListView)findViewById(R.id.list_view);
        ArrayList<String> arrayList = new ArrayList<>();
        if (sort != null) {
            arrayList.add(sort + " " + quan + " " + grosse);
        }if (sort2 != null){
            arrayList.add(sort2 + " " + quan2 + " " + grosse2);
        }if (sort3 != null){
            arrayList.add(sort3 + " " + quan3 + " " + grosse3);
        }if (sort4 != null){
            arrayList.add(sort4 + " " + quan4 + " " + grosse4);
        }if (sort5 != null){
            arrayList.add(sort5 + " " + quan5 + " " + grosse5);
        }if (sort6 != null){
            arrayList.add(sort6 + " " + quan6 + " " + grosse6);
        }if (sort7 != null){
            arrayList.add(sort7 + " " + quan7 + " " + grosse7);
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity4.this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
    }
}
