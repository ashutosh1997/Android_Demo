package com.ashutosh.toolbardemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class StandaloneToolBar extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setTitle("Toolbar");
        toolbar.setSubtitle("Standalone Toolbar");
        /*toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setSubtitleTextColor(Color.WHITE);*/

        //Compatibility by Java
        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            toolbar.setElevation(10f);
        }*/

        /*toolbar.setLogo(R.drawable.good_day);
        toolbar.setNavigationIcon(R.drawable.navigation_back);
        toolbar.setOverflowIcon(R.drawable.);*/

        Button button = (Button) findViewById(R.id.button);
        button.setText("Toolbar as ActionBar");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StandaloneToolBar.this,ToolBarAsActionBar.class);
                startActivity(intent);
            }
        });

        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
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
                Toast.makeText(StandaloneToolBar.this,msg+" clicked !",Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }

}
