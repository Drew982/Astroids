package com.andrew.astroids.screens;

import com.andrew.astroids.AsteroidInputProcessor;
import com.andrew.astroids.Asteroids;
import com.andrew.astroids.entities.Ship;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;

/**
 * Created by Andrew on 1/13/2017.
 */
public class GameScreen extends ScreenAdapter
{
    Asteroids asteroids;
    Ship ship;

    public GameScreen(Asteroids asteroids)
    {
        this.asteroids = asteroids;
        ship = new Ship();
        Gdx.input.setInputProcessor(new AsteroidInputProcessor(ship));
    }

    @Override
    public void render(float delta) //delta is time passed
    {
        Gdx.gl.glClearColor(0, 0, 0, 1); //alpha is transparency
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        ship.render(delta);
    }
}
