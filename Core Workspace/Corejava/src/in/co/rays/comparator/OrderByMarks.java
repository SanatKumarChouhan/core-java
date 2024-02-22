package in.co.rays.comparator;

import java.util.Comparator;

public class OrderByMarks implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		// TODO Auto-generated method stub
		return m1.marks-m2.marks;
	}

}
