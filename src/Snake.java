package Game2;

import  javax.swing.*;


public class Snake {
    public static void main(String[] args)
    {
        int boardWidth = 600;
        int boardHeight = boardWidth;
        JFrame frame = new JFrame("SNAKE");
        frame.setVisible(true);
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SnakeGame snakeGame = new SnakeGame(boardHeight,boardWidth);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();

    }

}
