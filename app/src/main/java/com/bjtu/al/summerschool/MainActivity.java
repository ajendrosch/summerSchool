package com.bjtu.al.summerschool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageButton imageButton;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = (ImageButton) findViewById(R.id.recordButton);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(MainActivity.this,
                        "ImageButton is clicked!", Toast.LENGTH_SHORT).show();

            }

        });
    }

}
