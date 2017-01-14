package com.andrew.astroids;

import com.andrew.astroids.screens.GameScreen;
import com.badlogic.gdx.Game;

public class Astroids extends Game
{

	@Override
	public void create()
	{
		setScreen(new GameScreen(this));
	}
}
