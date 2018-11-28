package com.example.weilunwang.ooseproject;
import android.graphics.drawable.Icon;
import android.widget.ImageView;

import java.util.Objects;

/**
 * Created by WeiLunWang on 2015/12/27.
 */
public class Chess {
    final int RED = 0;
    final int BLACK = 1;
    private int weight;
    private int color;

    public Chess(int color,int weight){
        this.color = color;
        this.weight = weight;
    }

    public int getColor() {
        return color;
    }

    public int getWeight(){
        return weight;
    }

    public boolean equals(Chess chess){
        return this.color == chess.color;
    }
}
