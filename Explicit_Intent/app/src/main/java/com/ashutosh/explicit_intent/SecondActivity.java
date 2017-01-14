package com.ashutosh.explicit_intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ASHUTOSH on 15-Jan-17.
 */

public class SecondActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        TextView tw = (TextView) findViewById(R.id.textView);
        StringBuilder msg = new StringBuilder("");

        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        if(b.containsKey("name"))
        {
            String name = b.getString("name");
            msg.append("Name : ").append(name);
        }
        if (b.containsKey("roll"))
        {
            int roll = b.getInt("roll");
            msg.append("\nRoll : ").append(roll);
        }

        tw.setText(msg);

    }

}
