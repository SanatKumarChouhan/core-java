package in.co.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestent {
	
	public static void main(String[] args) {
		
		ArrayList<Contestent> list = new ArrayList<Contestent>();
		
		list.add(new Contestent("sanat","9179118642"));
		list.add(new Contestent("sameer","8325263766"));
		list.add(new Contestent("riya","7771932262"));
		list.add(new Contestent("shreya","782811952865"));
		list.add(new Contestent("prakhar","3782918074"));
		list.add(new Contestent("abhishek","91791864243"));
		list.add(new Contestent("sagar","7771041580"));
		
		
		list.stream().map(e->e.phone).filter(e->e.length()==10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(),e->{
			Collections.shuffle(e);
			return e.stream();
		})).limit(3).forEach(e-> System.out.println(e));
		
		
		
	}

}
