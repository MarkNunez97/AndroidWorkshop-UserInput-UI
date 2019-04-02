package com.googledevelopersgroup.androidworkshop_userinput_userinterface.Character;


import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import com.googledevelopersgroup.androidworkshop_userinput_userinterface.GameObserver;
import com.googledevelopersgroup.androidworkshop_userinput_userinterface.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FallingObjectManager implements GameObserver {
    private List<FallingObject> fallingObjects;
    private Random random = new Random();
    private int numOfObjects;
    private Resources resources;

    public FallingObjectManager(int numOfObjects, Resources resources) {
        this.numOfObjects = numOfObjects;
        this.resources = resources;
    }

    private void generateFallingObjects(int maxWidth){
        for(int x = 0; x < numOfObjects; x++){
            int pos = random.nextInt(maxWidth);
            fallingObjects.add(new Asteroid(pos, 0, BitmapFactory.decodeResource(resources, R.drawable.spaceship)));
        }
    }

    @Override
    public void draw(Canvas canvas) {
        for (FallingObject fallingObject: fallingObjects) {
            fallingObject.draw(canvas);
        }
    }

    @Override
    public void update() {

    }


}
