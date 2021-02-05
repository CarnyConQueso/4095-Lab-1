package com.example.lab;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String C_TAG = "ON_CREATE";
    private final String S_TAG = "ON_START";
    private final String R_TAG = "ON_RESUMED";
    private final String P_TAG = "ON_PAUSED";
    private final String ST_TAG = "ON_STOP";
    private final String D_TAG = "ON_DESTROY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(C_TAG, "onCreate opened no longer non-existant");
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });
    }

    public void onStart() {
        super.onStart();
        Log.i(S_TAG, "The application was stopped now paused");
    }

    public void onResume() {
        super.onResume();
        Log.i(R_TAG, "The application was paused now resumed");
    }

    public void onPause() {
        super.onPause();
        Log.i(P_TAG, "The application was resumed but now paused");
    }

    public void onStop() {
        super.onStop();
        Log.i(ST_TAG, "The application was paused now stopped");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(D_TAG, "The application was stopped now destroyed");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}