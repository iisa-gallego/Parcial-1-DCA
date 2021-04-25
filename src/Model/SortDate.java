package Model;

import java.util.Comparator;

public class SortDate implements Comparator<Doggy> {

	public int compare(Doggy o1, Doggy o2) {
		return o1.getDate().compareTo(o2.getDate()) ;
	}
}
