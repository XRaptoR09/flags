package flags;

import java.awt.*;
import java.awt.event.*; //or: import java.awt.event.WindowAdapter;&import java.awt.event.WindowEvent;

import javax.swing.plaf.FontUIResource;

public class flagPainter extends Frame { //Розширяє або наслідує клас Frame

  //			 subclass			 superclass
	public static void main(String[] args) {
	flagPainter autoFirst = new flagPainter("flagPainter");
	autoFirst.setSize(1300, 300);
	autoFirst.setVisible(true);
	}

	flagPainter(String title) {
		super(title);
		addWindowListener(
			new WindowAdapter() {

				public void windowClosing(WindowEvent ev) {
					System.exit(0);
				}
			}
		);
	}

	public void paint(Graphics g) {
		//!Horizontal flag
		// int xStart = 50, yStart = 100;
		// int flagstockWidth = 5, flagstockHeight = 150;
		// int flagWidth = 120, flagHeight = 77;
		// int amountOfColors = 2;

		// //*Counting variables
		// int flagXStart = (xStart + flagstockWidth);
		// int colorHeight = (flagHeight / amountOfColors);
		// if (flagHeight % amountOfColors != 0) {
		// 	flagHeight = flagHeight + (amountOfColors - (flagHeight % amountOfColors));
		// }
		// colorHeight = (flagHeight / amountOfColors);

		// g.setColor(Color.white);
		// g.fillRect(flagXStart, yStart, flagWidth, colorHeight);
		// g.setColor(Color.red);
		// g.fillRect(flagXStart, yStart + colorHeight, flagWidth, colorHeight);
		// g.setColor(Color.lightGray);
		// g.fillRect(xStart, yStart, flagstockWidth, flagstockHeight);
		// g.setColor(Color.black);
		// g.drawRect(xStart, yStart, flagstockWidth, flagstockHeight);
		// g.drawRect(flagXStart, yStart, flagWidth, flagHeight);

		// //!Vertical flag
		// int xStart = 50, yStart = 100;
		// int flagstockWidth = 5, flagstockHeight = 150;
		// int flagWidth = 120, flagHeight = 77;
		// int amountOfColors = 3;
		// int letterHeight = 30;
		// String title = "Belgium";
		// //*Counting variables
		// int flagXStart = (xStart + flagstockWidth);
		// int colorWidth = (flagWidth / amountOfColors);
		// if (flagWidth % amountOfColors != 0) {
		// 	flagWidth = flagWidth + (amountOfColors - (flagWidth % amountOfColors));
		// }
		// colorWidth = (flagWidth / amountOfColors);
		// int letterX = xStart + (flagstockWidth * 3),
		// letterY = yStart + (flagHeight + (flagHeight / 2));

		// g.setColor(Color.black);
		// g.fillRect(flagXStart, yStart, colorWidth, flagHeight);
		// g.setColor(Color.yellow);
		// g.fillRect(flagXStart + colorWidth, yStart, colorWidth, flagHeight);
		// g.setColor(Color.red);
		// g.fillRect(flagXStart + (colorWidth * 2), yStart, colorWidth, flagHeight);
		// g.setColor(Color.lightGray);
		// g.fillRect(xStart, yStart, flagstockWidth, flagstockHeight);
		// g.setColor(Color.black);
		// g.drawRect(xStart, yStart, flagstockWidth, flagstockHeight);
		// g.drawRect(flagXStart, yStart, flagWidth, flagHeight);
		// g.setFont(new Font("Arial", Font.BOLD, letterHeight));
		// g.drawString(title, letterX, letterY);

		//!Denmark
		// int xStart = 50, yStart = 100;
		// int flagstockWidth = 5, flagstockHeight = 150;
		// int flagWidth = 120, flagHeight = 77;
		// int lineWidth = 10;
		// int letterHeight = 30;
		// String title = "Denmark";
		// //*Counting variables
		// int flagXStart = (xStart + flagstockWidth);
		// int letterX = xStart + (flagstockWidth * 3),
		// letterY = yStart + (flagHeight + (flagHeight / 2));
		// int smallRectWidth = (flagWidth / 3);
		// if (flagWidth % 3 != 0) {
		// 	flagWidth = flagWidth + (3 - (flagWidth % 3));
		// }
		// smallRectWidth = (flagWidth / 3);
		// int horizontalLineY = ((yStart + (flagHeight / 2)) - (lineWidth / 2));
		// if (flagHeight % 2 != 0) {
		// 	flagHeight = flagHeight + (2 - (flagHeight % 2));
		// }
		// if (lineWidth % 2 != 0) {
		// 	lineWidth = lineWidth + 1;
		// }
		// horizontalLineY = ((yStart + (flagHeight / 2)) - (lineWidth / 2));

		// g.setColor(Color.red);
		// g.fillRect(flagXStart, yStart, flagWidth, flagHeight);
		// g.setColor(Color.white);
		// g.fillRect(flagXStart + smallRectWidth, yStart, lineWidth, flagHeight);
		// g.fillRect(flagXStart, horizontalLineY, flagWidth, lineWidth);
		// g.setColor(Color.lightGray);
		// g.fillRect(xStart, yStart, flagstockWidth, flagstockHeight);
		// g.setColor(Color.black);
		// g.drawRect(xStart, yStart, flagstockWidth, flagstockHeight);
		// g.drawRect(flagXStart, yStart, flagWidth, flagHeight);
		// g.setFont(new Font("Arial", Font.BOLD, letterHeight));
		// g.drawString(title, letterX, letterY);

		//!Flags with loops
		int xStart = 50, yStart = 100;
		int flagstockWidth = 5, flagstockHeight = 150;
		int flagWidth = 120, flagHeight = 77;
		int amountOfColors = 3;
		int xShift = 50;
		int letterHeight = 30;
		String[] countryNames = {"Germany", "Armeny", "Bulgaria", "austria", "holland"};	
		//colors from top to low
		Color[] color = {
			Color.black, Color.red, Color.yellow,
			Color.red, Color.blue, Color.orange, 
			Color.white, Color.green, Color.red,
			Color.red, Color.white, Color.red,
			Color.red, Color.white, Color.blue,
		};			
		//*Counting variables
		int flagXStart = (xStart + flagstockWidth);
		int colorHeight = (flagHeight / amountOfColors);
		if (flagHeight % amountOfColors != 0) {
			flagHeight = flagHeight + (amountOfColors - (flagHeight % amountOfColors));
		}
		colorHeight = (flagHeight / amountOfColors);
		int allWidth = flagstockWidth + flagWidth;
		xShift = allWidth + xShift;
		int letterX = xStart + (flagstockWidth * 3),
		letterY = yStart + (flagHeight + (flagHeight / 2));
		int colorCount = 0;

		//*Project*/
		if (color.length % countryNames.length != 0) {
			g.setColor(Color.red);
			g.setFont(new Font("Arial", Font.BOLD, letterHeight));
			g.drawString("Mistake in your code!!!".toUpperCase(), xStart, yStart);
		}else{
			for (int j = 0; j < countryNames.length; j++) {
				for (int i = 0; i < amountOfColors; i++) {
					g.setColor(color[colorCount]);
					g.fillRect(flagXStart, yStart + (colorHeight *i), flagWidth, colorHeight);
					colorCount++;
				}
				g.setColor(Color.lightGray);
				g.fillRect(xStart, yStart, flagstockWidth, flagstockHeight);
				g.setColor(Color.black);
				g.drawRect(xStart, yStart, flagstockWidth, flagstockHeight);
				g.drawRect(flagXStart, yStart, flagWidth, flagHeight);
				g.setFont(new Font("Arial", Font.BOLD, letterHeight));
				g.drawString(countryNames[j].toUpperCase(), letterX, letterY);
				xStart = xStart + xShift;
				flagXStart = flagXStart + xShift;
				letterX = letterX + xShift;
			}
		}
	}
}
