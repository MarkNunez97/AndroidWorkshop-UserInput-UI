package com.googledevelopersgroup.androidworkshop_userinput_userinterface.Character;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

public class MainCharacter implements View.OnTouchListener, GameCharacter {
    private Bitmap bitmap;
    private int x,y;
    private int xVelocity, yVelocity;

    public MainCharacter(Bitmap bitmap, int x, int y) {
        this.xVelocity = 5;
        this.bitmap = bitmap;
        this.x = x;
        this.y = y;
    }

    public MainCharacter(Bitmap bitmap) {
        this(bitmap, 100, 100);
    }
    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(bitmap, x, y, null);
    }

    @Override
    public void update(int x, int y) {
        this.x = x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setxVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    @Override
    public void setyVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        this.x = ((int)event.getX());
        return false;
    }
}
