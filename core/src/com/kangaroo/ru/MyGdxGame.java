package com.kangaroo.ru;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

import javax.xml.crypto.Data;

public class MyGdxGame extends ApplicationAdapter {
	OrthographicCamera camera;
	SpriteBatch batch;

	Vector3 touchPos;

	static float width;
	static float height;

	static float x;
	static float y;

	Vector2 crop;

	@Override
	public void create () {

		camera = new OrthographicCamera();
		camera.setToOrtho(false,  1350, 768);

		width = Gdx.graphics.getWidth();
		height = Gdx.graphics.getHeight();
		crop = new Vector2(0f, 0f);


	}

	@Override
	public void render () {

		batch = new SpriteBatch();

		touchPos = new Vector3();

		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		new Turret();  //Turret.java Расположение всех башен...
		new Body();    //Body.java Разположение всех Корпусов...

		camera.update();
	}
	//распорежение чем-либо...
	@Override
	public void dispose () {

		batch.dispose();
	}

}
