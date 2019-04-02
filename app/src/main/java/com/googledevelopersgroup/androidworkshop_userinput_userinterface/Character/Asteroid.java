package com.googledevelopersgroup.androidworkshop_userinput_userinterface.Character;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Asteroid implements FallingObject {
    private int x, y;
    private Bitmap bitmap;
    private FallingObjectListener listener;
    private int yVelocity;

    public Asteroid(Bitmap bitmap) {
        this(0,0, bitmap);
    }

    public Asteroid(int x, int y, Bitmap bitmap) {
        this.x = x;
        this.y = y;
        this.bitmap = bitmap;
        this.yVelocity = 10;
    }

    @Override
    public void setyVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }

    @Override
    public void setFallingObjListener(FallingObjectListener listener) {
        this.listener = listener;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(bitmap, x, y, null);
    }

    @Override
    public void update(int x, int y) {
        this.y += yVelocity;
        if(y >= GameCharacter.SCREEN_HEIGHT && listener != null){
            listener.onDestroyed(this);
        }
    }


}
