package ru.nsu.fit.android.hw_1;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Log.i("hw_1_LIST", "ON CREATE!!!");
        Spinner spinner = findViewById(R.id.spinner_example);
        spinner.setAdapter(ArrayAdapter.createFromResource(this,
                        R.array.list, android.R.layout.simple_spinner_item));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("hw_1_LIST", "ON START!!!");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i("hw_1_LIST", "ON RESUME!!!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("hw_1_LIST", "ON PAUSE!!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("hw_1_LIST", "ON STOP!!!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("hw_1_LIST", "ON DESTROY!!!");
    }
}
