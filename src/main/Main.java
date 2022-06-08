package main;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame windown = new JFrame();
		windown.setResizable(false);
		windown.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windown.setTitle("RPG Game");
		GamePanel gamePanel = new GamePanel();
		windown.add(gamePanel);
		windown.pack();
		windown.setLocationRelativeTo(null);
		windown.setVisible(true);
		gamePanel.startThreadGame();
	}
}
