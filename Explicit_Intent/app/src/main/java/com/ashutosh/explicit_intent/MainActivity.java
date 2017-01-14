package com.ashutosh.explicit_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn = (Button) findViewById(R.id.button);
    EditText editText = (EditText) findViewById(R.id.editText);
    EditText editTextNum = (EditText) findViewById(R.id.editTextNum);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);

                Bundle b = new Bundle();
                b.putString("name",editText.getText().toString() );
                b.putInt("roll", Integer.parseInt(editTextNum.getText().toString()));

                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}
