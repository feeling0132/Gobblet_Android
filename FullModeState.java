package com.example.weilunwang.ooseproject;

/**
 * Created by WeiLunWang on 2015/12/29.
 */

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;

/**
 * Created by WeiLunWang on 2015/12/27.
 */
abstract public class FullModeState implements AbstractState{
    public void gameoverCheck(ChessBoard chessBoard,ChessGame chessGame){
        int i,j,flag=0;
        for (i=0;i<4;i++){
            for(j=0;j<4;j++) {
                if (chessBoard.Space[i][j].top().getColor()==-1){flag=1;break;}
            }
            if (flag==1)break;
        }
        if(flag==0){
            int red=0,black=0;
            for (i=0;i<4;i++) {
                for (j = 0; j < 4; j++) {
                    if (chessBoard.Space[i][j].top().getColor()==chessBoard.RED){red++;}
                    else black++;
                }
            }
            if(red>black)alertGameOver(chessBoard.RED,chessGame);
            else if(black>red)alertGameOver(chessBoard.BLACK,chessGame);
            else alertGameOver(-1,chessGame);
        }
    }

    @Override
    public void toNextState(ChessBoard chessBoard,AbstractState state) {
        chessBoard.state = state;
    }
    private void alertGameOver(int Color, final ChessGame chessGame){
        AlertDialog.Builder MyAlertDialog = new AlertDialog.Builder(chessGame);
        MyAlertDialog.setTitle("GameOver");
        if (Color == 0)MyAlertDialog.setMessage("Player Red is Winner.");
        else if(Color==1)MyAlertDialog.setMessage("Player Black is Winner.");
        else MyAlertDialog.setMessage("The two Players drew.");

        DialogInterface.OnClickListener OkClick = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent();
                intent.setClass(chessGame, MainActivity.class);
                chessGame.startActivity(intent);
                chessGame.finish();
            }
        };
        MyAlertDialog.setNeutralButton("回到主畫面", OkClick);
        MyAlertDialog.show();
    }

};