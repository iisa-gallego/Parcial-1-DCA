package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {

	private PApplet app;

	SortAge sortAge;
	SortDate sortDate;
	SortName sortName;
	SortRace sortRace;

	private String[] txt1;
	private String[] txt2;
	private LinkedList<Doggy> dog;

	private String[] saveId, saveName, saveAge, saveRace, saveDate;

	public Logic(PApplet app) {

		this.app = app;
		txt2 = app.loadStrings("txt1.txt");
		txt2 = app.loadStrings("txt2.txt");
		dog = new LinkedList<Doggy>();

		sortAge = new SortAge();
		sortDate = new SortDate();
		sortName = new SortName();
		sortRace = new SortRace();

		saveId = new String[10];
		saveAge = new String[10];
		saveDate = new String[10];
		saveName = new String[10];
		saveRace = new String[10];

		for (int i = 0; i < txt1.length; i++) {

			String[] data1 = txt1[i].split(" ");

			int id = Integer.parseInt(data1[0]);
			String name = data1[1];
			int age = Integer.parseInt(data1[2]);

			for (int j = 0; j < txt2.length; j++) {

				String[] data2 = txt2[j].split(" ");

				if (id == Integer.parseInt(data2[0])) {

					String race = data2[1];
					String dateBorn = data2[2];
					Date date = null;
					try {
						date = new SimpleDateFormat("dd-MM-yyyy").parse(dateBorn);
					} catch (ParseException e) {
						e.printStackTrace();
					}

					dog.add(new Doggy(id, age, date, name, race, app));
				}
			}
		}
	}

	// ------------------------------------------------------------------------
	
	public LinkedList<Doggy> getDoggyList() {
		return null;
	}

	public void sortList(char s) {
		
	}
}