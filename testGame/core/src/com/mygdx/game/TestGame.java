package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Logger;

public class TestGame extends ApplicationAdapter
{
	private Logger logger;
	private boolean renderInterrupted;

	// This is used to initialize subsystems and load resources.
	@Override
	public void create ()
	{
		logger = new Logger("Application Lifecycle", Logger.INFO);
		logger.info("create");
	}

	// This is used to free resources and clean up
	@Override
	public void dispose()
	{
		logger.info("dispose");
	}

	// This is used to update and render the game elements.
	// Note that there is no update() method as render() is supposed to carry out
	// both tasks.
	@Override
	public void render ()
	{
		if (renderInterrupted)
		{
			logger.info("render");
			// The renderInterrupted member variable avoids printing render for
			// every game loop iteration.
			renderInterrupted = false;
		}
	}

	// This is used to handle setting a new screen size, which can be used to
	// reposition UI elements or reconfigure camera objects.
	@Override
	public void resize(int width, int height)
	{
		logger.info("resize");
		renderInterrupted = true;
	}

	// This is the save game state when it loses focus, which does not involve
	// the actual gameplay being paused unless the developer wants it to.
	@Override
	public void pause()
	{
		logger.info("pause");
		renderInterrupted = true;
	}
}
