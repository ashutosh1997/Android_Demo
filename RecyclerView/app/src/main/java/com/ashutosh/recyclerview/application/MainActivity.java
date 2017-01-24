package com.ashutosh.recyclerview.application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.ashutosh.recyclerview.R;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle("Home Page");
        toolbar.setSubtitle("");

        toolbar.inflateMenu(R.menu.menu_main);
        setUpRecyclerView();

        
        /*toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String msg = "";

                switch (item.getItemId())
                {
                    case R.id.search:
                        msg = "search";
                        break;

                    case R.id.delete:
                        msg = "delete";
                        break;

                    case R.id.settings:
                        msg = "settings";
                        break;

                    case R.id.edit:
                        msg = "edit";
                        break;

                    case R.id.Exit:
                        msg = "Exit";
                        break;
                }
                Toast.makeText(MainActivity.this,msg+" clicked !",Toast.LENGTH_SHORT).show();
                return true;
            }
        });*/

    }

    private void setUpRecyclerView() {

    }

}
