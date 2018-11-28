package com.example.weilunwang.ooseproject;
import android.view.View;

/**
 * Created by WeiLunWang on 2015/12/29.
 */

class FullModeStateB extends FullModeState {
    FullModeStateB(final ChessBoard chessBoard, final ChessGame chessGame, int color,final Set set) {
        gameoverCheck(chessBoard, chessGame);
        chessBoard.out = null;
        if (color == chessBoard.RED) {
            chessBoard.RedClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (chessBoard.out != null) {
                        chessBoard.out.push(chessBoard.OutsideChess.pop());
                        chessBoard.state = new FullModeStateA(chessBoard, chessGame, chessBoard.BLACK);
                    }
                }
            });
        } else {
            chessBoard.BlackClick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (chessBoard.out != null) {
                        chessBoard.out.push(chessBoard.OutsideChess.pop());
                        chessBoard.state = new FullModeStateA(chessBoard, chessGame, chessBoard.RED);
                    }
                }
            });
        }
        //==============================S 0 0 =================================================
        chessBoard.Space[0][0].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(set.checkXY(0,0)||set.checkXY(0,1)||set.checkXY(1,0))
                    if (chessBoard.Space[0][0].top().getColor() != -1) {
                        if(chessBoard.Space[0][0].top().getWeight()<chessBoard.OutsideChess.top().getWeight()){
                            chessBoard.out = chessBoard.Space[0][0];
                        }
                        //顏色相同且比較小 可以被蓋
                    } else chessBoard.out = chessBoard.Space[0][0];
            }
        });
        //==============================S 0 1 =================================================
        chessBoard.Space[0][1].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(set.checkXY(0,1)||set.checkXY(0,0)||set.checkXY(1,1)||set.checkXY(0,2))
                    if (chessBoard.Space[0][1].top().getColor() != -1) {
                        if(chessBoard.Space[0][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight()){
                            chessBoard.out = chessBoard.Space[0][1];
                        }
                        //顏色相同且比較小 可以被蓋
                    } else chessBoard.out = chessBoard.Space[0][1];
            }
        });
        //==============================S 0 2 =================================================
        chessBoard.Space[0][2].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(set.checkXY(0,2)||set.checkXY(0,1)||set.checkXY(1,2)||set.checkXY(0,3))
                    if (chessBoard.Space[0][2].top().getColor() != -1) {
                        if(chessBoard.Space[0][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight()){
                            chessBoard.out = chessBoard.Space[0][2];
                        }
                        //顏色相同且比較小 可以被蓋
                    } else chessBoard.out = chessBoard.Space[0][2];
            }
        });
        //==============================S 0 3 =================================================
        chessBoard.Space[0][3].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(set.checkXY(0,3)||set.checkXY(0,2)||set.checkXY(1,3))
                    if (chessBoard.Space[0][3].top().getColor() != -1) {
                        if(chessBoard.Space[0][3].top().getWeight()<chessBoard.OutsideChess.top().getWeight()){
                            chessBoard.out = chessBoard.Space[0][3];
                        }
                        //顏色相同且比較小 可以被蓋
                    } else chessBoard.out = chessBoard.Space[0][3];
            }
        });
        //==============================S 1 0 =================================================
        chessBoard.Space[1][0].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(set.checkXY(1,0)||set.checkXY(0,0)||set.checkXY(1,1)||set.checkXY(2,0))
                    if (chessBoard.Space[1][0].top().getColor() != -1) {
                        if(chessBoard.Space[1][0].top().getWeight()<chessBoard.OutsideChess.top().getWeight()){
                            chessBoard.out = chessBoard.Space[1][0];
                        }
                        //顏色相同且比較小 可以被蓋
                    } else chessBoard.out = chessBoard.Space[1][0];
            }
        });
        //==============================S 1 1 =================================================
        chessBoard.Space[1][1].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(set.checkXY(1,1)||set.checkXY(0,1)||set.checkXY(1,0)||set.checkXY(2,1)||set.checkXY(1,2))
                    if (chessBoard.Space[1][1].top().getColor() != -1) {
                        if(chessBoard.Space[1][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight()){
                            chessBoard.out = chessBoard.Space[1][1];
                        }
                        //顏色相同且比較小 可以被蓋
                    } else chessBoard.out = chessBoard.Space[1][1];
            }
        });
        //==============================S 1 2 =================================================
        chessBoard.Space[1][2].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(set.checkXY(1,2)||set.checkXY(0,2)||set.checkXY(1,1)||set.checkXY(2,2)||set.checkXY(1,3))
                    if (chessBoard.Space[1][2].top().getColor() != -1) {
                        if(chessBoard.Space[1][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight()){
                            chessBoard.out = chessBoard.Space[1][2];
                        }
                        //顏色相同且比較小 可以被蓋
                    } else chessBoard.out = chessBoard.Space[1][2];
            }
        });
        //==============================S 1 3 =================================================
        chessBoard.Space[1][3].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(set.checkXY(1,3)||set.checkXY(0,3)||set.checkXY(1,2)||set.checkXY(2,3))
                    if (chessBoard.Space[1][3].top().getColor() != -1) {
                        if(chessBoard.Space[1][3].top().getWeight()<chessBoard.OutsideChess.top().getWeight()){
                            chessBoard.out = chessBoard.Space[1][3];
                        }
                        //顏色相同且比較小 可以被蓋
                    } else chessBoard.out = chessBoard.Space[1][3];
            }
        });
        //==============================S 2 0 =================================================
        chessBoard.Space[2][0].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(set.checkXY(2,0)||set.checkXY(1,0)||set.checkXY(2,1)||set.checkXY(3,0))
                    if (chessBoard.Space[2][0].top().getColor() != -1) {
                        if(chessBoard.Space[2][0].top().getWeight()<chessBoard.OutsideChess.top().getWeight()){
                            chessBoard.out = chessBoard.Space[2][0];
                        }
                        //顏色相同且比較小 可以被蓋
                    } else chessBoard.out = chessBoard.Space[2][0];
            }
        });
        //==============================S 2 1 =================================================
        chessBoard.Space[2][1].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(set.checkXY(2,1)||set.checkXY(1,1)||set.checkXY(2,0)||set.checkXY(3,1)||set.checkXY(2,2))
                    if (chessBoard.Space[2][1].top().getColor() != -1) {
                        if(chessBoard.Space[2][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight()){
                            chessBoard.out = chessBoard.Space[2][1];
                        }
                        //顏色相同且比較小 可以被蓋
                    } else chessBoard.out = chessBoard.Space[2][1];
            }
        });
        //==============================S 2 2 =================================================
        chessBoard.Space[2][2].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(set.checkXY(2,2)||set.checkXY(1,2)||set.checkXY(2,1)||set.checkXY(3,2)||set.checkXY(2,3))
                    if (chessBoard.Space[2][2].top().getColor() != -1) {
                        if(chessBoard.Space[2][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight()){
                            chessBoard.out = chessBoard.Space[2][2];
                        }
                        //顏色相同且比較小 可以被蓋
                    } else chessBoard.out = chessBoard.Space[2][2];
            }
        });
        //==============================S 2 3 =================================================
        chessBoard.Space[2][3].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(set.checkXY(2,3)||set.checkXY(1,3)||set.checkXY(2,2)||set.checkXY(3,3))
                    if (chessBoard.Space[2][3].top().getColor() != -1) {
                        if(chessBoard.Space[2][3].top().getWeight()<chessBoard.OutsideChess.top().getWeight()){
                            chessBoard.out = chessBoard.Space[2][3];
                        }
                        //顏色相同且比較小 可以被蓋
                    } else chessBoard.out = chessBoard.Space[2][3];
            }
        });
        //==============================S 3 0 =================================================
        chessBoard.Space[3][0].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(set.checkXY(3,0)||set.checkXY(2,0)||set.checkXY(3,1))
                    if (chessBoard.Space[3][0].top().getColor() != -1) {
                        if(chessBoard.Space[3][0].top().getWeight()<chessBoard.OutsideChess.top().getWeight()){
                            chessBoard.out = chessBoard.Space[3][0];
                        }
                        //顏色相同且比較小 可以被蓋
                    } else chessBoard.out = chessBoard.Space[3][0];
            }
        });
        //==============================S 3 1 =================================================
        chessBoard.Space[3][1].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(set.checkXY(3,1)||set.checkXY(2,1)||set.checkXY(3,0)||set.checkXY(3,2))
                    if (chessBoard.Space[3][1].top().getColor() != -1) {
                        if(chessBoard.Space[3][1].top().getWeight()<chessBoard.OutsideChess.top().getWeight()){
                            chessBoard.out = chessBoard.Space[3][1];
                        }
                        //顏色相同且比較小 可以被蓋
                    } else chessBoard.out = chessBoard.Space[3][1];
            }
        });
        //==============================S 3 2 =================================================
        chessBoard.Space[3][2].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(set.checkXY(3,2)||set.checkXY(2,2)||set.checkXY(3,1)||set.checkXY(3,3))
                    if (chessBoard.Space[3][2].top().getColor() != -1) {
                        if(chessBoard.Space[3][2].top().getWeight()<chessBoard.OutsideChess.top().getWeight()){
                            chessBoard.out = chessBoard.Space[3][2];
                        }
                        //顏色相同且比較小 可以被蓋
                    } else chessBoard.out = chessBoard.Space[3][2];
            }
        });
        //==============================S 3 3 =================================================
        chessBoard.Space[3][3].button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(set.checkXY(3,3)||set.checkXY(2,3)||set.checkXY(3,2))
                    if (chessBoard.Space[3][3].top().getColor() != -1) {
                        if(chessBoard.Space[3][3].top().getWeight()<chessBoard.OutsideChess.top().getWeight()){
                            chessBoard.out = chessBoard.Space[3][3];
                        }
                        //顏色相同且比較小 可以被蓋
                    } else chessBoard.out = chessBoard.Space[3][3];
            }
        });

    }
}