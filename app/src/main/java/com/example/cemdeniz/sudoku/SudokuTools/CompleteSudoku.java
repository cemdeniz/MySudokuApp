package com.example.cemdeniz.sudoku.SudokuTools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.GridView;

import com.example.cemdeniz.sudoku.R;

import java.util.ArrayList;

/**
 * Created by cemdeniz on 24.07.2017.
 */

public class CompleteSudoku extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.complete_sudoku);

        Intent intent      = getIntent();
        ArrayList complete = intent.getIntegerArrayListExtra("complete");
        GridView gridView  = (GridView) findViewById(R.id.CompleteSudokuGridView);
        gridView.setAdapter(new SudokuAdapter(CompleteSudoku.this,complete));
    }
}
