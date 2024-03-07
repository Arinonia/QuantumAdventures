package fr.arinonia.qa.entity;

import java.awt.image.BufferedImage;

public class Entity {

    protected int x;
    protected int y;
    protected int speed;
    protected BufferedImage up1, up2, down1, down2, left1, left2, right1, right2;
    protected String direction;
    private int sprite_counter = 0;
    private int sprite_num = 1;

    public int getX() {
        return this.x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(final int y) {
        this.y = y;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(final int speed) {
        this.speed = speed;
    }

    public BufferedImage getUp1() {
        return this.up1;
    }

    public void setUp1(final BufferedImage up1) {
        this.up1 = up1;
    }

    public BufferedImage getUp2() {
        return this.up2;
    }

    public void setUp2(final BufferedImage up2) {
        this.up2 = up2;
    }

    public BufferedImage getDown1() {
        return this.down1;
    }

    public void setDown1(final BufferedImage down1) {
        this.down1 = down1;
    }

    public BufferedImage getDown2() {
        return this.down2;
    }

    public void setDown2(final BufferedImage down2) {
        this.down2 = down2;
    }

    public BufferedImage getLeft1() {
        return this.left1;
    }

    public void setLeft1(final BufferedImage left1) {
        this.left1 = left1;
    }

    public BufferedImage getLeft2() {
        return this.left2;
    }

    public void setLeft2(final BufferedImage left2) {
        this.left2 = left2;
    }

    public BufferedImage getRight1() {
        return this.right1;
    }

    public void setRight1(final BufferedImage right1) {
        this.right1 = right1;
    }

    public BufferedImage getRight2() {
        return this.right2;
    }

    public void setRight2(final BufferedImage right2) {
        this.right2 = right2;
    }

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(final String direction) {
        this.direction = direction;
    }

    public int getSpriteCounter() {
        return this.sprite_counter;
    }

    public void setSpriteCounter(final int sprite_counter) {
        this.sprite_counter = sprite_counter;
    }

    public int getSpriteNum() {
        return this.sprite_num;
    }

    public void setSpriteNum(final int sprite_num) {
        this.sprite_num = sprite_num;
    }
}
