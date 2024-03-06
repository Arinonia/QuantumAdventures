package fr.arinonia.qa.entity;

import fr.arinonia.qa.Game;

import java.awt.*;

public class Player extends Entity {

    private final Game game;

    public Player(final Game game) {
        this.game = game;
        this.setX(10);
        this.setY(100);
        this.setSpeed(4);
    }

    public void update() {
        if (this.game.getKey_handler().isUp()) {
            this.setY(this.getY() - this.getSpeed());
        }
        if (this.game.getKey_handler().isDown()) {
            this.setY(this.getY() + this.getSpeed());
        }
        if (this.game.getKey_handler().isLeft()) {
            this.setX(this.getX() - this.getSpeed());
        }
        if (this.game.getKey_handler().isRight()) {
            this.setX(this.getX() + this.getSpeed());
        }
    }

    public void draw(final Graphics2D g2) {
        g2.setColor(Color.WHITE);
            g2.fillRect(this.getX(), this.getY(), this.game.getGamePanel().getTileSize(),
                    this.game.getGamePanel().getTileSize());
    }
}
