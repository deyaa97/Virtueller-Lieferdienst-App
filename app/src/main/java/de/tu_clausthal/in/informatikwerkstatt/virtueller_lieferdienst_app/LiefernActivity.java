package de.tu_clausthal.in.informatikwerkstatt.virtueller_lieferdienst_app;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LiefernActivity extends AppCompatActivity {
    EditText editTextVorname, editTextNachname, editTextAdresse;
    Button button_bestellen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liefern);

        editTextVorname = (EditText) findViewById(R.id.vorname);
        editTextNachname = (EditText) findViewById(R.id.nachname);
        editTextAdresse = (EditText) findViewById(R.id.adresse);
        button_bestellen = (Button) findViewById(R.id.bestellen);

        editTextVorname.addTextChangedListener(textWatcher);
        editTextNachname.addTextChangedListener(textWatcher);
        editTextAdresse.addTextChangedListener(textWatcher);

        button_bestellen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LiefernActivity.this, PopUpActivity.class));
            }
        });
    }
    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String vornameInput = editTextVorname.getText().toString().trim();
            String nachnameInput = editTextNachname.getText().toString().trim();
            String adresseInput = editTextAdresse.getText().toString().trim();

            button_bestellen.setEnabled(!vornameInput.isEmpty() && !nachnameInput.isEmpty() && !adresseInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
