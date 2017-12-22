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

public class FragmentA extends Fragment {
    public FragmentA() {

    }

    public static FragmentA newInstance() {
        Bundle args = new Bundle();
        FragmentA fragment = new FragmentA();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        Log.d("Art", "Fragment A onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("Art", "Fragment A onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("Art", "Fragment A onCreateView");
        return inflater.inflate(R.layout.a_fragment,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.d("Art", "Fragment A onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d("Art","Fragment A onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d("Art", "Fragment A onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d("Art", "Fragment A onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d("Art", "Fragment A onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.d("Art", "Fragment A onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("Art", "Fragment A onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("Art", "Fragment A onDetach");
        super.onDetach();
    }
}
