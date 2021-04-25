package Model;

import java.util.Comparator;

public class SortAge implements Comparator<Doggy> {
	public int compare(Doggy o1, Doggy o2) {
		return o1.getAge() - o2.getAge();
	}
}
