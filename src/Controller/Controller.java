package Controller;

import java.util.LinkedList;
import Model.Doggy;
import Model.Logic;
import processing.core.PApplet;

public class Controller {
	public class Control {
		private Logic logic;
		private PApplet app;

		public Control(PApplet app) {
			this.app = app;
			logic = new Logic(app);
		}

		public void sortList(char s) {
			logic.sortList(s);
		}

		public LinkedList<Doggy> getDoggyList() {
			return logic.getDoggyList();
		}
	}
}
