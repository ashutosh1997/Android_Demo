package com.ashutosh.event_handling;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private RelativeLayout relativeLayout;
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = (RelativeLayout) findViewById(R.id.activity_main);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);

        b1.setOnClickListener(MainActivity.this);
        b2.setOnClickListener(MainActivity.this);
        relativeLayout.setOnClickListener(MainActivity.this);


        b3 = (Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setBackgroundColor(Color.CYAN);
            }
        });
    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.button1)
        {
            relativeLayout.setBackgroundColor(Color.BLUE);
        }
        else if (v.getId()==R.id.button2)
        {
            relativeLayout.setBackgroundColor(Color.RED);
        }
        else relativeLayout.setBackgroundColor(Color.WHITE);
    }

    public void onButtonClick(View view) {
        relativeLayout.setBackgroundColor(Color.YELLOW);
        Toast.makeText(this,"Button 4 uses onClick attribute of xml",Toast.LENGTH_SHORT).show();
    }
}
