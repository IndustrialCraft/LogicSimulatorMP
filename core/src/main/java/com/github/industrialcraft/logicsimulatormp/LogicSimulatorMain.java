package com.github.industrialcraft.logicsimulatormp;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class LogicSimulatorMain extends ApplicationAdapter {
	private ShapeRenderer renderer;
	private ClientConnection clientConnection;
	private Board board;
	private GameCamera camera;
	private SpriteBatch batch;
	@Override
	public void create() {
		board = new Board();
		renderer = new ShapeRenderer();
		batch = new SpriteBatch();
		clientConnection = new ClientConnection(board);
		camera = new GameCamera();
		Gdx.input.setInputProcessor(camera);
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(207/255f, 225/255f, 255/255f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		camera.input();
		clientConnection.readAll();
		renderer.setAutoShapeType(true);
		renderer.setProjectionMatrix(camera.getMatrix());
		renderer.begin();
		board.render(renderer);
		renderer.end();
		batch.setProjectionMatrix(camera.getMatrix());
		batch.begin();
		board.renderText(batch);
		batch.end();
	}

	@Override
	public void dispose() {
		batch.dispose();
		clientConnection.dispose();
	}
}