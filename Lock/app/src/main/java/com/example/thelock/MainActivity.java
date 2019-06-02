package com.example.thelock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button resetBtn = (Button) findViewById(R.id.resetBtn);
        Firebase.setAndroidContext(this);

        resetBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int x = 12;
                int y = 23;

                TextView displayMsg = (TextView) findViewById(R.id.displayMsg);

                int result = x+y;
                displayMsg.setText(Integer.toString(result));

                BikeInfo info = new BikeInfo();

                info.setName("Shivam");
                info.setStatus(true, "PANIC");
            }
        });
    }
}
