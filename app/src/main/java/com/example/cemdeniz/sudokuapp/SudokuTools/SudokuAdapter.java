package com.example.cemdeniz.sudokuapp.SudokuTools;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cemdeniz.sudokuapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cemdeniz on 17.07.2017.
 */

public class SudokuAdapter extends BaseAdapter {

    Context context;
    int[][] boardArray;
    LayoutInflater layoutInflater;
    ArrayList<Integer> boardArrayList = new ArrayList<>();
    List<Integer> indexOfNumber = new ArrayList<Integer>();

    public SudokuAdapter(Context c,ArrayList<Integer> _boardArrayList) {
        context = c;
        this.boardArrayList = _boardArrayList;
        layoutInflater = LayoutInflater.from(context);


    }

    @Override
    public int getCount() {
        return boardArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return boardArrayList.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {

        view = layoutInflater.inflate(R.layout.grid_sudoku_item, null);
        final EditText txt = (EditText) view.findViewById(R.id.editTest);
        if (boardArrayList.get(position) == 0) {
            //test
            indexOfNumber.add(position);

        } else {
            txt.setText(boardArrayList.get(position) + " ");
            txt.setEnabled(false);
        }

        if (indexOfNumber.contains(position))
            txt.setEnabled(true);

        txt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if (!txt.getText().toString().equals("") && !txt.getText().toString().equals("0")) {
                    boardArrayList.set(position, Integer.parseInt(txt.getText().toString()));
                    txt.setEnabled(true);

                } else
                    boardArrayList.set(position, 0);


                if (txt.getText().toString().equals("0")) {
                    Toast.makeText(context, "You cant enter '0', Please enter another number.", Toast.LENGTH_SHORT).show();
                    txt.getText().clear();
                }


            }

            @Override
            public void afterTextChanged(Editable editable) {


            }
        });


        return view;
    }


}
