package com.example.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner1 = (Spinner) findViewById(R.id.leftSpell);
        ArrayAdapter<CharSequence> leftAdapter = ArrayAdapter.createFromResource(this,
                R.array.spells_array, android.R.layout.simple_spinner_item);
        leftAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(leftAdapter);


        Spinner spinner2 = (Spinner) findViewById(R.id.rightSpell);
        ArrayAdapter<CharSequence> rightAdapter = ArrayAdapter.createFromResource(this,
                R.array.spells_array, android.R.layout.simple_spinner_item);
        leftAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(rightAdapter);
    }
}
