package com.googledevelopersgroup.androidworkshop_userinput_userinterface;

import android.content.Context;
import android.graphics.Canvas;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.SurfaceHolder;

/**
 * Represents the game-view where the user is going to interact with the game.
 */
public class GameView extends SurfaceView implements SurfaceHolder.Callback {

    //the thread that is going to be updating the game.
    private GamingThread gamingThread;

    public GameView(Context context) {
        super(context);
        gamingThread = new GamingThread(getHolder(), this);
        setFocusable(true);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        gamingThread.setRunning(true);
        gamingThread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        try {
            gamingThread.setRunning(false);
            gamingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void update() {

    }
}
