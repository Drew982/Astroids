package com.andrew.astroids;

import com.andrew.astroids.entities.Ship;
import com.badlogic.gdx.Input;

/**
 * Created by Andrew on 1/13/2017.
 */
public class AsteroidInputProcessor implements com.badlogic.gdx.InputProcessor
{

    private final Ship ship;

    public AsteroidInputProcessor(Ship ship)
    {
        this.ship = ship;
    }

    @Override
    public boolean keyDown(int keycode)
    {
        if (keycode == Input.Keys.UP || keycode == Input.Keys.W)
        {
            ship.activateThruster = true;
        }
        if (keycode == Input.Keys.DOWN || keycode == Input.Keys.S)
        {
            System.out.println("Down (or S) pressed");
        }
        if (keycode == Input.Keys.LEFT || keycode == Input.Keys.A)
        {
            System.out.println("Left (or A) pressed");
        }
        if (keycode == Input.Keys.RIGHT || keycode == Input.Keys.D)
        {
            System.out.println("Right (or D) pressed");
        }
        if (keycode == Input.Keys.SPACE)
        {
            System.out.println("Spacebar pressed");
        }
        return true;
    }

    @Override
    public boolean keyUp(int keycode)
    {
        if (keycode == Input.Keys.UP || keycode == Input.Keys.W)
        {
            ship.activateThruster = false;
        }
        if (keycode == Input.Keys.DOWN || keycode == Input.Keys.S)
        {
            System.out.println("Down (or S) up");
        }
        if (keycode == Input.Keys.LEFT || keycode == Input.Keys.A)
        {
            System.out.println("Left (or A) up");
        }
        if (keycode == Input.Keys.RIGHT || keycode == Input.Keys.D)
        {
            System.out.println("Right (or D) up");
        }
        if (keycode == Input.Keys.SPACE)
        {
            System.out.println("Spacebar up");
        }
        return true;
    }

    @Override
    public boolean keyTyped(char character)
    {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button)
    {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button)
    {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer)
    {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY)
    {
        return false;
    }

    @Override
    public boolean scrolled(int amount)
    {
        return false;
    }
}
