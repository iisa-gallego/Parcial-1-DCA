package Model;

import java.text.SimpleDateFormat;
import java.util.Date;
import processing.core.PApplet;

public class Doggy implements Comparable<Doggy> { // para poder hacer el sort

	private String name, race;
	private Date date;
	private int age, ID;
	private PApplet app;

	public Doggy(int ID, int age, Date date, String name, String race,  PApplet app) {
		this.ID = ID;
		this.age = age;
		this.date = date;
		this.name = name;
		this.race = race;
		this.app = app;
	}

	public void writeDoggy(int x) {
		app.textSize(12);
		app.text("ID: " + ID, x, 100);
		app.text("Name: " + name, x, 120);
		app.text("Race: " + race, x, 140);
		app.text("Age: " + age, x, 160);

		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		String date = format.format(this.date);
		app.text("B: " + date, x, 180);
	}

	public int compareTo(Doggy nextDog) {
		return this.ID - nextDog.getID();
	}
	

	// --------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
