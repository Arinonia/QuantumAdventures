package fr.arinonia.qa.ui;

import fr.arinonia.qa.Game;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private final int original_tile_size = 16;
    private final int scale = 3;
    private final int tile_size = original_tile_size * scale;
    private final int max_screen_col = 16;
    private final int max_screen_row = 12;
    private final int screen_width = tile_size * max_screen_col;
    private final int screen_height = tile_size * max_screen_row;

    private final Game game;

    public GamePanel(final Game game) {
        this.game = game;
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(this.screen_width, this.screen_height));
        this.setDoubleBuffered(true);
        this.setFocusable(true);
    }


    @Override
    public void paintComponent(final Graphics g) {
        super.paintComponent(g);
        final Graphics2D g2 = (Graphics2D) g;
        this.game.getPlayer().draw(g2);
        g2.dispose();
    }

    public int getTileSize() {
        return this.tile_size;
    }
}
