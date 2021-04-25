package View;

import Controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {
	private Controller control;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	public void settings() {
		size(1500, 600);
	}

	public void setup() {
		control = new Controller();
	}

	public void draw() {
		
		background(198, 176, 223 );
       drawText();
	
} 
public void drawText() {
		
		textSize(18);
		text("Fundación Peludos sin hogar", 590, 50);
		
		
}
}
