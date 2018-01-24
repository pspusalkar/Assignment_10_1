package com.example.poojajoshi.assignment_10_1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText text = findViewById(R.id.editText);
        Button submitButton = findViewById(R.id.button);

        // Set the button on Click Listener
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("key", text.getText().toString());

                // create fragment and set the arguments
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentClaass hello = new FragmentClaass();
                hello.setArguments(bundle);
                fragmentTransaction.add(R.id.vLayout, hello, text.getText().toString());
                fragmentTransaction.commit();
            }
        });
    }
}
