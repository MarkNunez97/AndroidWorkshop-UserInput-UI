package com.googledevelopersgroup.androidworkshop_userinput_userinterface;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Represents the super class that the characters of the game are going  to use in order to be inserted in the dame
 */
abstract class GameCharacter {
    private Bitmap bitmap; // the image of the character.
    private int x, y; // the coordinates of the character
    private int xVelocity;

    public GameCharacter(Bitmap bitmap, int x, int y){
        this.bitmap = bitmap;
        this.x = x;
        this.y = y;
    }

    public GameCharacter(Bitmap bitmap) {
        this(bitmap,100,100);
    }

    /**
     * going to draw the character in the canvas.
     * @param canvas - where the character is going to be drawn into.
     */
    public void draw(Canvas canvas){
        canvas.drawBitmap(bitmap, x, y, null);
    }

    /**
     * Going to handle the events of the character, for example, the movements of the character in the canvas.
     * @param movement - the movement of the character.
     */
    public void update(CharacterMovement movement){
        switch(movement){
            case RIGHT:
                x += xVelocity;
            case LEFT:
                x -= xVelocity;
        }
    }
}

