package com.example.weilunwang.ooseproject;
/**
 * Created by WeiLunWang on 2015/12/29.
 */
public class Set {
    private int x;
    private int y;
    public Set(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void SetXY(int x,int y){
        this.x = x;
        this.y = y;
    }
    public boolean checkXY(int x,int y){
        if(this.x==x && this.y == y)return true;
        else return false;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

}

