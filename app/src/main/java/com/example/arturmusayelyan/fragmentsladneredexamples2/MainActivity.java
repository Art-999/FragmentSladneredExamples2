package com.example.arturmusayelyan.fragmentsladneredexamples2;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener {
    private FragmentManager manager;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getSupportFragmentManager();
        textView = findViewById(R.id.show_fragments_change_text_view);
        manager.addOnBackStackChangedListener(this);
    }

    public void addA(View view) {
        FragmentA fragmentA = FragmentA.newInstance();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.frame_layout_fragments_container, fragmentA, "fragmentA");
        transaction.addToBackStack("addA");
        transaction.commit();
    }

    public void removeA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragmentA");
        if (fragmentA != null) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.remove(fragmentA);
            transaction.addToBackStack("removeA");
            transaction.commit();
        } else {
            Toast.makeText(this, "The Fragment A was not added before", Toast.LENGTH_LONG).show();
        }
    }

    public void replaceAWithB(View view) {
        FragmentB fragmentB = FragmentB.newInstance();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame_layout_fragments_container, fragmentB, "fragmentB");
        transaction.addToBackStack("replaceAWithB");
        transaction.commit();
    }

    public void addB(View view) {
        FragmentB fragmentB = FragmentB.newInstance();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.frame_layout_fragments_container, fragmentB, "fragmentB");
        transaction.addToBackStack("addB");
        transaction.commit();
    }

    public void removeB(View view) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag("fragmentB");
        if (fragmentB != null) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.remove(fragmentB);
            transaction.addToBackStack("removeB");
            transaction.commit();
        } else {
            Toast.makeText(this, "The Fragment B was not added before", Toast.LENGTH_LONG).show();
        }

    }

    public void replaceBWithA(View view) {
        FragmentA fragmentA = FragmentA.newInstance();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame_layout_fragments_container, fragmentA, "fragmentA");
        transaction.addToBackStack("replaceBWithA");
        transaction.commit();
    }

    public void attachA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragmentA");
        if (fragmentA != null) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.attach(fragmentA);
            transaction.addToBackStack("attachA");
            transaction.commit();
        }
    }

    public void detachA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragmentA");
        if (fragmentA != null) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.detach(fragmentA);
            transaction.addToBackStack("detachA");
            transaction.commit();
        }
    }

    public void back(View view) {
        manager.popBackStack();
    }

    public void popAddB(View view) {
        manager.popBackStack("addB", FragmentManager.POP_BACK_STACK_INCLUSIVE); // kam 0 0-n mi hat e jnjum
    }

    @Override
    public void onBackStackChanged() {
        textView.setText(textView.getText() + "\n");
        textView.setText(textView.getText() + "The current status of Back Stack");
        int count = manager.getBackStackEntryCount();
        for (int i = count - 1; i >= 0; i--) {
            FragmentManager.BackStackEntry entry = manager.getBackStackEntryAt(i);
            textView.setText(textView.getText() + " " + entry.getName() + " \n");
        }
        textView.setText(textView.getText() + "\n");
    }
}
