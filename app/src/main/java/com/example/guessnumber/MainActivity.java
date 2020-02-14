package com.example.guessnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    /* Fun to generate RANDOM NUMBER */
    public void randomNumberGenerate(){
        int number;

        //random number
        Random rand = new Random();
        randomNumber = rand.nextInt(10) + 1;

    }

    //button click
    public void onButtonClick(View view){
        EditText editText = findViewById(R.id.editText2);
        String number = editText.getText().toString();
        int num = Integer.parseInt(number);
        String msg;
        if(num > randomNumber) {
            msg = "GO Lower!";
        }else if(num< randomNumber){
            msg = "GO Higher!";
        }
        else{
            msg = "You GOT Right Answer";
        }

        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomNumberGenerate();

    }
}
