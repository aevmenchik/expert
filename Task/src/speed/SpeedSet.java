package speed;

import java.util.HashSet;
import java.util.TreeSet;

public class SpeedSet {
	public static void ListSpeed() {
		HashSet<Integer> list =  new HashSet<Integer>();
		TreeSet<Integer> list2  = new TreeSet<Integer>();
		
		Long startdate = System.currentTimeMillis();
		
		for (int i = 0; i<=1000000; i++) {
			list.add(i);
			
		}
		Long executionPeriod = System.currentTimeMillis()-startdate;
		System.out.println("for HashSet Execution period is equal " + executionPeriod);

		startdate = System.currentTimeMillis();
		
		for (int i = 0; i<=1000000; i++) {
			list2.add(i);
			
		}
		executionPeriod = System.currentTimeMillis()-startdate;
		System.out.println("for TreeSet Execution period is equal " + executionPeriod);
		
		
		startdate = System.currentTimeMillis();
		list.contains(5688);
		executionPeriod = System.currentTimeMillis()-startdate;
		System.out.println("for HashSet Search period is equal " + executionPeriod);
		
		startdate = System.currentTimeMillis();
		list2.contains(5688);
		executionPeriod = System.currentTimeMillis()-startdate;
		System.out.println("for TreeSet Search period is equal " + executionPeriod);
		
		startdate = System.currentTimeMillis();
		list.remove(90000);
		executionPeriod = System.currentTimeMillis()-startdate;
		System.out.println("for HashSet Remove period is equal " + executionPeriod);
		
		startdate = System.currentTimeMillis();
		list2.remove(90000);
		executionPeriod = System.currentTimeMillis()-startdate;
		System.out.println("for TreeSet Remove period is equal " + executionPeriod);
	}
		
}
