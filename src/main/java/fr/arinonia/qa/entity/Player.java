package fr.arinonia.qa.entity;

import fr.arinonia.qa.Game;
import fr.arinonia.qa.utils.Direction;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Player extends Entity {

    private final Game game;

    public Player(final Game game) {
        this.game = game;
        this.setX(10);
        this.setY(100);
        this.setSpeed(4);
        this.direction = Direction.DOWN;
        this.getPlayerImages();
    }

    public void getPlayerImages() {
        try {
            this.up1 = ImageIO.read(Game.class.getResourceAsStream("/images/player/boy_up_1.png"));
            this.up2 = ImageIO.read(Game.class.getResourceAsStream("/images/player/boy_up_2.png"));
            this.down1 = ImageIO.read(Game.class.getResourceAsStream("/images/player/boy_down_1.png"));
            this.down2 = ImageIO.read(Game.class.getResourceAsStream("/images/player/boy_down_2.png"));
            this.left1 = ImageIO.read(Game.class.getResourceAsStream("/images/player/boy_left_1.png"));
            this.left2 = ImageIO.read(Game.class.getResourceAsStream("/images/player/boy_left_2.png"));
            this.right1 = ImageIO.read(Game.class.getResourceAsStream("/images/player/boy_right_1.png"));
            this.right2 = ImageIO.read(Game.class.getResourceAsStream("/images/player/boy_right_1.png"));

        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    public void update() {
        if (this.game.getKey_handler().isUp()) {
            this.direction = Direction.UP;
            this.setY(this.getY() - this.getSpeed());
        }
        if (this.game.getKey_handler().isDown()) {
            this.direction = Direction.DOWN;
            this.setY(this.getY() + this.getSpeed());
        }
        if (this.game.getKey_handler().isLeft()) {
            this.direction = Direction.LEFT;
            this.setX(this.getX() - this.getSpeed());
        }
        if (this.game.getKey_handler().isRight()) {
            this.direction = Direction.RIGHT;
            this.setX(this.getX() + this.getSpeed());
        }
        this.setSpriteCounter(this.getSpriteCounter() + 1);

        if (this.getSpriteCounter() > 10) {
            if (this.getSpriteNum() == 1) {
                this.setSpriteNum(2);
            } else if (this.getSpriteNum() == 2) {
                this.setSpriteNum(1);
            }
            this.setSpriteCounter(0);
        }
    }

    public void draw(final Graphics2D g2) {
        BufferedImage image = null;
        switch (this.direction) {
            case UP:
                if (this.getSpriteNum() == 1) {
                    image = this.up1;
                } else if (this.getSpriteNum() == 2) {
                    image = this.up2;
                }
                break;
            case DOWN:
                if (this.getSpriteNum() == 1) {
                    image = this.down1;
                } else if (this.getSpriteNum() == 2) {
                    image = this.down2;
                }
                break;
            case LEFT:
                if (this.getSpriteNum() == 1) {
                    image = this.left1;
                } else if (this.getSpriteNum() == 2) {
                    image = this.left2;
                }
                break;
            case RIGHT:
                if (this.getSpriteNum() == 1) {
                    image = this.right1;
                } else if (this.getSpriteNum() == 2) {
                    image = this.right2;
                }
                break;
        }
        g2.drawImage(image, this.x, this.y, this.game.getGamePanel().getTileSize(),
                this.game.getGamePanel().getTileSize(), null);
    }
}
