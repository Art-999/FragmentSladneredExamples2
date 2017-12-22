package com.example.arturmusayelyan.fragmentsladneredexamples2;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by artur.musayelyan on 22/12/2017.
 */

public class FragmentB extends Fragment {
    public FragmentB() {

    }

    public static FragmentB newInstance() {
        Bundle args = new Bundle();
        FragmentB fragment = new FragmentB();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        Log.d("Art", "Fragment B onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("Art", "Fragment B onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("Art", "Fragment B OnCreateView");
        return inflater.inflate(R.layout.b_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Art", "Fragment B onActivityCreated");
    }

    @Override
    public void onStart() {
        Log.d("Art", "Fragment B onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d("Art", "Fragment B onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d("Art", "Fragment B onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d("Art", "Fragment B onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d("Art", "Fragment B onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("Art", "Fragment B onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("Art", "Fragment B onDetach");
        super.onDetach();
    }
}
