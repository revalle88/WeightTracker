package com.paranoid.android.weighttracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.bAddWeight);
        Button btnStat = (Button) findViewById(R.id.bStat);

        button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                goToSecondActivity();

            }

        });

        btnStat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToStatActivity();
            }
        });


    }

    private void goToSecondActivity() {

        Intent intent = new Intent(this, SecondActivity.class);

        startActivity(intent);

    }

    private void goToStatActivity() {

        Intent intent = new Intent(this, StatActivity.class);

        startActivity(intent);

    }
}
