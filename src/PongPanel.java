import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

/**
 * Created on 11/17/2016, 2:13 PM
 *
 * @author Noah Morton
 *         Tully 7th period
 *         Part of project Pong
 */

public class PongPanel extends JPanel implements KeyListener, Runnable {
    private BufferedImage buffer;
    private PongGame game;

    public PongPanel() {
        setSize(600, 500);
        reset();
        addKeyListener(this);
        Thread thread = new Thread(this);
        thread.start();
        buffer = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_4BYTE_ABGR);
        Logger.logCodeMessage("Created panel, size is 600x500.");
    }

    private void update() {
        game.update();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'n')
            reset();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //todo should set "up" boolean to true
        switch (e.getKeyChar()) {
            case 'w':
                //move left paddle up
                break;
            case 's':
                //move left paddle down
                break;
            case 'i':
                //move right paddle up
                break;
            case 'k':
                //move right paddle down
                break;

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //todo should set "up" boolean to false
        switch (e.getKeyChar()) {
            case 'w':
                //move left paddle up
                break;
            case 's':
                //move left paddle down
                break;
            case 'i':
                //move right paddle up
                break;
            case 'k':
                //move right paddle down
                break;

        }
    }

    @Override
    public void run() {
        //noinspection InfiniteLoopStatement
        while (true) {
            update();
            repaint();
            try {
                Thread.sleep(35);
            } catch (Exception e) {
                System.err.println("Error Sleeping.");
                Logger.logErrorMessage("Error Sleeping Thread.");
            }
        }
    }

    public void paint(Graphics g) {
        Graphics bg = buffer.getGraphics();
        //static graphics ------------------
        //background
        bg.setColor(Color.black);
        bg.fillRect(0, 0, getWidth(), getHeight());
        //divider line
        bg.setColor(Color.white);
        for (int i = 0; i < getHeight(); i += 40) {
            bg.fillRect(getWidth() / 2, i, 10, 30);
        }
        //top/bottom walls
        bg.fillRect(0, 0, getWidth(), 20);
        bg.fillRect(0, getHeight() - 20, getWidth(), 20);


        g.drawImage(buffer, 0, 0, null);
    }

    public void addNotify() {
        super.addNotify();
        requestFocus();
    }

    void reset() {
        game = new PongGame();
    }
}