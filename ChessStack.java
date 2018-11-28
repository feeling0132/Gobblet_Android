package com.example.weilunwang.ooseproject;
import android.graphics.Color;
import android.media.Image;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.weilunwang.ooseproject.R;

import java.util.Stack;

/**
 * Created by WeiLunWang on 2015/12/27.
 */
public class ChessStack {
    Stack<Chess> stack;
    ImageButton button;

    public ChessStack() {
        stack = new Stack<Chess>();
    }

    public void setButton(ImageButton button) {
        this.button = (ImageButton) button;
    }

    public Chess top() {
        return stack.peek();
    }

    public void push(Chess chess) {
        stack.push(chess);
        setIcon();
    }

    public Chess pop() {
        Chess chess = stack.pop();
        setIcon();
        return chess;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    private void setIcon() {
        if(isEmpty() || stack.peek().getColor() == -1) {
            button.setImageResource(R.drawable.gray);
        }else if (stack.peek().getColor() == 0 ) {
            switch (stack.peek().getWeight()) {
                case 1:
                    button.setImageResource(R.drawable.r1);
                    break;
                case 2:
                    button.setImageResource(R.drawable.r2);
                    break;
                case 3:
                    button.setImageResource(R.drawable.r3);
                    break;
                case 4:
                    button.setImageResource(R.drawable.r4);
                    break;
            }

        } else if (stack.peek().getColor() == 1) {
            switch (stack.peek().getWeight()) {
                case 1:
                    button.setImageResource(R.drawable.b1);
                    break;
                case 2:
                    button.setImageResource(R.drawable.b2);
                    break;
                case 3:
                    button.setImageResource(R.drawable.b3);
                    break;
                case 4:
                    button.setImageResource(R.drawable.b4);
                    break;
            }

        }
    }
}