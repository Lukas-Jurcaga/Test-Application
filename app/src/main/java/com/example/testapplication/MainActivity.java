package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private Button cunt_button;
    private boolean cuntIsEnabled = true;
    private final ArrayList<String> cuntySentences = new ArrayList<>(Arrays.asList("Bitch", "You cunt!", "Stop it ya cunt", "You actual mong", "Fuckin cunt", "Na actually allow it", "Fuck off g", "Twat", "Pisshead", "Cunt face", "FAM", "DICKHEAD"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cunt_button = findViewById(R.id.the_cunt_button);

    }

    public void pissOffTheCunt(View view){
        Button button = (Button) view;
        view.setEnabled(false);
        Log.d("success", "Button disabled");
        button.setText("Piss off");

        //Makes the button a random sentence
        double rand = Math.random() * (cuntySentences.size() - 1);
        cunt_button.setText(cuntySentences.get((int) Math.round(rand)));

        if(cuntIsEnabled) {
            cunt_button.setEnabled(false);
            cuntIsEnabled = false;
        }else{
            cunt_button.setEnabled(true);
            cuntIsEnabled = true;
        }
    }

    public void tryTouchingTheCunt(View view){
        Button button = (Button) view;
        button.setText("HEHE YOU CANT TOUCH ME YOU LIL BITCH!");
        handleCuntyInput();
    }

    public void handleCuntyInput(){
        EditText editText = findViewById(R.id.cunty_input);
        String input = editText.getText().toString();
        Log.d("info", "Input recorded!");
        cuntySentences.add(input);
        Log.d("info", "Input added to array list! The program is now more of a cunt then ever! Cheers.");
    }
}