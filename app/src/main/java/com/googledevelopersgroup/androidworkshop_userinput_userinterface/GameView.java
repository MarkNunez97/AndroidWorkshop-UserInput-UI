package com.googledevelopersgroup.androidworkshop_userinput_userinterface;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.SurfaceHolder;
import android.view.View;

import com.googledevelopersgroup.androidworkshop_userinput_userinterface.Character.GameCharacter;
import com.googledevelopersgroup.androidworkshop_userinput_userinterface.Character.MainCharacter;


/**
 * Represents the game-view where the user is going to interact with the game.
 */
public class GameView extends SurfaceView implements SurfaceHolder.Callback {

    //the thread that is going to be updating the game.
    private GamingThread gamingThread;
    private GameCharacter mainCharacter;
    private OnTouchListener touchListener = new OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int action = event.getActionMasked();
            switch (action){
                case MotionEvent.EDGE_RIGHT:
                    //todo action for when the user swipes to the right
                case MotionEvent.EDGE_LEFT:
                    //todo action for when the user swipes to the left
            }
            return false;
        }
    };

    public GameView(Context context) {
        super(context);
        gamingThread = new GamingThread(getHolder(), this);
        setFocusable(true);
        //TODO get a bitmap for the character
        mainCharacter = new MainCharacter(
                null, (GameCharacter.SCREEN_WIDTH/2), GameCharacter.SCREEN_HEIGHT);
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
        //todo we are going to update the characters
    }


}
