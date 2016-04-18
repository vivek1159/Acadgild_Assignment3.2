package com.example.vivek.assignment22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v)
    {
        if(v.getId()==R.id.red)
        {
            Toast.makeText(MainActivity.this,"Red",Toast.LENGTH_LONG).show();
            Log.d("Colour", "Red");
        }
        else if (v.getId()==R.id.orange)
        {
            Toast.makeText(MainActivity.this,"Orange",Toast.LENGTH_LONG).show();
            Log.d("Colour", "Orange");
        }
        else if (v.getId()==R.id.yellow)
        {
            Toast.makeText(MainActivity.this,"Yellow",Toast.LENGTH_LONG).show();
            Log.d("Colour", "Yellow");
        }
        else if (v.getId()==R.id.green)
        {
            Toast.makeText(MainActivity.this,"Green",Toast.LENGTH_LONG).show();
            Log.d("Colour", "Green");
        }
        else if (v.getId()==R.id.blue)
        {
            Toast.makeText(MainActivity.this,"Blue",Toast.LENGTH_LONG).show();
            Log.d("Colour", "Blue");
        }
        else if (v.getId()==R.id.indigo)
        {
            Toast.makeText(MainActivity.this,"Indigo",Toast.LENGTH_LONG).show();
            Log.d("Colour", "Indigo");
        }
        else if (v.getId()==R.id.violet)
        {
            Toast.makeText(MainActivity.this,"Violet",Toast.LENGTH_LONG).show();
            Log.d("Colour", "Violet");
        }
    }
}
