package iics.cordova.andreicharls.lab5_activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Button buttonAct2 = (Button) findViewById(R.id.buttonAct2);
        buttonAct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent movetoAct2 = new Intent(getApplicationContext(), Activity2.class);
                startActivity(movetoAct2);
            }
        });

        Button buttonMap1 = (Button) findViewById(R.id.buttonMap1);
        buttonMap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri intentUrl = Uri.parse("geo:14.5565932,120.9830243");
                Intent movetoMap = new Intent(Intent.ACTION_VIEW, intentUrl);
                movetoMap.setPackage("com.google.android.apps.maps");
                if (movetoMap.resolveActivity(getPackageManager()) != null) {
                    startActivity(movetoMap);
                }
            }
        });
    }
}
