package com.javagame.main; 

import java.awt.Color;
import java.awt.Graphics;

public class BasicEnemy extends GameObject { 

    public BasicEnemy(int x, int y, ID id) {
        super(x, y, id);
        
        velX = 5;
        velY = 5;
    }

    @Override
    public void tick() {
        y += velY;
        x += velX;
        
        if(y <= 0 || y >= Game.HEIGHT - 64) velY *= -1;
        if(x <= 0 || x >= Game.WIDTH - 32) velX *= -1;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, 16, 16);
    }

}