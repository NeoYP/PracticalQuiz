package sg.edu.rp.c346.practicalquiz;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvName;
    EditText etName;
    TextView tvAge;
    EditText etAge;
    TextView tvClass;

    @Override
    protected void onPause() {
        super.onPause();

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor prefEdit = prefs.edit();
        prefEdit.putString(s: "name", s1: "Peter");
        prefEdit.putInt(i: "age", 23);
        prefEdit.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this) ;
    String msg = prefs.getString(s:"name", s1:"Saved");



    String msg = "Saved";
    Toast toast = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT);
    toast.show();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.textViewName);
        etName = findViewById(R.id.editTextName);
        tvAge = findViewById(R.id.textViewAge);
        etAge = findViewById(R.id.editTextName);
        tvClass = findViewById(R.id.textViewClass);
    }
}
