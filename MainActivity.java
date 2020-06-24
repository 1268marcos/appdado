package com.example.dadoaula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageViewDice;
    private Random rng = new Random();

    private void rollDice(){
        int randomNumber = rng.nextInt(6) + 1;

        switch ( randomNumber ){
            case 1: mImageViewDice.setImageResource(R.drawable.dice1); break;
            case 2: mImageViewDice.setImageResource(R.drawable.dice2); break;
            case 3: mImageViewDice.setImageResource(R.drawable.dice3); break;
            case 4: mImageViewDice.setImageResource(R.drawable.dice4); break;
            case 5: mImageViewDice.setImageResource(R.drawable.dice5); break;
            case 6: mImageViewDice.setImageResource(R.drawable.dice6); break;
        }

    }

    public class DiceClick implements View.OnClickListener{
        @Override
        public void onClick(View view){
            rollDice();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageViewDice = findViewById(R.id.image_view_dice);

        mImageViewDice.setOnClickListener(new DiceClick());

    }
}
