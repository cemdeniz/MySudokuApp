package com.example.cemdeniz.sudokuapp.SudokuMain;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.cemdeniz.sudokuapp.R;
import com.example.cemdeniz.sudokuapp.SudokuDifficulties.AdvancedSudoku;
import com.example.cemdeniz.sudokuapp.SudokuDifficulties.BeginnerSudoku;
import com.example.cemdeniz.sudokuapp.SudokuDifficulties.ExpertSudoku;
import com.example.cemdeniz.sudokuapp.SudokuDifficulties.HardestSudoku;
import com.example.cemdeniz.sudokuapp.SudokuDifficulties.IntermediateSudoku;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("✯ Sudoku");

        final Button beginnerBtn = (Button) findViewById(R.id.BeginnerBtn);
        final Button intermediateBtn = (Button) findViewById(R.id.IntermediateBtn);
        final Button advancedBtn = (Button) findViewById(R.id.AdvancedBtn);
        final Button expertBtn = (Button) findViewById(R.id.ExpertBtn);
        final Button hardestBtn = (Button) findViewById(R.id.hardestBtn);
        final Button howToBtn = (Button) findViewById(R.id.howToBtn);
        final Button historyBtn = (Button) findViewById(R.id.historyBtn);

        beginnerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, BeginnerSudoku.class );
                startActivity(i);

            }
        });


       intermediateBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, IntermediateSudoku.class );
                startActivity(i);


            }
        });


        advancedBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, AdvancedSudoku.class );
                startActivity(i);
            }
        });


        expertBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this, ExpertSudoku.class );
                startActivity(i);

            }
        });

        hardestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this, HardestSudoku.class );
                startActivity(i);
            }
        });

        howToBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tx = (TextView) findViewById(R.id.aboutSudokuView);
                tx.setText(null);
                tx.setTextSize(17);
                tx.setText("A Sudoku puzzle consists of 81 cells which are divided into nine columns, rows and regions. The task is now to place the numbers from 1 to 9 into the empty cells in such a way that in every row, column and 3×3 region each number appears only once.");


            }
        });

        historyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView tx = (TextView) findViewById(R.id.aboutSudokuView);
                tx.setText(null);
                tx.setTextSize(16);
                tx.setText("The roots of the Sudoku puzzle are in the Switzerland. Leonhard Euler created in the 18h century which is similar to a Sudoku puzzle but without the additional constraint on the contents of individual regions. The first real Sudoku was published in 1979 and was invented by Howard Garns, an American architect.");

            }
        });







    }

}

