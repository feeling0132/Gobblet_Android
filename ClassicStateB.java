package com.example.weilunwang.ooseproject;
import android.graphics.Color;
import android.view.View;

/**
 * Created by WeiLunWang on 2015/12/27.
 */
class ClassicStateB extends ClassicState{
    ClassicStateB(final ChessBoard chessBoard, final ChessGame chessGame,int color){
        gameoverCheck(chessBoard,chessGame);
        chessBoard.out = null;
        if(color==chessBoard.RED) {
            chessBoard.RedClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (chessBoard.out != null) {
                        chessBoard.out.push(chessBoard.OutsideChess.pop());
                        chessBoard.state = new ClassicStateA(chessBoard,chessGame,chessBoard.BLACK);
                    }
                }
            });
        }else {
            chessBoard.BlackClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (chessBoard.out != null) {
                        chessBoard.out.push(chessBoard.OutsideChess.pop());
                        chessBoard.state = new ClassicStateA(chessBoard,chessGame,chessBoard.RED);
                    }
                }
            });
        }
        chessBoard.Red[0].button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        chessBoard.Red[1].button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        chessBoard.Red[2].button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                }
            });
        chessBoard.Black[0].button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        chessBoard.Black[1].button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        chessBoard.Black[2].button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                }
            });

        //==============================S 0 0 =================================================
        chessBoard.Space[0][0].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[0][0].top().getColor()!=-1) {
                    //顏色相同且比較小 可以被蓋
                    if (chessBoard.Space[0][0].top().getColor() == chessBoard.OutsideChess.top().getColor()) {
                        if(chessBoard.Space[0][0].top().getWeight() < chessBoard.OutsideChess.top().getWeight()) {
                            chessBoard.out = chessBoard.Space[0][0];
                        }
                    //顏色不同 需要比較小且三個相連
                    }else if (chessBoard.Space[0][0].top().getColor() == chessBoard.Space[0][1].top().getColor() && chessBoard.Space[0][1].top().getColor()==chessBoard.Space[0][2].top().getColor()
                            && chessBoard.Space[0][0].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[0][0];
                    }else if (chessBoard.Space[0][0].top().getColor() == chessBoard.Space[1][0].top().getColor() && chessBoard.Space[1][0].top().getColor()==chessBoard.Space[2][0].top().getColor()
                            && chessBoard.Space[0][0].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[0][0];
                    }else if (chessBoard.Space[0][0].top().getColor() == chessBoard.Space[1][1].top().getColor() && chessBoard.Space[0][1].top().getColor()==chessBoard.Space[2][2].top().getColor()
                            && chessBoard.Space[0][0].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[0][0];
                    }
                }else chessBoard.out = chessBoard.Space[0][0];
            }
        });
        //==============================S 0 1 =================================================
        chessBoard.Space[0][1].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[0][1].top().getColor()!=-1) {
                    //顏色相同且比較小 可以被蓋
                    if (chessBoard.Space[0][1].top().getColor() == chessBoard.OutsideChess.top().getColor()) {
                        if(chessBoard.Space[0][1].top().getWeight() < chessBoard.OutsideChess.top().getWeight()) {
                            chessBoard.out = chessBoard.Space[0][1];
                        }
                    //顏色不同 需要比較小且三個相連
                    }else if (chessBoard.Space[0][0].top().getColor() == chessBoard.Space[0][1].top().getColor() && chessBoard.Space[0][1].top().getColor()==chessBoard.Space[0][2].top().getColor()
                            && chessBoard.Space[0][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[0][1];
                    }else if (chessBoard.Space[0][1].top().getColor() == chessBoard.Space[0][2].top().getColor() && chessBoard.Space[0][2].top().getColor()==chessBoard.Space[0][3].top().getColor()
                            && chessBoard.Space[0][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[0][1];
                    }else if (chessBoard.Space[0][1].top().getColor() == chessBoard.Space[1][1].top().getColor() && chessBoard.Space[1][1].top().getColor()==chessBoard.Space[2][1].top().getColor()
                            && chessBoard.Space[0][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[0][1];
                    }else if (chessBoard.Space[0][1].top().getColor() == chessBoard.Space[1][2].top().getColor() && chessBoard.Space[1][2].top().getColor()==chessBoard.Space[2][3].top().getColor()
                            && chessBoard.Space[0][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[0][1];
                    }
                }else chessBoard.out = chessBoard.Space[0][1];
            }
        });
        //==============================S 0 2 =================================================
        chessBoard.Space[0][2].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[0][2].top().getColor()!=-1) {
                    //顏色相同且比較小 可以被蓋
                    if (chessBoard.Space[0][2].top().getColor() == chessBoard.OutsideChess.top().getColor()) {
                        if(chessBoard.Space[0][2].top().getWeight() < chessBoard.OutsideChess.top().getWeight()) {
                            chessBoard.out = chessBoard.Space[0][2];
                        }
                        //顏色不同 需要比較小且三個相連
                    }else if (chessBoard.Space[0][0].top().getColor() == chessBoard.Space[0][1].top().getColor() && chessBoard.Space[0][1].top().getColor() == chessBoard.Space[0][2].top().getColor()
                            && chessBoard.Space[0][2].top().getWeight() < chessBoard.OutsideChess.top().getWeight()) {
                        chessBoard.out = chessBoard.Space[0][2];
                    }else if (chessBoard.Space[0][1].top().getColor() == chessBoard.Space[0][2].top().getColor() && chessBoard.Space[0][2].top().getColor()==chessBoard.Space[0][3].top().getColor()
                            && chessBoard.Space[0][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[0][2];
                    }else if (chessBoard.Space[0][2].top().getColor() == chessBoard.Space[1][2].top().getColor() && chessBoard.Space[1][2].top().getColor()==chessBoard.Space[2][2].top().getColor()
                            && chessBoard.Space[0][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[0][2];
                    }else if (chessBoard.Space[0][2].top().getColor() == chessBoard.Space[1][1].top().getColor() && chessBoard.Space[1][1].top().getColor()==chessBoard.Space[2][0].top().getColor()
                            && chessBoard.Space[0][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[0][2];
                    }
                }else chessBoard.out = chessBoard.Space[0][2];
            }
        });
        //==============================S 0 3 =================================================
        chessBoard.Space[0][3].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[0][3].top().getColor()!=-1) {
                    //顏色相同且比較小 可以被蓋
                    if (chessBoard.Space[0][3].top().getColor() == chessBoard.OutsideChess.top().getColor()) {
                        if(chessBoard.Space[0][3].top().getWeight() < chessBoard.OutsideChess.top().getWeight()) {
                            chessBoard.out = chessBoard.Space[0][3];
                        }
                        //顏色不同 需要比較小且三個相連
                    }else if (chessBoard.Space[0][1].top().getColor() == chessBoard.Space[0][2].top().getColor() && chessBoard.Space[0][2].top().getColor()==chessBoard.Space[0][3].top().getColor()
                            && chessBoard.Space[0][3].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[0][3];
                    }else if (chessBoard.Space[0][3].top().getColor() == chessBoard.Space[1][3].top().getColor() && chessBoard.Space[1][3].top().getColor()==chessBoard.Space[2][3].top().getColor()
                            && chessBoard.Space[0][3].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[0][3];
                    }else if (chessBoard.Space[0][3].top().getColor() == chessBoard.Space[1][2].top().getColor() && chessBoard.Space[1][2].top().getColor()==chessBoard.Space[2][1].top().getColor()
                            && chessBoard.Space[0][3].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[0][3];
                    }
                }else chessBoard.out = chessBoard.Space[0][3];
            }
        });
        //==============================S 1 0  =================================================
        chessBoard.Space[1][0].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[1][0].top().getColor()!=-1) {
                    //顏色相同且比較小 可以被蓋
                    if (chessBoard.Space[1][0].top().getColor() == chessBoard.OutsideChess.top().getColor()) {
                        if(chessBoard.Space[1][0].top().getWeight() < chessBoard.OutsideChess.top().getWeight()) {
                            chessBoard.out = chessBoard.Space[1][0];
                        }
                        //顏色不同 需要比較小且三個相連
                    }else if (chessBoard.Space[1][0].top().getColor() == chessBoard.Space[1][1].top().getColor() && chessBoard.Space[1][1].top().getColor()==chessBoard.Space[1][2].top().getColor()
                            && chessBoard.Space[1][0].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[1][0];
                    }else if (chessBoard.Space[0][0].top().getColor() == chessBoard.Space[1][0].top().getColor() && chessBoard.Space[1][0].top().getColor()==chessBoard.Space[2][0].top().getColor()
                            && chessBoard.Space[1][0].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[1][0];
                    }else if (chessBoard.Space[1][0].top().getColor() == chessBoard.Space[2][0].top().getColor() && chessBoard.Space[2][0].top().getColor()==chessBoard.Space[3][0].top().getColor()
                            && chessBoard.Space[1][0].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[1][0];
                    }else if (chessBoard.Space[1][0].top().getColor() == chessBoard.Space[2][1].top().getColor() && chessBoard.Space[2][1].top().getColor()==chessBoard.Space[3][2].top().getColor()
                            && chessBoard.Space[1][0].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[1][0];
                    }
                }else chessBoard.out = chessBoard.Space[1][0];
            }
        });
        //==============================S 1 1  =================================================
        chessBoard.Space[1][1].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[1][1].top().getColor()!=-1) {
                    //顏色相同且比較小 可以被蓋
                    if (chessBoard.Space[1][1].top().getColor() == chessBoard.OutsideChess.top().getColor()) {
                        if(chessBoard.Space[1][1].top().getWeight() < chessBoard.OutsideChess.top().getWeight()) {
                            chessBoard.out = chessBoard.Space[1][1];
                        }
                        //顏色不同 需要比較小且三個相連
                    }else if (chessBoard.Space[1][0].top().getColor() == chessBoard.Space[1][1].top().getColor() && chessBoard.Space[1][1].top().getColor()==chessBoard.Space[1][2].top().getColor()
                            && chessBoard.Space[1][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[1][1];
                    }else if (chessBoard.Space[1][1].top().getColor() == chessBoard.Space[1][2].top().getColor() && chessBoard.Space[1][2].top().getColor()==chessBoard.Space[1][3].top().getColor()
                            && chessBoard.Space[1][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[1][1];
                    }else if (chessBoard.Space[0][1].top().getColor() == chessBoard.Space[1][1].top().getColor() && chessBoard.Space[1][1].top().getColor()==chessBoard.Space[2][1].top().getColor()
                            && chessBoard.Space[1][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[1][1];
                    }else if (chessBoard.Space[1][1].top().getColor() == chessBoard.Space[2][1].top().getColor() && chessBoard.Space[2][1].top().getColor()==chessBoard.Space[3][1].top().getColor()
                            && chessBoard.Space[1][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[1][1];
                    }else if (chessBoard.Space[0][0].top().getColor() == chessBoard.Space[1][1].top().getColor() && chessBoard.Space[1][1].top().getColor()==chessBoard.Space[2][2].top().getColor()
                            && chessBoard.Space[1][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[1][1];
                    }else if (chessBoard.Space[1][1].top().getColor() == chessBoard.Space[2][2].top().getColor() && chessBoard.Space[2][2].top().getColor()==chessBoard.Space[3][3].top().getColor()
                            && chessBoard.Space[1][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[1][1];
                    }else if (chessBoard.Space[0][2].top().getColor() == chessBoard.Space[1][1].top().getColor() && chessBoard.Space[1][1].top().getColor()==chessBoard.Space[2][0].top().getColor()
                            && chessBoard.Space[1][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[1][1];
                    }
                }else chessBoard.out = chessBoard.Space[1][1];
            }
        });
        //==============================S 1 2  =================================================
        chessBoard.Space[1][2].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[1][2].top().getColor()!=-1) {
                    //顏色相同且比較小 可以被蓋
                    if (chessBoard.Space[1][2].top().getColor() == chessBoard.OutsideChess.top().getColor()) {
                        if(chessBoard.Space[1][2].top().getWeight() < chessBoard.OutsideChess.top().getWeight()) {
                            chessBoard.out = chessBoard.Space[1][2];
                        }
                        //顏色不同 需要比較小且三個相連
                    }else if (chessBoard.Space[1][0].top().getColor() == chessBoard.Space[1][1].top().getColor() && chessBoard.Space[1][1].top().getColor()==chessBoard.Space[1][2].top().getColor()
                            && chessBoard.Space[1][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[1][2];
                    }else if (chessBoard.Space[1][1].top().getColor() == chessBoard.Space[1][2].top().getColor() && chessBoard.Space[1][2].top().getColor()==chessBoard.Space[1][3].top().getColor()
                            && chessBoard.Space[1][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[1][2];
                    }else if (chessBoard.Space[0][2].top().getColor() == chessBoard.Space[1][2].top().getColor() && chessBoard.Space[1][2].top().getColor()==chessBoard.Space[2][2].top().getColor()
                            && chessBoard.Space[1][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[1][2];
                    }else if (chessBoard.Space[1][2].top().getColor() == chessBoard.Space[2][2].top().getColor() && chessBoard.Space[2][2].top().getColor()==chessBoard.Space[3][2].top().getColor()
                            && chessBoard.Space[1][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[1][2];
                    }else if (chessBoard.Space[0][3].top().getColor() == chessBoard.Space[1][2].top().getColor() && chessBoard.Space[1][2].top().getColor()==chessBoard.Space[2][1].top().getColor()
                            && chessBoard.Space[1][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[1][2];
                    }else if (chessBoard.Space[1][2].top().getColor() == chessBoard.Space[2][1].top().getColor() && chessBoard.Space[2][1].top().getColor()==chessBoard.Space[3][0].top().getColor()
                            && chessBoard.Space[1][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[1][2];
                    }else if (chessBoard.Space[0][1].top().getColor() == chessBoard.Space[1][2].top().getColor() && chessBoard.Space[1][2].top().getColor()==chessBoard.Space[2][3].top().getColor()
                            && chessBoard.Space[1][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[1][2];
                    }
                }else chessBoard.out = chessBoard.Space[1][2];
            }
        });
        //==============================S 1 3  =================================================
        chessBoard.Space[1][3].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[1][3].top().getColor()!=-1) {
                    //顏色相同且比較小 可以被蓋
                    if (chessBoard.Space[1][3].top().getColor() == chessBoard.OutsideChess.top().getColor()) {
                        if(chessBoard.Space[1][3].top().getWeight() < chessBoard.OutsideChess.top().getWeight()) {
                            chessBoard.out = chessBoard.Space[1][3];
                        }
                        //顏色不同 需要比較小且三個相連
                    }else if (chessBoard.Space[1][1].top().getColor() == chessBoard.Space[1][2].top().getColor() && chessBoard.Space[1][2].top().getColor()==chessBoard.Space[1][3].top().getColor()
                            && chessBoard.Space[1][3].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[1][3];
                    }else if (chessBoard.Space[0][3].top().getColor() == chessBoard.Space[1][3].top().getColor() && chessBoard.Space[1][3].top().getColor()==chessBoard.Space[2][3].top().getColor()
                            && chessBoard.Space[1][3].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[1][3];
                    }else if (chessBoard.Space[1][3].top().getColor() == chessBoard.Space[2][3].top().getColor() && chessBoard.Space[2][3].top().getColor()==chessBoard.Space[3][3].top().getColor()
                            && chessBoard.Space[1][3].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[1][3];
                    }else if (chessBoard.Space[1][3].top().getColor() == chessBoard.Space[2][2].top().getColor() && chessBoard.Space[2][2].top().getColor()==chessBoard.Space[3][1].top().getColor()
                            && chessBoard.Space[1][3].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[1][3];
                    }
                }else chessBoard.out = chessBoard.Space[1][3];
            }
        });
        //==============================S 2 0  =================================================
        chessBoard.Space[2][0].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[2][0].top().getColor()!=-1) {
                    //顏色相同且比較小 可以被蓋
                    if (chessBoard.Space[2][0].top().getColor() == chessBoard.OutsideChess.top().getColor()) {
                        if(chessBoard.Space[2][0].top().getWeight() < chessBoard.OutsideChess.top().getWeight()) {
                            chessBoard.out = chessBoard.Space[2][0];
                        }
                        //顏色不同 需要比較小且三個相連
                    }else if (chessBoard.Space[0][0].top().getColor() == chessBoard.Space[1][0].top().getColor() && chessBoard.Space[1][0].top().getColor()==chessBoard.Space[2][0].top().getColor()
                            && chessBoard.Space[2][0].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][0];
                    }else if (chessBoard.Space[1][0].top().getColor() == chessBoard.Space[2][0].top().getColor() && chessBoard.Space[2][0].top().getColor()==chessBoard.Space[3][0].top().getColor()
                            && chessBoard.Space[2][0].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][0];
                    }else if (chessBoard.Space[2][0].top().getColor() == chessBoard.Space[2][1].top().getColor() && chessBoard.Space[2][1].top().getColor()==chessBoard.Space[2][2].top().getColor()
                            && chessBoard.Space[2][0].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][0];
                    }else if (chessBoard.Space[0][2].top().getColor() == chessBoard.Space[1][1].top().getColor() && chessBoard.Space[1][1].top().getColor()==chessBoard.Space[2][0].top().getColor()
                            && chessBoard.Space[2][0].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ){
                        chessBoard.out = chessBoard.Space[2][0];
                    }
                }else chessBoard.out = chessBoard.Space[2][0];
            }
        });
        //==============================S 2 1  =================================================
        chessBoard.Space[2][1].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[2][1].top().getColor()!=-1) {
                    //顏色相同且比較小 可以被蓋
                    if (chessBoard.Space[2][1].top().getColor() == chessBoard.OutsideChess.top().getColor()) {
                        if(chessBoard.Space[2][1].top().getWeight() < chessBoard.OutsideChess.top().getWeight()) {
                            chessBoard.out = chessBoard.Space[2][1];
                        }
                        //顏色不同 需要比較小且三個相連
                    }else if (chessBoard.Space[2][0].top().getColor() == chessBoard.Space[2][1].top().getColor() && chessBoard.Space[2][1].top().getColor()==chessBoard.Space[2][2].top().getColor()
                            && chessBoard.Space[2][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][1];
                    }else if (chessBoard.Space[2][1].top().getColor() == chessBoard.Space[2][2].top().getColor() && chessBoard.Space[2][2].top().getColor()==chessBoard.Space[2][3].top().getColor()
                            && chessBoard.Space[2][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][1];
                    }else if (chessBoard.Space[0][1].top().getColor() == chessBoard.Space[1][1].top().getColor() && chessBoard.Space[1][1].top().getColor()==chessBoard.Space[2][1].top().getColor()
                            && chessBoard.Space[2][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][1];
                    }else if (chessBoard.Space[1][1].top().getColor() == chessBoard.Space[2][1].top().getColor() && chessBoard.Space[2][1].top().getColor()==chessBoard.Space[3][1].top().getColor()
                            && chessBoard.Space[2][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][1];
                    }else if (chessBoard.Space[1][0].top().getColor() == chessBoard.Space[2][1].top().getColor() && chessBoard.Space[2][1].top().getColor()==chessBoard.Space[3][2].top().getColor()
                            && chessBoard.Space[2][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][1];
                    }else if (chessBoard.Space[0][3].top().getColor() == chessBoard.Space[1][2].top().getColor() && chessBoard.Space[1][2].top().getColor()==chessBoard.Space[2][1].top().getColor()
                            && chessBoard.Space[2][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][1];
                    }else if (chessBoard.Space[1][2].top().getColor() == chessBoard.Space[2][1].top().getColor() && chessBoard.Space[2][1].top().getColor()==chessBoard.Space[3][0].top().getColor()
                            && chessBoard.Space[2][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][1];
                    }
                }else chessBoard.out = chessBoard.Space[2][1];
            }
        });
        //==============================S 2 2  =================================================
        chessBoard.Space[2][2].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[2][2].top().getColor()!=-1) {
                    //顏色相同且比較小 可以被蓋
                    if (chessBoard.Space[2][2].top().getColor() == chessBoard.OutsideChess.top().getColor()) {
                        if(chessBoard.Space[2][2].top().getWeight() < chessBoard.OutsideChess.top().getWeight()) {
                            chessBoard.out = chessBoard.Space[2][2];
                        }
                        //顏色不同 需要比較小且三個相連
                    }else if (chessBoard.Space[2][0].top().getColor() == chessBoard.Space[2][1].top().getColor() && chessBoard.Space[2][1].top().getColor()==chessBoard.Space[2][2].top().getColor()
                            && chessBoard.Space[2][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][2];
                    }else if (chessBoard.Space[2][1].top().getColor() == chessBoard.Space[2][2].top().getColor() && chessBoard.Space[2][2].top().getColor()==chessBoard.Space[2][3].top().getColor()
                            && chessBoard.Space[2][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][2];
                    }else if (chessBoard.Space[0][2].top().getColor() == chessBoard.Space[1][2].top().getColor() && chessBoard.Space[1][2].top().getColor()==chessBoard.Space[2][2].top().getColor()
                            && chessBoard.Space[2][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][2];
                    }else if (chessBoard.Space[1][2].top().getColor() == chessBoard.Space[2][2].top().getColor() && chessBoard.Space[2][2].top().getColor()==chessBoard.Space[3][2].top().getColor()
                            && chessBoard.Space[2][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][2];
                    }else if (chessBoard.Space[0][0].top().getColor() == chessBoard.Space[1][1].top().getColor() && chessBoard.Space[1][1].top().getColor()==chessBoard.Space[2][2].top().getColor()
                            && chessBoard.Space[2][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][2];
                    }else if (chessBoard.Space[1][1].top().getColor() == chessBoard.Space[2][2].top().getColor() && chessBoard.Space[2][2].top().getColor()==chessBoard.Space[3][3].top().getColor()
                            && chessBoard.Space[2][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][2];
                    }else if (chessBoard.Space[1][3].top().getColor() == chessBoard.Space[2][2].top().getColor() && chessBoard.Space[2][2].top().getColor()==chessBoard.Space[3][1].top().getColor()
                            && chessBoard.Space[2][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][2];
                    }
                }else chessBoard.out = chessBoard.Space[2][2];
            }
        });
        //==============================S 2 3  =================================================
        chessBoard.Space[2][3].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[2][3].top().getColor()!=-1) {
                    //顏色相同且比較小 可以被蓋
                    if (chessBoard.Space[2][3].top().getColor() == chessBoard.OutsideChess.top().getColor()) {
                        if(chessBoard.Space[2][3].top().getWeight() < chessBoard.OutsideChess.top().getWeight()) {
                            chessBoard.out = chessBoard.Space[2][3];
                        }
                        //顏色不同 需要比較小且三個相連
                    }else if (chessBoard.Space[2][1].top().getColor() == chessBoard.Space[2][2].top().getColor() && chessBoard.Space[2][2].top().getColor()==chessBoard.Space[2][3].top().getColor()
                            && chessBoard.Space[2][3].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][3];
                    }else if (chessBoard.Space[0][3].top().getColor() == chessBoard.Space[1][3].top().getColor() && chessBoard.Space[1][3].top().getColor()==chessBoard.Space[2][3].top().getColor()
                            && chessBoard.Space[2][3].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][3];
                    }else if (chessBoard.Space[1][3].top().getColor() == chessBoard.Space[2][3].top().getColor() && chessBoard.Space[2][3].top().getColor()==chessBoard.Space[3][3].top().getColor()
                            && chessBoard.Space[2][3].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][3];
                    }else if (chessBoard.Space[0][1].top().getColor() == chessBoard.Space[1][2].top().getColor() && chessBoard.Space[1][2].top().getColor()==chessBoard.Space[2][3].top().getColor()
                            && chessBoard.Space[2][3].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[2][3];
                    }
                }else chessBoard.out = chessBoard.Space[2][3];
            }
        });
        //==============================S 3 0  =================================================
        chessBoard.Space[3][0].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[3][0].top().getColor()!=-1) {
                    //顏色相同且比較小 可以被蓋
                    if (chessBoard.Space[3][0].top().getColor() == chessBoard.OutsideChess.top().getColor()) {
                        if(chessBoard.Space[3][0].top().getWeight() < chessBoard.OutsideChess.top().getWeight()) {
                            chessBoard.out = chessBoard.Space[3][0];
                        }
                        //顏色不同 需要比較小且三個相連
                    }else if (chessBoard.Space[1][0].top().getColor() == chessBoard.Space[2][0].top().getColor() && chessBoard.Space[2][0].top().getColor()==chessBoard.Space[3][0].top().getColor()
                            && chessBoard.Space[3][0].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[3][0];
                    }else if (chessBoard.Space[3][0].top().getColor() == chessBoard.Space[3][1].top().getColor() && chessBoard.Space[3][1].top().getColor()==chessBoard.Space[3][2].top().getColor()
                            && chessBoard.Space[3][0].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[3][0];
                    }else if (chessBoard.Space[1][2].top().getColor() == chessBoard.Space[2][1].top().getColor() && chessBoard.Space[2][1].top().getColor()==chessBoard.Space[3][0].top().getColor()
                            && chessBoard.Space[3][0].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[3][0];
                    }
                }else chessBoard.out = chessBoard.Space[3][0];
            }
        });
        //==============================S 3 1  =================================================
        chessBoard.Space[3][1].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[3][1].top().getColor()!=-1) {
                    //顏色相同且比較小 可以被蓋
                    if (chessBoard.Space[3][1].top().getColor() == chessBoard.OutsideChess.top().getColor()) {
                        if(chessBoard.Space[3][1].top().getWeight() < chessBoard.OutsideChess.top().getWeight()) {
                            chessBoard.out = chessBoard.Space[3][1];
                        }
                        //顏色不同 需要比較小且三個相連
                    }else if (chessBoard.Space[1][1].top().getColor() == chessBoard.Space[2][1].top().getColor() && chessBoard.Space[2][1].top().getColor()==chessBoard.Space[3][1].top().getColor()
                            && chessBoard.Space[3][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[3][1];
                    }else if (chessBoard.Space[3][0].top().getColor() == chessBoard.Space[3][1].top().getColor() && chessBoard.Space[3][1].top().getColor()==chessBoard.Space[3][2].top().getColor()
                            && chessBoard.Space[3][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[3][1];
                    }else if (chessBoard.Space[3][1].top().getColor() == chessBoard.Space[3][2].top().getColor() && chessBoard.Space[3][2].top().getColor()==chessBoard.Space[3][3].top().getColor()
                            && chessBoard.Space[3][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[3][1];
                    }else if (chessBoard.Space[1][3].top().getColor() == chessBoard.Space[2][2].top().getColor() && chessBoard.Space[2][2].top().getColor()==chessBoard.Space[3][1].top().getColor()
                            && chessBoard.Space[3][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[3][1];
                    }
                }else chessBoard.out = chessBoard.Space[3][1];
            }
        });
        //==============================S 3 2  =================================================
        chessBoard.Space[3][2].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[3][2].top().getColor()!=-1) {
                    //顏色相同且比較小 可以被蓋
                    if (chessBoard.Space[3][2].top().getColor() == chessBoard.OutsideChess.top().getColor()) {
                        if(chessBoard.Space[3][2].top().getWeight() < chessBoard.OutsideChess.top().getWeight()) {
                            chessBoard.out = chessBoard.Space[3][2];
                        }
                        //顏色不同 需要比較小且三個相連
                    }else if (chessBoard.Space[1][2].top().getColor() == chessBoard.Space[2][2].top().getColor() && chessBoard.Space[2][2].top().getColor()==chessBoard.Space[3][2].top().getColor()
                            && chessBoard.Space[3][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[3][2];
                    }else if (chessBoard.Space[3][0].top().getColor() == chessBoard.Space[3][1].top().getColor() && chessBoard.Space[3][1].top().getColor()==chessBoard.Space[3][2].top().getColor()
                            && chessBoard.Space[3][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[3][2];
                    }else if (chessBoard.Space[3][1].top().getColor() == chessBoard.Space[3][2].top().getColor() && chessBoard.Space[3][2].top().getColor()==chessBoard.Space[3][3].top().getColor()
                            && chessBoard.Space[3][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[3][2];
                    }else if (chessBoard.Space[1][0].top().getColor() == chessBoard.Space[2][1].top().getColor() && chessBoard.Space[2][1].top().getColor()==chessBoard.Space[3][2].top().getColor()
                            && chessBoard.Space[3][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[3][2];
                    }
                }else chessBoard.out = chessBoard.Space[3][2];
            }
        });
        //==============================S 3 3  =================================================
        chessBoard.Space[3][3].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chessBoard.Space[3][3].top().getColor()!=-1) {
                    //顏色相同且比較小 可以被蓋
                    if (chessBoard.Space[3][3].top().getColor() == chessBoard.OutsideChess.top().getColor()) {
                        if(chessBoard.Space[3][3].top().getWeight() < chessBoard.OutsideChess.top().getWeight()) {
                            chessBoard.out = chessBoard.Space[3][3];
                        }
                        //顏色不同 需要比較小且三個相連
                    }else if (chessBoard.Space[1][3].top().getColor() == chessBoard.Space[2][3].top().getColor() && chessBoard.Space[2][3].top().getColor()==chessBoard.Space[3][3].top().getColor()
                            && chessBoard.Space[3][3].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[3][3];
                    }else if (chessBoard.Space[3][1].top().getColor() == chessBoard.Space[3][2].top().getColor() && chessBoard.Space[3][2].top().getColor()==chessBoard.Space[3][3].top().getColor()
                            && chessBoard.Space[3][3].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[3][3];
                    }else if (chessBoard.Space[1][1].top().getColor() == chessBoard.Space[2][2].top().getColor() && chessBoard.Space[2][2].top().getColor()==chessBoard.Space[3][3].top().getColor()
                            && chessBoard.Space[3][3].top().getWeight()<chessBoard.OutsideChess.top().getWeight() ) {
                        chessBoard.out = chessBoard.Space[3][3];
                    }
                }else chessBoard.out = chessBoard.Space[3][3];
            }
        });
    }
}