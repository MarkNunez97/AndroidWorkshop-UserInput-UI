package com.googledevelopersgroup.androidworkshop_userinput_userinterface;

import android.graphics.Canvas;
import android.support.v4.util.Consumer;
import android.view.SurfaceHolder;

import java.util.Arrays;
import java.util.List;

/**
 * Responsible for updating the game for the user.
 */
public class GamingThread extends Thread {
    private final SurfaceHolder surfaceHolder;
    private GameView gameView;
    private List<GameObserver> observers;
    private boolean running;
    public static Canvas canvas;

    GamingThread(SurfaceHolder surfaceHolder, GameObserver... observers) {
        this.surfaceHolder = surfaceHolder;
        this.observers.addAll(Arrays.asList(observers));
    }

    @Override
    public void run() {
        while (running) {
            canvas = null;

            try {
                canvas = this.surfaceHolder.lockCanvas();
                synchronized(surfaceHolder) {
                    for (GameObserver observer: observers) {
                        observer.draw(canvas);
                        observer.update();
                    }
                }
            } catch (Exception ignored) {} finally {
                if (canvas != null) {
                    try {
                        surfaceHolder.unlockCanvasAndPost(canvas);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


    void setRunning(boolean running) {
        this.running = running;
    }
}
