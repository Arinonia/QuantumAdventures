package fr.arinonia.qa.client;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    private boolean up;
    private boolean down;
    private boolean left;
    private boolean right;

    @Override
    public void keyTyped(final KeyEvent e) {}

    @Override
    public void keyPressed(final KeyEvent e) {
        final int key_code = e.getKeyCode();

        if (key_code == KeyEvent.VK_Z) {
            this.up = true;
        }
        if (key_code == KeyEvent.VK_S) {
            this.down = true;
        }
        if (key_code == KeyEvent.VK_Q) {
            this.left = true;
        }
        if (key_code == KeyEvent.VK_D) {
            this.right = true;
        }
    }

    @Override
    public void keyReleased(final KeyEvent e) {
        final int key_code = e.getKeyCode();
        if (key_code == KeyEvent.VK_Z) {
            this.up = false;
        }
        if (key_code == KeyEvent.VK_S) {
            this.down = false;
        }
        if (key_code == KeyEvent.VK_Q) {
            this.left = false;
        }
        if (key_code == KeyEvent.VK_D) {
            this.right = false;
        }
    }

    public boolean isUp() {
        return this.up;
    }

    public void setUp(final boolean up) {
        this.up = up;
    }

    public boolean isDown() {
        return this.down;
    }

    public void setDown(final boolean down) {
        this.down = down;
    }

    public boolean isLeft() {
        return this.left;
    }

    public void setLeft(final boolean left) {
        this.left = left;
    }

    public boolean isRight() {
        return this.right;
    }

    public void setRight(final boolean right) {
        this.right = right;
    }
}
