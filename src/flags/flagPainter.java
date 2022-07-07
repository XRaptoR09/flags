package flags;

import java.awt.*;
import java.awt.event.*; //or: import java.awt.event.WindowAdapter;&import java.awt.event.WindowEvent;

public class flagPainter extends Frame { //Розширяє або наслідує клас Frame

  //			 subclass			 superclass
  public static void main(String[] args) {
	flagPainter autoFirst = new flagPainter("flagPainter");
	autoFirst.setSize(500, 300);
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

	//!Vertical flag
	int xStart = 50, yStart = 100;
	int flagstockWidth = 5, flagstockHeight = 150;
	int flagWidth = 120, flagHeight = 77;
	int amountOfColors = 3;

	//*Counting variables
	int flagXStart = (xStart + flagstockWidth), flagYStart =(yStart + flagstockHeight);
	int colorWidth = (flagWidth / amountOfColors);
	if (flagWidth % amountOfColors != 0) {
		flagWidth = flagWidth + (amountOfColors - (flagWidth % amountOfColors));
	}
	colorWidth = (flagWidth / amountOfColors);

	g.setColor(Color.black);
	g.fillRect(flagXStart, yStart, colorWidth, flagHeight);
	g.setColor(Color.yellow);
	g.fillRect(flagXStart + colorWidth, yStart, colorWidth, flagHeight);
	g.setColor(Color.red);
	g.fillRect(flagXStart + (colorWidth * 2), yStart, colorWidth, flagHeight);
	g.setColor(Color.lightGray);
	g.fillRect(xStart, yStart, flagstockWidth, flagstockHeight);
	g.setColor(Color.black);
	g.drawRect(xStart, yStart, flagstockWidth, flagstockHeight);
	g.drawRect(flagXStart, yStart, flagWidth, flagHeight);
  }
}
