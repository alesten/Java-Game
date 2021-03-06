package com.javagame.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    private Handler handler;

    public KeyInput(Handler handler) {
        this.handler = handler;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        for (GameObject object : handler.objects) {
            if (object.getId() == ID.Player) {
                if (key == KeyEvent.VK_W) {
                    object.setVelY(-5);
                }
                if (key == KeyEvent.VK_S) {
                    object.setVelY(5);
                }
                if (key == KeyEvent.VK_D) {
                    object.setVelX(5);
                }
                if (key == KeyEvent.VK_A) {
                    object.setVelX(-5);
                }
            }
        }
        
        if(key == KeyEvent.VK_ESCAPE) System.exit(0);
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        for (GameObject object : handler.objects) {
            if (object.getId() == ID.Player) {
                if (key == KeyEvent.VK_W) {
                    object.setVelY(0);
                }
                if (key == KeyEvent.VK_S) {
                    object.setVelY(0);
                }
                if (key == KeyEvent.VK_D) {
                    object.setVelX(0);
                }
                if (key == KeyEvent.VK_A) {
                    object.setVelX(0);
                }
            }
        }
    }
}
