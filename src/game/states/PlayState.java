package game.states;

import game.util.KeyHandler;
import game.util.MouseHandler;

import java.awt.*;
import java.awt.Graphics2D;

public class PlayState extends GameState {
    

    public PlayState(GameStateManager gsm) {
        super(gsm);
    }

    public void update() {

    }

    public void input( MouseHandler mouse, KeyHandler key ){
        if (key.up.down) {
            System.out.println("Z pressed");
        }
    }

    public void render(Graphics2D g) {
        g.setColor(Color.RED);
        g.fillRect(0, 0, 64, 64);
    }
}
