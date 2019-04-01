package com.googledevelopersgroup.androidworkshop_userinput_userinterface;

import android.graphics.Canvas;

public interface GameObserver {
    void draw(Canvas canvas);
    void update();
}
