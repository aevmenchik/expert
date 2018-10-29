package speed;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class SpeedList {
	public static void ListSpeed() {
		ArrayList<Integer> list =  new ArrayList<Integer>();
		LinkedList<Integer> list2  = new LinkedList<Integer>();
		
		Long startdate = System.currentTimeMillis();
		
		for (int i = 0; i<=1000000; i++) {
			list.add(i);
			
		}
		Long executionPeriod = System.currentTimeMillis()-startdate;
		System.out.println("for ArrayList Execution period is equal " + executionPeriod);

		startdate = System.currentTimeMillis();
		
		for (int i = 0; i<=1000000; i++) {
			list2.add(i);
			
		}
		executionPeriod = System.currentTimeMillis()-startdate;
		System.out.println("for LinkedList Execution period is equal " + executionPeriod);
		
		
		startdate = System.currentTimeMillis();
		list.indexOf(5688);
		executionPeriod = System.currentTimeMillis()-startdate;
		System.out.println("for ArrayList Search period is equal " + executionPeriod);
		
		startdate = System.currentTimeMillis();
		list2.indexOf(5688);
		executionPeriod = System.currentTimeMillis()-startdate;
		System.out.println("for LinkedList Search period is equal " + executionPeriod);
		
		startdate = System.currentTimeMillis();
		list.remove(90000);
		executionPeriod = System.currentTimeMillis()-startdate;
		System.out.println("for ArrayList Remove period is equal " + executionPeriod);
		
		startdate = System.currentTimeMillis();
		list2.remove(90000);
		executionPeriod = System.currentTimeMillis()-startdate;
		System.out.println("for LinkedList Remove period is equal " + executionPeriod);
	}
		
}
	


