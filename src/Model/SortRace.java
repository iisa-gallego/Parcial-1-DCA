package Model;

import java.util.Comparator;

public class SortRace implements Comparator<Doggy> {

	public int compare(Doggy o1, Doggy o2) {
		return o1.getRace().compareTo(o2.getRace()) ;
	}
}
