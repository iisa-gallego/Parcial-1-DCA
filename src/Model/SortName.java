package Model;

import java.util.Comparator;

public class SortName implements Comparator<Doggy> {

	public int compare(Doggy o1, Doggy o2) {
		return o1.getName().compareTo(o2.getName()) ;
	}
}