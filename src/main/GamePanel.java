package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import map.TileManager;

public class GamePanel extends JPanel implements Runnable{
	final int originalTileSize = 16;
	final int scale = 3;
	public final int tileSize = scale* originalTileSize;
	public final int maxScreenCol = 16;
	public final int maxScreenRow = 12;
	final int screenWidth = tileSize* maxScreenCol;
	final int screenHeight = tileSize* maxScreenRow;
	Thread gameThread;
	TileManager tileM = new TileManager(this);
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		tileM.draw(g2);	
		g2.dispose();
	}
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.BLUE);
		this.setDoubleBuffered(true);
//		this.setFocusable(true);
		
	}
	public void startThreadGame() {
		gameThread  = new Thread(this);
		gameThread.start();
	}

	@Override
	public void run() {
		while(gameThread!=null) {
			update();
			repaint();
		}
		
	}

	public  void update() {
		// TODO Auto-generated method stub
		
	}

}
