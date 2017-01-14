package com.andrew.astroids;

import com.andrew.astroids.screens.GameScreen;
import com.badlogic.gdx.Game;

public class Asteroids extends Game
{

	@Override
	public void create()
	{
		setScreen(new GameScreen(this));
	}
}
