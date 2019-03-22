package com.googledevelopersgroup.androidworkshop_userinput_userinterface.Character;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import com.googledevelopersgroup.androidworkshop_userinput_userinterface.CharacterMovement;

public class MainCharacter implements GameCharacter {
    private Bitmap bitmap;
    private int x,y;
    private int xVelocity, yVelocity;

    public MainCharacter(Bitmap bitmap, int x, int y) {
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
    public void update(CharacterMovement movement) {
        switch(movement){
            case RIGHT:
                if(x < SCREEN_WIDTH){//collision with the screen
                    x += xVelocity;
                }
            case LEFT:
                if(x > 0){//collision with the screen
                    x -= xVelocity;
                }

        }
    }

    @Override
    public void setxVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    @Override
    public void setyVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }
}
