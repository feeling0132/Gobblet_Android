package com.example.weilunwang.ooseproject;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;

/**
 * Created by WeiLunWang on 2015/12/27.
 */
abstract public class ClassicState implements AbstractState{
    public void gameoverCheck(ChessBoard chessBoard,ChessGame chessGame){
        for (int i=0;i<4;i++){
            if (chessBoard.Space[i][0].top().getColor()==chessBoard.Space[i][1].top().getColor()&&
                    chessBoard.Space[i][0].top().getColor()==chessBoard.Space[i][2].top().getColor()&&
                    chessBoard.Space[i][0].top().getColor()==chessBoard.Space[i][3].top().getColor()) {
                if(chessBoard.Space[i][0].top().getColor()!=-1)alertGameOver(chessBoard.Space[i][0].top().getColor(),chessGame);
            }
            if (chessBoard.Space[0][i].top().getColor()==chessBoard.Space[1][i].top().getColor()&&
                    chessBoard.Space[0][i].top().getColor()==chessBoard.Space[2][i].top().getColor()&&
                    chessBoard.Space[0][i].top().getColor()==chessBoard.Space[3][i].top().getColor()) {
                if(chessBoard.Space[0][i].top().getColor()!=-1)alertGameOver(chessBoard.Space[0][i].top().getColor(),chessGame);
            }
        }
        if (chessBoard.Space[0][0].top().getColor()==chessBoard.Space[1][1].top().getColor()&&
                chessBoard.Space[0][0].top().getColor()==chessBoard.Space[2][2].top().getColor()&&
                chessBoard.Space[0][0].top().getColor()==chessBoard.Space[3][3].top().getColor()) {
            if(chessBoard.Space[0][0].top().getColor()!=-1)alertGameOver(chessBoard.Space[0][0].top().getColor(),chessGame);
        }
        if (chessBoard.Space[0][3].top().getColor()==chessBoard.Space[1][2].top().getColor()&&
                chessBoard.Space[0][3].top().getColor()==chessBoard.Space[2][1].top().getColor()&&
                chessBoard.Space[0][3].top().getColor()==chessBoard.Space[3][0].top().getColor()) {
            if(chessBoard.Space[0][3].top().getColor()!=-1)alertGameOver(chessBoard.Space[0][3].top().getColor(),chessGame);
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
        else MyAlertDialog.setMessage("Player Black is Winner.");

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

