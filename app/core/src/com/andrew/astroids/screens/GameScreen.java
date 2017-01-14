package com.andrew.astroids.screens;

import com.andrew.astroids.Astroids;
import com.andrew.astroids.entities.Ship;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;

/**
 * Created by Andrew on 1/13/2017.
 */
public class GameScreen extends ScreenAdapter
{
    Astroids astroids;
    Ship ship = new Ship();
    float direction = 1;


    public GameScreen(Astroids astroids)
    {
        this.astroids = astroids;
    }

    @Override
    public void render(float delta) //delta is time passed
    {
        Gdx.gl.glClearColor(0, 0, 0, 1); //alpha is transparency
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        ship.render(delta);
    }
}
