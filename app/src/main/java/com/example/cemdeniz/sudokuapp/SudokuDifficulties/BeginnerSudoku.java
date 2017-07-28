package com.example.cemdeniz.sudokuapp.SudokuDifficulties;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cemdeniz.sudokuapp.R;
import com.example.cemdeniz.sudokuapp.SudokuTools.CompleteSudoku;
import com.example.cemdeniz.sudokuapp.SudokuTools.SudokuAdapter;
import com.example.cemdeniz.sudokuapp.SudokuTools.SudokuGenerator;

import java.util.ArrayList;

/**
 * Created by cemdeniz on 20.07.2017.
 */

public class BeginnerSudoku extends Activity {
    ArrayList<Integer> boardArrayList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sudoku_board);

        Button checker = (Button) findViewById(R.id.checker);
        Button doneBtn = (Button) findViewById(R.id.doneBtn);
        boardArrayList.clear();
        TextView tx = (TextView) findViewById(R.id.sudokuView);
        tx.setText(null);
        tx.setText("♠ Beginner Sudoku ♠");
        final SudokuGenerator generator = new SudokuGenerator();
        int[][] test = generator.nextBoard(26);

        for (int i = 0; i < 9; i++) {
            int j;
            for (j = 0; j < 9; j++) {
                boardArrayList.add(test[i][j]);
            }
        }
        GridView gridView = (GridView) findViewById(R.id.SudokuGridView);
        gridView.setAdapter(new SudokuAdapter(BeginnerSudoku.this, boardArrayList));


        checker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((boardArrayList).equals((generator.completeArrayList)))
                    Toast.makeText(getApplicationContext(),"Congratulations. You finished it! :)",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"It's not correct. Try again when you finished. You can do it !",Toast.LENGTH_LONG).show();
            }
        });

        doneBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i=new Intent(BeginnerSudoku.this, CompleteSudoku.class );
                i.putExtra("complete",generator.completeArrayList);
                startActivity(i);
            }
        }
        );
    }

}