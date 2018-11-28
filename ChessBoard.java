package com.example.weilunwang.ooseproject;

import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by WeiLunWang on 2015/12/27.
 */
public class ChessBoard {
    AbstractState state;
    final int RED = 0;
    final int BLACK = 1;
    Button RedClick;
    Button BlackClick;
    ChessStack OutsideChess;
    ChessStack out;
    ChessStack[] Red;
    ChessStack[] Black;
    ChessStack[][] Space;
    public ChessBoard(){
        out = new ChessStack();
        Red = new ChessStack[3];
        Black = new ChessStack[3];
        Space = new ChessStack[4][4];
    }
}
