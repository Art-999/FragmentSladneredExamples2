package com.example.arturmusayelyan.fragmentsladneredexamples2;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getSupportFragmentManager();
    }

    public void addA(View view) {
        FragmentA fragmentA = FragmentA.newInstance();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.frame_layout_fragments_container, fragmentA, "fragmentA");
        transaction.commit();
    }

    public void removeA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragmentA");
        if (fragmentA != null) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.remove(fragmentA);
            transaction.commit();
        } else {
            Toast.makeText(this, "The Fragment A was not added before", Toast.LENGTH_LONG).show();
        }
    }

    public void replaceAWithB(View view) {
        FragmentB fragmentB = FragmentB.newInstance();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame_layout_fragments_container, fragmentB, "fragmentB");
        transaction.commit();
    }

    public void addB(View view) {
        FragmentB fragmentB = FragmentB.newInstance();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.frame_layout_fragments_container, fragmentB, "fragmentB");
        transaction.commit();
    }

    public void removeB(View view) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag("fragmentB");
        if (fragmentB != null) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.remove(fragmentB);
            transaction.commit();
        } else {
            Toast.makeText(this, "The Fragment B was not added before", Toast.LENGTH_LONG).show();
        }

    }

    public void replaceBWithA(View view) {
        FragmentA fragmentA = FragmentA.newInstance();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame_layout_fragments_container, fragmentA, "fragmentA");
        transaction.commit();
    }

    public void attachA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragmentA");
        if (fragmentA != null) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.attach(fragmentA);
            transaction.commit();
        }
    }

    public void detachA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragmentA");
        if (fragmentA != null) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.detach(fragmentA);
            transaction.commit();
        }
    }

    public void back(View view) {

    }

    public void popAddB(View view) {

    }
}
