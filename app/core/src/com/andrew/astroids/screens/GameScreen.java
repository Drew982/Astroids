package com.andrew.astroids.screens;

import com.andrew.astroids.Astroids;
import com.badlogic.gdx.ScreenAdapter;

/**
 * Created by Andrew on 1/13/2017.
 */
public class GameScreen extends ScreenAdapter
{
    Astroids astroids;
    public GameScreen(Astroids astroids)
    {
        this.astroids = astroids;
    }
}
