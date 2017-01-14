package com.andrew.astroids.screens;

import com.andrew.astroids.Astroids;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Andrew on 1/13/2017.
 */
public class GameScreen extends ScreenAdapter
{
    Astroids astroids;
    Sprite sprite;
    SpriteBatch spriteBatch;
    float direction = 1;

    public GameScreen(Astroids astroids)
    {
        this.astroids = astroids;
        sprite = new Sprite(new Texture("badlogic.jpg"));
        spriteBatch = new SpriteBatch();
    }

    @Override
    public void render(float delta) //delta is time passed
    {
        Gdx.gl.glClearColor(0, 0, 0, 1); //alpha is transparency
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        if (sprite.getX() + sprite.getWidth() >= Gdx.graphics.getWidth())
        {
            direction = -1;
        }
        if(sprite.getX() <= 0)
        {
            direction = 1;
        }
        sprite.translateX(Gdx.graphics.getWidth() * delta * direction);
        spriteBatch.begin();
        sprite.draw(spriteBatch);
        spriteBatch.end();
    }
}
