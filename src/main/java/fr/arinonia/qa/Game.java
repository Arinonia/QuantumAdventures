package fr.arinonia.qa;

import fr.arinonia.qa.client.KeyHandler;
import fr.arinonia.qa.ui.GameFrame;
import fr.arinonia.qa.ui.GamePanel;

public class Game implements Runnable {

    private GameFrame game_frame;
    private GamePanel game_panel;
    private Thread game_thread;
    private final KeyHandler key_handler = new KeyHandler();
    private final int fps = 60;

    private int playerX = 100;
    private int playerY = 100;
    private int playerSpeed = 4;

    @Override
    public void run() {
        double draw_interval = 1_000_000_000 / (float)this.fps;
        double delta = 0;
        long last_time = System.nanoTime();
        long current_time;
        long timer = 0;
        int draw_count = 0;

        while (this.game_thread != null) {
            current_time = System.nanoTime();
            delta += (current_time - last_time) / draw_interval;
            timer += (current_time - last_time);
            last_time = current_time;
            if (delta >= 1) {
                update();
                game_panel.repaint();
                delta--;
                draw_count++;
            }
            if (timer >= 1_000_000_000) {
                System.out.println("FPS: " + draw_count);
                draw_count = 0;
                timer = 0;
            }
        }
    }

    public void update() {
        if (this.key_handler.isUp()) {
            playerY -= playerSpeed;
        }
        if (this.key_handler.isDown()) {
            playerY += playerSpeed;
        }
        if (this.key_handler.isLeft()) {
            playerX -= playerSpeed;
        }
        if (this.key_handler.isRight()) {
            playerX += playerSpeed;
        }
    }
    public void start() {
        this.game_frame = new GameFrame();
        this.game_panel = new GamePanel(this);
        this.game_panel.addKeyListener(this.key_handler);
        this.game_frame.add(this.game_panel);
        this.game_frame.pack();
        this.game_frame.setLocationRelativeTo(null);
        this.game_frame.setVisible(true);
        startGameThread();
    }

    public void startGameThread() {
        this.game_thread = new Thread(this);
        this.game_thread.start();
    }

    public int getPlayerX() {
        return this.playerX;
    }

    public int getPlayerY() {
        return this.playerY;
    }
}
