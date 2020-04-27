package me.pnani.emergencyservices;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LocationThing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_thing);

        Button fireButton = findViewById(R.id.fire);
        Button ambulanceButton = findViewById(R.id.ambulance);
        Button policeButton = findViewById(R.id.police);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        final String userName = bundle.getString("Name");
        String mobileNo = bundle.getString("MobileNo");
        final String relativeMobileNo = bundle.getString("RelativePhoneNo");

        final Context context = this;


        fireButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("Your family member "+userName +" is in danger. To know the exact location, click the Google Maps link" )
                        .setPositiveButton("Send", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Uri uri = Uri.parse("smsto:" + relativeMobileNo);
                                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                                intent.putExtra("sms_body", "Your family member "+userName +" is in danger. To know the exact location, click the Google Maps link\n\nhttps://www.google.com/maps/@17.4836143,78.4401258,15z");
                                startActivity(intent);
                            }
                        })
                        .setNeutralButton("Call instead", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + relativeMobileNo));
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .setTitle("Send message?");

                AlertDialog alert =builder.create();
                alert.show();
            }
        });



        ambulanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("Your family member "+userName +" is in danger. To know the exact location, click the Google Maps link" )
                        .setPositiveButton("Send", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Uri uri = Uri.parse("smsto:" + relativeMobileNo);
                                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                                intent.putExtra("sms_body", "Your family member"+userName +" is in danger. To know the exact location, click the Google Maps link\n\nhttps://www.google.com/maps/@17.4836143,78.4401258,15z");
                                startActivity(intent);
                            }
                        })
                        .setNeutralButton("Call instead", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + relativeMobileNo));
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .setTitle("Send message?");

                AlertDialog alert =builder.create();
                alert.show();
            }
        });


        policeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage("Your family member "+userName +" is in danger. To know the exact location, click the Google Maps link" )
                        .setPositiveButton("Send", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Uri uri = Uri.parse("smsto:" + relativeMobileNo);
                                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                                intent.putExtra("sms_body", "Your family member"+userName +" is in danger. To know the exact location, click the Google Maps link\n\nhttps://www.google.com/maps/@17.4836143,78.4401258,15z");
                                startActivity(intent);
                            }
                        })
                        .setNeutralButton("Call instead", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + relativeMobileNo));
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .setTitle("Send message?");

                AlertDialog alert =builder.create();
                alert.show();
            }
        });



    }
}