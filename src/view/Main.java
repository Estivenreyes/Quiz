package view;

import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
	
	String [] arrayTextFigure;
	
	public void settings() {
		size(800,600);
	}
	
	public void setup() {
		arrayTextFigure = loadStrings("../resources/figure.txt");
		System.out.println(arrayTextFigure[0]);
	}
	
	public void draw() {
		
	}
}
