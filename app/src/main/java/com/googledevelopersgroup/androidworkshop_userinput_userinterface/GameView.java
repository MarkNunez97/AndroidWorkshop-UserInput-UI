package com.googledevelopersgroup.androidworkshop_userinput_userinterface;

import android.content.Context;
import android.view.SurfaceView;
import android.view.SurfaceHolder;

/**
 * Represents the game-view where the user is going to interact with the game.
 */
public class GameView extends SurfaceView implements SurfaceHolder.Callback {
    public GameView(Context context) {
        super(context);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
