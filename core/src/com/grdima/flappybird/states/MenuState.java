package com.grdima.flappybird.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.grdima.flappybird.FlappyBird;

/**
 * Created by Dmitry Herutskyi on 14.05.17.
 */

public class MenuState extends State {

    private Texture background;
    private Texture playButton;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playButton = new Texture("playbtn.png");
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0, FlappyBird.WIDTH, FlappyBird.HEIGTH);
        sb.draw(playButton, (FlappyBird.WIDTH / 2 - playButton.getWidth() / 2), FlappyBird.HEIGTH / 2);
        sb.end();
    }

    @Override
    public void dispouse() {
        background.dispose();
        playButton.dispose();
    }
}
