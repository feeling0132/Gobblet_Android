package com.example.weilunwang.ooseproject;
import android.graphics.Color;
import android.view.View;

/**
 * Created by WeiLunWang on 2015/12/29.
 */
class FullModeStateA extends FullModeState{
    FullModeStateA(final ChessBoard chessBoard, final ChessGame chessGame, final int color){
        final Set set= new Set(-1,-1);

        gameoverCheck(chessBoard,chessGame);
        chessBoard.out = null;
        if(color == chessBoard.RED) {
            //黑色空白 紅色出現
            chessBoard.BlackClick.setBackgroundColor(Color.WHITE);
            chessBoard.BlackClick.setTextColor(Color.WHITE);
            chessBoard.BlackClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                }
            });

            chessBoard.RedClick.setTextColor(Color.BLACK);
            chessBoard.RedClick.setBackgroundColor(Color.RED);
            chessBoard.RedClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (chessBoard.out != null) {
                        chessBoard.OutsideChess.push(chessBoard.out.pop());
                        chessBoard.state = new FullModeStateB(chessBoard, chessGame, chessBoard.RED,set);
                    }
                }
            });
        }else {
            //黑色出現 紅色空白
            chessBoard.BlackClick.setBackgroundColor(Color.BLACK);
            chessBoard.BlackClick.setTextColor(Color.WHITE);
            chessBoard.BlackClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (chessBoard.out != null) {
                        chessBoard.OutsideChess.push(chessBoard.out.pop());
                        chessBoard.state = new FullModeStateB(chessBoard, chessGame, chessBoard.BLACK,set);
                    }
                }
            });
            chessBoard.RedClick.setTextColor(Color.WHITE);
            chessBoard.RedClick.setBackgroundColor(Color.WHITE);
            chessBoard.RedClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                }
            });
        }
        chessBoard.Space[0][0].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[0][0].top().getColor()==color){
                    chessBoard.out = chessBoard.Space[0][0];
                    set.SetXY(0,0);
                }
            }
        });
        chessBoard.Space[0][1].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[0][1].top().getColor()==color){
                        chessBoard.out = chessBoard.Space[0][1];
                    set.SetXY(0,1);
                }
            }
        });
        chessBoard.Space[0][2].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[0][2].top().getColor()==color){
                    chessBoard.out = chessBoard.Space[0][2];
                    set.SetXY(0,2);
                }
            }
        });
        chessBoard.Space[0][3].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[0][3].top().getColor()==color){
                    chessBoard.out = chessBoard.Space[0][3];
                    set.SetXY(0,3);
                }
            }
        });
        chessBoard.Space[1][0].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[1][0].top().getColor()==color){
                    chessBoard.out = chessBoard.Space[1][0];
                    set.SetXY(1,0);
                }
            }
        });
        chessBoard.Space[1][1].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[1][1].top().getColor()==color){
                    chessBoard.out = chessBoard.Space[1][1];
                    set.SetXY(1,1);
                }
            }
        });
        chessBoard.Space[1][2].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[1][2].top().getColor()==color){
                    chessBoard.out = chessBoard.Space[1][2];
                    set.SetXY(1,2);
                }
            }
        });
        chessBoard.Space[1][3].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[1][3].top().getColor()==color){
                    chessBoard.out = chessBoard.Space[1][3];
                    set.SetXY(1,3);
                }
            }
        });
        chessBoard.Space[2][0].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[2][0].top().getColor()==color){
                    chessBoard.out = chessBoard.Space[2][0];
                    set.SetXY(2,0);
                }
            }
        });
        chessBoard.Space[2][1].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[2][1].top().getColor()==color){
                    chessBoard.out = chessBoard.Space[2][1];
                    set.SetXY(2,1);
                }
            }
        });
        chessBoard.Space[2][2].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[2][2].top().getColor()==color){
                    chessBoard.out = chessBoard.Space[2][2];
                    set.SetXY(2,2);
                }
            }
        });
        chessBoard.Space[2][3].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[2][3].top().getColor()==color){
                    chessBoard.out = chessBoard.Space[2][3];
                    set.SetXY(2,3);
                }
            }
        });
        chessBoard.Space[3][0].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[3][0].top().getColor()==color){
                    chessBoard.out = chessBoard.Space[3][0];
                    set.SetXY(3,0);
                }
            }
        });
        chessBoard.Space[3][1].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[3][1].top().getColor()==color){
                    chessBoard.out = chessBoard.Space[3][1];
                    set.SetXY(3,1);
                }
            }
        });
        chessBoard.Space[3][2].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[3][2].top().getColor()==color){
                    chessBoard.out = chessBoard.Space[3][2];
                    set.SetXY(3,2);
                }
            }
        });
        chessBoard.Space[3][3].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[3][3].top().getColor()==color){
                    chessBoard.out = chessBoard.Space[3][3];
                    set.SetXY(3,3);
                }
            }
        });
    }

}