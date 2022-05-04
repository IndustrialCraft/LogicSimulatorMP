package com.github.industrialcraft.logicsimulatormp;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Matrix4;

public class GameCamera implements InputProcessor {
    OrthographicCamera camera;
    public GameCamera() {
        float width = Gdx.graphics.getWidth();
        float aspectRatio = (float) Gdx.graphics.getHeight() / (float)Gdx.graphics.getWidth();
        float height = width * aspectRatio;
        this.camera = new OrthographicCamera(width, height);
    }
    public void input(){
        float speed = 60*Gdx.graphics.getDeltaTime()*(Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT)?3:1);

        if(Gdx.input.isKeyPressed(Input.Keys.A))
            camera.position.x -= speed;
        if(Gdx.input.isKeyPressed(Input.Keys.D))
            camera.position.x += speed;
        if(Gdx.input.isKeyPressed(Input.Keys.W))
            camera.position.y += speed;
        if(Gdx.input.isKeyPressed(Input.Keys.S))
            camera.position.y -= speed;
    }
    public Matrix4 getMatrix(){
        camera.update();
        return camera.combined;
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        camera.zoom = (float) MathUtils.clamp(camera.zoom + amountY*0.1, 0.4, 3);
        return true;
    }
}
