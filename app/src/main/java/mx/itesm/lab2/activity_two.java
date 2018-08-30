package mx.itesm.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class activity_two extends AppCompatActivity {

TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        text = findViewById(R.id.textView2);
        Intent otherIntent = getIntent();
        String myString = otherIntent.getStringExtra("thisString");
        text.setText(myString);
    }
}
