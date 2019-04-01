package com.googledevelopersgroup.androidworkshop_userinput_userinterface.Character;


import android.graphics.Canvas;

import com.googledevelopersgroup.androidworkshop_userinput_userinterface.GameObserver;

import java.util.ArrayList;
import java.util.List;

public class FallingObjectManager implements GameObserver {
    private List<FallingObject> fallingObjects;
    private int numOfObjects;//the number of falling object in the screen at once.

    public FallingObjectManager(int numOfObjects) {
        this.numOfObjects = numOfObjects;
    }

    private void generateFallingObjects(){

    }

    public void setNumOfObjects(int numOfObjects) {
        this.numOfObjects = numOfObjects;
    }

    @Override
    public void draw(Canvas canvas) {
        for (FallingObject fallingObject:fallingObjects) {

        }
    }

    @Override
    public void update() {

    }
}
