package com.googledevelopersgroup.androidworkshop_userinput_userinterface.Character;

import android.content.res.Resources;
import android.graphics.Canvas;

/**
 * Represents the super class that the characters of the game are going  to use in order to be inserted in the dame
 */
public interface GameCharacter {
    int SCREEN_WIDTH = Resources.getSystem().getDisplayMetrics().widthPixels;
    int SCREEN_HEIGHT = Resources.getSystem().getDisplayMetrics().heightPixels;

    /**
     * going to draw the character in the canvas.
     *
     * @param canvas - where the character is going to be drawn into.
     */
    void draw(Canvas canvas);

    /**
     * Going to handle the events of the character, for example, the movements of the character in the canvas.
     *
     * @param movement - the movement of the character.
     */
    void update(CharacterMovement movement);

    void setxVelocity(int xVelocity);

    void setyVelocity(int yVelocity);

}

