package com.example.weilunwang.ooseproject;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.weilunwang.ooseproject.R;

/**
 * Created by WeiLunWang on 2015/12/27.
 */

public class ChessGame extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout bg = (RelativeLayout)findViewById(R.id.backGroud);
        bg.setBackgroundColor(Color.WHITE);

        ChessBoard chessBoard= new ChessBoard();

        Bundle bundle = getIntent().getExtras();
        int mode = bundle.getInt("mode");

        if(mode == 1 ) {
            classicInitial(chessBoard);
            AbstractState state = new ClassicStateA(chessBoard, this, chessBoard.RED);
        }else if (mode ==2 ) {
            fullModeInitial(chessBoard);
            AbstractState state = new FullModeStateA(chessBoard, this, chessBoard.RED);
        }
    }

    public void classicInitial(ChessBoard chessBoard){
        ChessStack cs = new ChessStack();
        cs.button = (ImageButton)findViewById(R.id.OutsideChess);
        chessBoard.OutsideChess = cs;

        chessBoard.RedClick = (Button)findViewById(R.id.RedClick);
        chessBoard.BlackClick = (Button)findViewById(R.id.BlackClick);
        //紅色初始化
        cs = new ChessStack();
        cs.button = (ImageButton)findViewById(R.id.R0);
        cs.push(new Chess(0,1));
        cs.push(new Chess(0,2));
        cs.push(new Chess(0,3));
        cs.push(new Chess(0,4));
        chessBoard.Red[0] = cs;

        cs = new ChessStack();
        cs.button = (ImageButton)findViewById(R.id.R1);
        cs.push(new Chess(0,1));
        cs.push(new Chess(0,2));
        cs.push(new Chess(0,3));
        cs.push(new Chess(0,4));
        chessBoard.Red[1] = cs;

        cs = new ChessStack();
        cs.button = (ImageButton)findViewById(R.id.R2);
        cs.push(new Chess(0,1));
        cs.push(new Chess(0,2));
        cs.push(new Chess(0,3));
        cs.push(new Chess(0,4));
        chessBoard.Red[2] = cs;

        //黑色初始化
        cs = new ChessStack();
        cs.button = (ImageButton)findViewById(R.id.B0);
        cs.push(new Chess(1,1));
        cs.push(new Chess(1,2));
        cs.push(new Chess(1,3));
        cs.push(new Chess(1,4));
        chessBoard.Black[0] = cs;

        cs = new ChessStack();
        cs.button = (ImageButton)findViewById(R.id.B1);
        cs.push(new Chess(1,1));
        cs.push(new Chess(1,2));
        cs.push(new Chess(1,3));
        cs.push(new Chess(1,4));
        chessBoard.Black[1] = cs;

        cs = new ChessStack();
        cs.button = (ImageButton)findViewById(R.id.B2);
        cs.push(new Chess(1,1));
        cs.push(new Chess(1,2));
        cs.push(new Chess(1,3));
        cs.push(new Chess(1,4));
        chessBoard.Black[2] = cs;

        //biding 中間棋盤
        chessBoard.Space[0][0] = new ChessStack();
        chessBoard.Space[0][0].button=(ImageButton)findViewById(R.id.S00);
        chessBoard.Space[0][0].push(new Chess(-1,0));
        chessBoard.Space[0][1] = new ChessStack();
        chessBoard.Space[0][1].button=(ImageButton)findViewById(R.id.S01);
        chessBoard.Space[0][1].push(new Chess(-1,0));
        chessBoard.Space[0][2] = new ChessStack();
        chessBoard.Space[0][2].button=(ImageButton)findViewById(R.id.S02);
        chessBoard.Space[0][2].push(new Chess(-1,0));
        chessBoard.Space[0][3] = new ChessStack();
        chessBoard.Space[0][3].button=(ImageButton)findViewById(R.id.S03);
        chessBoard.Space[0][3].push(new Chess(-1,0));

        chessBoard.Space[1][0] = new ChessStack();
        chessBoard.Space[1][0].button=(ImageButton)findViewById(R.id.S10);
        chessBoard.Space[1][0].push(new Chess(-1,0));
        chessBoard.Space[1][1] = new ChessStack();
        chessBoard.Space[1][1].button=(ImageButton)findViewById(R.id.S11);
        chessBoard.Space[1][1].push(new Chess(-1,0));
        chessBoard.Space[1][2] = new ChessStack();
        chessBoard.Space[1][2].button=(ImageButton)findViewById(R.id.S12);
        chessBoard.Space[1][2].push(new Chess(-1,0));
        chessBoard.Space[1][3] = new ChessStack();
        chessBoard.Space[1][3].button=(ImageButton)findViewById(R.id.S13);
        chessBoard.Space[1][3].push(new Chess(-1,0));

        chessBoard.Space[2][0] = new ChessStack();
        chessBoard.Space[2][0].button=(ImageButton)findViewById(R.id.S20);
        chessBoard.Space[2][0].push(new Chess(-1, 0));
        chessBoard.Space[2][1] = new ChessStack();
        chessBoard.Space[2][1].button=(ImageButton)findViewById(R.id.S21);
        chessBoard.Space[2][1].push(new Chess(-1,0));
        chessBoard.Space[2][2] = new ChessStack();
        chessBoard.Space[2][2].button=(ImageButton)findViewById(R.id.S22);
        chessBoard.Space[2][2].push(new Chess(-1,0));
        chessBoard.Space[2][3] = new ChessStack();
        chessBoard.Space[2][3].button=(ImageButton)findViewById(R.id.S23);
        chessBoard.Space[2][3].push(new Chess(-1,0));

        chessBoard.Space[3][0] = new ChessStack();
        chessBoard.Space[3][0].button=(ImageButton)findViewById(R.id.S30);
        chessBoard.Space[3][0].push(new Chess(-1, 0));
        chessBoard.Space[3][1] = new ChessStack();
        chessBoard.Space[3][1].button=(ImageButton)findViewById(R.id.S31);
        chessBoard.Space[3][1].push(new Chess(-1,0));
        chessBoard.Space[3][2] = new ChessStack();
        chessBoard.Space[3][2].button=(ImageButton)findViewById(R.id.S32);
        chessBoard.Space[3][2].push(new Chess(-1,0));
        chessBoard.Space[3][3] = new ChessStack();
        chessBoard.Space[3][3].button=(ImageButton)findViewById(R.id.S33);
        chessBoard.Space[3][3].push(new Chess(-1,0));
    }
    public void fullModeInitial(ChessBoard chessBoard){
        ChessStack cs = new ChessStack();
        cs.button = (ImageButton)findViewById(R.id.OutsideChess);
        chessBoard.OutsideChess = cs;

        chessBoard.RedClick = (Button)findViewById(R.id.RedClick);
        chessBoard.BlackClick = (Button)findViewById(R.id.BlackClick);
        //biding 中間棋盤
        chessBoard.Space[0][0] = new ChessStack();
        chessBoard.Space[0][0].button=(ImageButton)findViewById(R.id.S00);
        chessBoard.Space[0][0].push(new Chess(-1,0));
        chessBoard.Space[0][1] = new ChessStack();
        chessBoard.Space[0][1].button=(ImageButton)findViewById(R.id.S01);
        chessBoard.Space[0][1].push(new Chess(-1,0));
        chessBoard.Space[0][2] = new ChessStack();
        chessBoard.Space[0][2].button=(ImageButton)findViewById(R.id.S02);
        chessBoard.Space[0][2].push(new Chess(-1,0));
        chessBoard.Space[0][3] = new ChessStack();
        chessBoard.Space[0][3].button=(ImageButton)findViewById(R.id.S03);
        chessBoard.Space[0][3].push(new Chess(-1,0));

        chessBoard.Space[1][0] = new ChessStack();
        chessBoard.Space[1][0].button=(ImageButton)findViewById(R.id.S10);
        chessBoard.Space[1][0].push(new Chess(-1,0));
        chessBoard.Space[1][1] = new ChessStack();
        chessBoard.Space[1][1].button=(ImageButton)findViewById(R.id.S11);
        chessBoard.Space[1][1].push(new Chess(-1,0));
        chessBoard.Space[1][2] = new ChessStack();
        chessBoard.Space[1][2].button=(ImageButton)findViewById(R.id.S12);
        chessBoard.Space[1][2].push(new Chess(-1,0));
        chessBoard.Space[1][3] = new ChessStack();
        chessBoard.Space[1][3].button=(ImageButton)findViewById(R.id.S13);
        chessBoard.Space[1][3].push(new Chess(-1,0));

        chessBoard.Space[2][0] = new ChessStack();
        chessBoard.Space[2][0].button=(ImageButton)findViewById(R.id.S20);
        chessBoard.Space[2][0].push(new Chess(-1, 0));
        chessBoard.Space[2][1] = new ChessStack();
        chessBoard.Space[2][1].button=(ImageButton)findViewById(R.id.S21);
        chessBoard.Space[2][1].push(new Chess(-1,0));
        chessBoard.Space[2][2] = new ChessStack();
        chessBoard.Space[2][2].button=(ImageButton)findViewById(R.id.S22);
        chessBoard.Space[2][2].push(new Chess(-1,0));
        chessBoard.Space[2][3] = new ChessStack();
        chessBoard.Space[2][3].button=(ImageButton)findViewById(R.id.S23);
        chessBoard.Space[2][3].push(new Chess(-1,0));

        chessBoard.Space[3][0] = new ChessStack();
        chessBoard.Space[3][0].button=(ImageButton)findViewById(R.id.S30);
        chessBoard.Space[3][0].push(new Chess(-1, 0));
        chessBoard.Space[3][1] = new ChessStack();
        chessBoard.Space[3][1].button=(ImageButton)findViewById(R.id.S31);
        chessBoard.Space[3][1].push(new Chess(-1,0));
        chessBoard.Space[3][2] = new ChessStack();
        chessBoard.Space[3][2].button=(ImageButton)findViewById(R.id.S32);
        chessBoard.Space[3][2].push(new Chess(-1,0));
        chessBoard.Space[3][3] = new ChessStack();
        chessBoard.Space[3][3].button=(ImageButton)findViewById(R.id.S33);
        chessBoard.Space[3][3].push(new Chess(-1,0));

        //放棋子
        chessBoard.Space[0][0].push(new Chess(0,1));
        chessBoard.Space[0][0].push(new Chess(0,2));
        chessBoard.Space[0][0].push(new Chess(0,3));
        chessBoard.Space[0][0].push(new Chess(0,4));

        chessBoard.Space[0][1].push(new Chess(0,1));
        chessBoard.Space[0][1].push(new Chess(0,2));
        chessBoard.Space[0][1].push(new Chess(0,3));
        chessBoard.Space[0][1].push(new Chess(0,4));

        chessBoard.Space[1][0].push(new Chess(0, 1));
        chessBoard.Space[1][0].push(new Chess(0, 2));
        chessBoard.Space[1][0].push(new Chess(0, 3));
        chessBoard.Space[1][0].push(new Chess(0, 4));

        chessBoard.Space[3][3].push(new Chess(1, 1));
        chessBoard.Space[3][3].push(new Chess(1, 2));
        chessBoard.Space[3][3].push(new Chess(1, 3));
        chessBoard.Space[3][3].push(new Chess(1, 4));

        chessBoard.Space[3][2].push(new Chess(1, 1));
        chessBoard.Space[3][2].push(new Chess(1, 2));
        chessBoard.Space[3][2].push(new Chess(1, 3));
        chessBoard.Space[3][2].push(new Chess(1, 4));

        chessBoard.Space[2][3].push(new Chess(1, 1));
        chessBoard.Space[2][3].push(new Chess(1, 2));
        chessBoard.Space[2][3].push(new Chess(1, 3));
        chessBoard.Space[2][3].push(new Chess(1, 4));
    }
};