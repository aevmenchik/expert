package speed;

import java.util.HashMap;

import java.util.TreeMap;


public class SpeedMap {
	public static void ListSpeed() {
		HashMap<Integer, Integer> list =  new HashMap<Integer, Integer>();
		TreeMap<Integer, Integer> list2  = new TreeMap<Integer, Integer>();
		
		Long startdate = System.currentTimeMillis();
		
		for (int i = 0; i<=1000000; i++) {			
			list.put(i, i);	
		}
		
		Long executionPeriod = System.currentTimeMillis()-startdate;
		System.out.println("for HashMap Execution period is equal " + executionPeriod);
		
		
		startdate = System.currentTimeMillis();
		
		for (int i = 0; i<=1000000; i++) {
			list2.put(i, i);		
		}
		executionPeriod = System.currentTimeMillis()-startdate;
		System.out.println("for TreeMap Execution period is equal " + executionPeriod);
		
		
		startdate = System.currentTimeMillis();
		list.containsValue(5588);
		
		executionPeriod = System.currentTimeMillis()-startdate;
		System.out.println("for HashMap Search period is equal " + executionPeriod);
		
		startdate = System.currentTimeMillis();
		list2.containsValue(5588);
		executionPeriod = System.currentTimeMillis()-startdate;
		System.out.println("for TreeMap Search period is equal " + executionPeriod);
		
		startdate = System.currentTimeMillis();
		list.remove(90000);
		executionPeriod = System.currentTimeMillis()-startdate;
		System.out.println("for HashMap Remove period is equal " + executionPeriod);
		
		startdate = System.currentTimeMillis();
		list2.remove(90000);
		executionPeriod = System.currentTimeMillis()-startdate;
		System.out.println("for TreeMap Remove period is equal " + executionPeriod);
	}

}
