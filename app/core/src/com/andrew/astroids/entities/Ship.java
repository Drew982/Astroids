package com.andrew.astroids.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Andrew on 1/13/2017.
 */
public class Ship
{
    Sprite sprite;
    SpriteBatch spriteBatch;
    Vector2 position;
    Vector2 velocity;
    Vector2 thrusterVelocity;

    public Ship()
    {
        sprite = new Sprite(new Texture("badlogic.jpg"));
        sprite.setSize(50, 50);
        position = new Vector2(Gdx.graphics.getWidth() / 2f - (sprite.getWidth() / 2f),
                Gdx.graphics.getHeight() / 2f - (sprite.getHeight() / 2f));
        spriteBatch = new SpriteBatch();
        sprite.setX(position.x);
        sprite.setY(position.y);
        velocity = new Vector2(100, 100);
        thrusterVelocity = new Vector2(0, -100);
    }

    public void render(float delta) //delta is time passed
    {
        velocity.add(thrusterVelocity.x*delta, thrusterVelocity.y*delta);
        position.x += (delta * velocity.x);
        position.y += (delta * velocity.y);
        wrap();
        spriteBatch.begin();
        sprite.draw(spriteBatch);
        spriteBatch.end();
    }

    public void wrap()
    {
        float leftWall = 0;
        float rightWall = Gdx.graphics.getWidth();
        float bottomWall = 0;
        float upperWall = Gdx.graphics.getHeight();

        if(position.x > rightWall) {
            position.x = leftWall - sprite.getWidth();
        }
        if(position.x + sprite.getWidth() < leftWall) {
            position.x = rightWall;
        }
        if(position.y > upperWall) {
            position.y = bottomWall - sprite.getHeight();
        }
        if(position.y + sprite.getHeight() < bottomWall) {
            position.y = upperWall;
        }

        sprite.setX(position.x);
        sprite.setY(position.y);
    }
}


