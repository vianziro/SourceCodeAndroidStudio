package com.praktek.testiq;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class testiq extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final Button btnSMAIPA = (Button)findViewById(R.id.btnSMAIPA);
        final Button btnSMAIPS = (Button)findViewById(R.id.btnSMAIPS);
        
        btnSMAIPA.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	calQuizSMAIPA();
            }
        });

        btnSMAIPS.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                calQuizSMAIPS();
            }
        });
    }
    
    public void calQuizSMAIPA(){
        Intent i = new Intent(this, SoalSMAIPA.class);
        startActivity(i);
    }

    public void calQuizSMAIPS(){
        Intent i = new Intent(this, SoalSMAIPS.class);
        startActivity(i);
    }
}