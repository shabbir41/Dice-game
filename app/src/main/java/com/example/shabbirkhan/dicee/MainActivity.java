package com.example.shabbirkhan.dicee;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button roll;
        roll = (Button) findViewById(R.id.roll);
        final ImageView left = (ImageView) findViewById(R.id.leftdice);
        final ImageView right = (ImageView) findViewById(R.id.rightdice);
        final ImageView logo = (ImageView) findViewById(R.id.logo);
        final int[] dices = {R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6};
        final int l = R.drawable.congrats;
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2;
                Random r1 = new Random();
                n1 = r1.nextInt(6);
                left.setImageResource(dices[n1]);
                Random r2 = new Random();
                n2 = r2.nextInt(6);
                right.setImageResource(dices[n2]);
                if(n1 == n2){
                    AlertDialog.Builder my = new AlertDialog.Builder(MainActivity.this);
                    my.setTitle("Congrats");
                    my.setMessage("Hurray..!! You are the winner..!!");
                    my.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(MainActivity.this,"u r winner",Toast.LENGTH_SHORT).show();
                        }
                    });
                    my.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(MainActivity.this,"u r winner",Toast.LENGTH_SHORT).show();
                        }
                    });
                    my.show();

                }
            }
        });
    }
}
