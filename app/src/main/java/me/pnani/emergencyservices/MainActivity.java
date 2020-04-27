package me.pnani.emergencyservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name = findViewById(R.id.name);
        final EditText mobNo = findViewById(R.id.number);
        final EditText relPhNo = findViewById(R.id.fammemnum);
        final TextView errorText = findViewById(R.id.errorMessages);



        Button button = findViewById(R.id.submitButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mobNo.length() != 10 || relPhNo.length() != 10) {
                    if(mobNo.length() == 0) {
                        errorText.setVisibility(View.INVISIBLE);

                    } else {

                        errorText.setVisibility(View.VISIBLE);
                    }
                } else {
                    Intent intent = new Intent(MainActivity.this, LocationThing.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("Name", name.getText().toString());
                    bundle.putString("MobileNo", mobNo.getText().toString());
                    bundle.putString("RelativePhoneNo", relPhNo.getText().toString());
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        });
    }
}