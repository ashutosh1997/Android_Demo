package com.ashutosh.fragmentdemo2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FragmentManager manager = getFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFragmentA(View view) {
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container,fragmentA,"fragmentA");
        transaction.commit();
    }

    public void removeFragmentA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragmentA");
        if (fragmentA != null) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.remove(fragmentA);
            transaction.commit();
        }
        else {
            Toast.makeText(this, "Fragment A not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void addFragmentB(View view) {
        FragmentB fragmentB = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container,fragmentB,"fragmentB");
        transaction.commit();
    }

    public void removeFragmentB(View view) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag("fragmentB");
        if (fragmentB != null) {
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.remove(fragmentB);
        transaction.commit();
        }
        else {
            Toast.makeText(this, "Fragment B not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void attachFragmentA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragmentA");
        if (fragmentA != null) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.attach(fragmentA);
            transaction.commit();
        }
        else {
            Toast.makeText(this, "Fragment A not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void detachFragmentA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragmentA");
        if (fragmentA != null) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.detach(fragmentA);
            transaction.commit();
        }
        else {
            Toast.makeText(this, "Fragment A not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void showA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragmentA");
        if (fragmentA != null) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.show(fragmentA);
            transaction.commit();
        }
        else {
            Toast.makeText(this, "Fragment A not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void hideA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragmentA");
        if (fragmentA != null) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.hide(fragmentA);
            transaction.commit();
        }
        else {
            Toast.makeText(this, "Fragment A not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void replaceByA(View view) {
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container,fragmentA,"fragmentA");
        transaction.commit();
    }

    public void replaceByB(View view) {
        FragmentB fragmentB = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container,fragmentB,"fragmentB");
        transaction.commit();
    }
}
