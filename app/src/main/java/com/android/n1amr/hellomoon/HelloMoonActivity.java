package com.android.n1amr.hellomoon;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;


public class HelloMoonActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_moon);

        FragmentManager fragmentManager = getFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.helloMoonFragment);

        if (fragment == null) {
            fragment = new HelloMoonFragment();
            fragmentManager.beginTransaction().add(R.id.helloMoonFragment, fragment).commit();
        }

    }

}
