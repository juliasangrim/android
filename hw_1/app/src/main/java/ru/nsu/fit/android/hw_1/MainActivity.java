package ru.nsu.fit.android.hw_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("hw_1_MAIN", "ON CREATE!!!");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("hw_1_MAIN", "ON START!!!");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i("hw_1_MAIN", "ON RESUME!!!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("hw_1_MAIN", "ON PAUSE!!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("hw_1_MAIN", "ON STOP!!!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("hw_1_MAIN", "ON DESTROY!!!");
    }

    public void clickOnButton(View view) {
        Log.i("hw_1_MAIN", "CLICKED!!!");
        startActivity(new Intent(this, ListActivity.class));
    }
}