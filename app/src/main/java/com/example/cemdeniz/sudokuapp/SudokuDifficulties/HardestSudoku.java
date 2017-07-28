package com.example.cemdeniz.sudokuapp.SudokuDifficulties;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import com.example.cemdeniz.sudokuapp.R;
import com.example.cemdeniz.sudokuapp.SudokuTools.CompleteSudoku;
import com.example.cemdeniz.sudokuapp.SudokuTools.SudokuAdapter;

import java.util.ArrayList;

/**
 * Created by cemdeniz on 25.07.2017.
 */

public class HardestSudoku extends Activity {
    ArrayList<Integer> hardestArrayList = new ArrayList<>();
    ArrayList<Integer> hardestArrayListAnswer = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hardest_sudoku);

        Button hardestChecker = (Button) findViewById(R.id.hardestChecker);
        Button doneBtn = (Button) findViewById(R.id.doneBtn);


        //World's hardest sudoku view.

        hardestArrayList.add(8);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(3);
        hardestArrayList.add(6);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(7);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(9);
        hardestArrayList.add(0);
        hardestArrayList.add(2);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(5);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(7);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(4);
        hardestArrayList.add(5);
        hardestArrayList.add(7);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(1);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(3);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(1);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(6);
        hardestArrayList.add(8);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(8);
        hardestArrayList.add(5);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(1);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(9);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(0);
        hardestArrayList.add(4);
        hardestArrayList.add(0);
        hardestArrayList.add(0);


        // World's hardest sudoku answer.

        hardestArrayListAnswer.add(8);
        hardestArrayListAnswer.add(1);
        hardestArrayListAnswer.add(2);
        hardestArrayListAnswer.add(7);
        hardestArrayListAnswer.add(5);
        hardestArrayListAnswer.add(3);
        hardestArrayListAnswer.add(6);
        hardestArrayListAnswer.add(4);
        hardestArrayListAnswer.add(9);
        hardestArrayListAnswer.add(9);
        hardestArrayListAnswer.add(4);
        hardestArrayListAnswer.add(3);
        hardestArrayListAnswer.add(6);
        hardestArrayListAnswer.add(8);
        hardestArrayListAnswer.add(2);
        hardestArrayListAnswer.add(1);
        hardestArrayListAnswer.add(7);
        hardestArrayListAnswer.add(5);
        hardestArrayListAnswer.add(6);
        hardestArrayListAnswer.add(7);
        hardestArrayListAnswer.add(5);
        hardestArrayListAnswer.add(4);
        hardestArrayListAnswer.add(9);
        hardestArrayListAnswer.add(1);
        hardestArrayListAnswer.add(2);
        hardestArrayListAnswer.add(8);
        hardestArrayListAnswer.add(3);
        hardestArrayListAnswer.add(1);
        hardestArrayListAnswer.add(5);
        hardestArrayListAnswer.add(4);
        hardestArrayListAnswer.add(2);
        hardestArrayListAnswer.add(3);
        hardestArrayListAnswer.add(7);
        hardestArrayListAnswer.add(8);
        hardestArrayListAnswer.add(9);
        hardestArrayListAnswer.add(6);
        hardestArrayListAnswer.add(3);
        hardestArrayListAnswer.add(6);
        hardestArrayListAnswer.add(9);
        hardestArrayListAnswer.add(8);
        hardestArrayListAnswer.add(4);
        hardestArrayListAnswer.add(5);
        hardestArrayListAnswer.add(7);
        hardestArrayListAnswer.add(2);
        hardestArrayListAnswer.add(1);
        hardestArrayListAnswer.add(2);
        hardestArrayListAnswer.add(8);
        hardestArrayListAnswer.add(7);
        hardestArrayListAnswer.add(1);
        hardestArrayListAnswer.add(6);
        hardestArrayListAnswer.add(9);
        hardestArrayListAnswer.add(5);
        hardestArrayListAnswer.add(3);
        hardestArrayListAnswer.add(4);
        hardestArrayListAnswer.add(5);
        hardestArrayListAnswer.add(2);
        hardestArrayListAnswer.add(1);
        hardestArrayListAnswer.add(9);
        hardestArrayListAnswer.add(7);
        hardestArrayListAnswer.add(4);
        hardestArrayListAnswer.add(3);
        hardestArrayListAnswer.add(6);
        hardestArrayListAnswer.add(8);
        hardestArrayListAnswer.add(4);
        hardestArrayListAnswer.add(3);
        hardestArrayListAnswer.add(8);
        hardestArrayListAnswer.add(5);
        hardestArrayListAnswer.add(2);
        hardestArrayListAnswer.add(6);
        hardestArrayListAnswer.add(9);
        hardestArrayListAnswer.add(1);
        hardestArrayListAnswer.add(7);
        hardestArrayListAnswer.add(7);
        hardestArrayListAnswer.add(9);
        hardestArrayListAnswer.add(6);
        hardestArrayListAnswer.add(3);
        hardestArrayListAnswer.add(1);
        hardestArrayListAnswer.add(8);
        hardestArrayListAnswer.add(4);
        hardestArrayListAnswer.add(5);
        hardestArrayListAnswer.add(2);


        GridView gridView = (GridView) findViewById(R.id.hardestGridView);
        gridView.setAdapter(new SudokuAdapter(HardestSudoku.this, hardestArrayList));

        hardestChecker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((hardestArrayList).equals((hardestArrayListAnswer)))
                    Toast.makeText(getApplicationContext(),"Congratulations. You finished it! :)",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"It's not correct. Try again when you finished. You can do it !",Toast.LENGTH_LONG).show();
            }
        });

        doneBtn.setOnClickListener(new View.OnClickListener() {

                                       @Override
                                       public void onClick(View view) {
                                           Intent i=new Intent(HardestSudoku.this, CompleteSudoku.class );
                                           i.putExtra("complete",hardestArrayListAnswer);
                                           startActivity(i);
                                       }
                                   }
        );


    }
}
