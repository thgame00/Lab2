package mx.itesm.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonMgr1;
    private Button buttonMgr2;
    private Button buttonMgr3;
    private EditText editTextMgr;
    private String myString;
    private TextView textViewMgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMgr1 = findViewById(R.id.button);
        buttonMgr2 = findViewById(R.id.button2);
        buttonMgr3 = findViewById(R.id.button3);
        editTextMgr = findViewById(R.id.editText);
        textViewMgr = findViewById(R.id.textView);

        //open Landscape/Portrait activity
        buttonMgr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(MainActivity.this, Activity_One.class);
                startActivity(intent1);
            }
        });

        //send input text to activity two
        buttonMgr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                myString = editTextMgr.getText().toString();
                Intent intent2 = new Intent(MainActivity.this, activity_two.class);
                intent2.putExtra("thisString", myString);
                startActivity(intent2);
            }
        });

        //change text in main activity
        buttonMgr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                textViewMgr.setText("You just clicked on the third button!");
            }
        });
    }
}
