package ba.BITCamp.ajla.HomeworkWeekend3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Task4GUIProgramming {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		
		// **** Draw here ****

		// Main rectangle
		g.setColor(Color.BLACK);
		g.setFont(new Font("Verdana", Font.BOLD, 22));
		int x = 10;
		int y = 10;
		g.drawRect(x, y, 410, 260);
		g.setColor(Color.BLUE);
		g.drawString("java", x + 10, y + 25);
		
		// first rectangle - lang
		g.setColor(Color.BLACK);
		x += 40; 
		y += 50; 
		g.drawRect(x, y, 120, 200);
		g.setColor(Color.BLUE);
		g.drawString("lang", x + 10, y + 25);
		
		g.setColor(Color.BLACK);
		g.drawRect(x + 15, y + 40, 100, 70);
		g.drawRect(x + 15, y + 120, 100, 30);
		g.drawRect(x + 15, y + 160, 100, 30);
		g.drawRect(x + 25, y + 60, 85, 20);
		g.drawRect(x + 25, y + 85, 85, 20);
		
		g.setColor(Color.GREEN);
		g.setFont(new Font("Verdana", Font.BOLD, 12));
		g.drawString("Math", x + 20, y + 55);
		g.drawString("String", x + 20, y + 140);
		g.drawString("Integer", x + 20, y + 180);
		g.setColor(Color.RED);
		g.drawString("sqrt()", x + 50, y + 75);
		g.drawString("random()", x + 37, y + 100);
		

		// second rectangle - awt
		g.setColor(Color.BLACK);
		g.setFont(new Font("Arial", Font.BOLD, 18));
		x += 140; 
		g.drawRect(x, y, 120, 200);
		g.setColor(Color.BLUE);
		g.drawString("awt", x + 10, y + 25);
		
		g.setColor(Color.BLACK);
		g.drawRect(x + 15, y + 40, 100, 70);
		g.drawRect(x + 15, y + 120, 100, 30);
		g.drawRect(x + 15, y + 160, 100, 30);
		g.drawRect(x + 25, y + 60, 85, 20);
		g.drawRect(x + 25, y + 85, 85, 20);
		
		g.setColor(Color.GREEN);
		g.setFont(new Font("Verdana", Font.BOLD, 12));
		g.drawString("Graphics", x + 20, y + 55);
		g.drawString("Color", x + 20, y + 140);
		g.drawString("Font", x + 20, y + 180);
		g.setColor(Color.RED);
		g.drawString("drawRect()", x + 30, y + 75);
		g.drawString("setColor()", x + 33, y + 100);
		
		
		// third rectangle - util
		g.setColor(Color.BLACK);
		g.setFont(new Font("Verdana", Font.BOLD, 22));
		x += 140; 
		g.drawRect(x, y, 80, 200);
		g.setColor(Color.BLUE);
		g.drawString("util", x + 10, y + 25);
		
		// *******************
		w.setImage(img);

	}

}
