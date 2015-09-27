package com.example.android.projectzero;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnProject1;
    private Button btnProject2;
    private Button btnProject3;
    private Button btnProject4;
    private Button btnProject5;
    private Button btnProject6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProject1 = (Button) findViewById(R.id.btnProject1);
        btnProject2 = (Button) findViewById(R.id.btnProject2);
        btnProject3 = (Button) findViewById(R.id.btnProject3);
        btnProject4 = (Button) findViewById(R.id.btnProject4);
        btnProject5 = (Button) findViewById(R.id.btnProject5);
        btnProject6 = (Button) findViewById(R.id.btnProject6);

        btnProject1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my Spotify Streamer App",Toast.LENGTH_LONG).show();
            }
        });

        btnProject2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my Scores App",Toast.LENGTH_LONG).show();
            }
        });

        btnProject3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my Library App",Toast.LENGTH_LONG).show();
            }
        });

        btnProject4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my Build It Bigger App",Toast.LENGTH_LONG).show();
            }
        });

        btnProject5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my XYZ Reader App",Toast.LENGTH_LONG).show();
            }
        });

        btnProject6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"This button will launch my Capstone App",Toast.LENGTH_LONG).show();
            }
        });
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
