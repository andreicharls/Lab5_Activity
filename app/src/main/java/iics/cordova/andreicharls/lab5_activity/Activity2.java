package iics.cordova.andreicharls.lab5_activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    private static final String Tag = "4ITI Lab Act. 5";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Tag, "onCreate executed");
        setContentView(R.layout.activity_2);

        Button buttonAct1 = (Button) findViewById(R.id.buttonAct1);
        buttonAct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent movetoAct1 = new Intent(getApplicationContext(), Activity1.class);
                startActivity(movetoAct1);
            }
        });

        Button buttonMap2 = (Button) findViewById(R.id.buttonMap2);
        buttonMap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri intentUrl = Uri.parse("geo:14.6177403,120.9997243");
                Intent movetoMap = new Intent(Intent.ACTION_VIEW, intentUrl);
                movetoMap.setPackage("com.google.android.apps.maps");
                if (movetoMap.resolveActivity(getPackageManager()) != null) {
                    startActivity(movetoMap);
                }
            }
        });
    }

    protected void onStart() {
        super.onStart();
        Log.d(Tag, "onStart executed");
    }

    protected void onPause() {
        super.onPause();
        Log.d(Tag, "onPause executed");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d(Tag, "onRestart executed");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d(Tag, "onDestroy executed");
    }

    protected void onStop() {
        super.onStop();
        Log.d(Tag, "onStop executed");
    }

    protected void onResume() {
        super.onResume();
        Log.d(Tag, "onResume executed");
    }
}
