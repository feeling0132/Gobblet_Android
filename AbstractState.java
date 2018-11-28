package com.example.weilunwang.ooseproject;

/**
 * Created by WeiLunWang on 2015/12/28.
 */
public interface AbstractState {
    abstract void toNextState(ChessBoard chessBoard,AbstractState state);
}
