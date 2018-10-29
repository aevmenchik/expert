import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		int n = 0, m = 0;
		int arr1[][];
		
		int k = 0, l = 0;
		int arr2[][];
		
		int s = 0, t = 0;
		int arr3[][];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of 3 arrays");
		
		if(sc.hasNext()) {
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		l = sc.nextInt();
		s = sc.nextInt();
		t = sc.nextInt();
		}
		
		arr1 = new int[m][n];
		arr2 = new int[k][l];
		arr3 = new int[s][t];
		
		
		for (int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr1[i].length; j++) {
				arr1[i][j] = (int)(Math.random()*10+15);
				
			}
				
		}
		
		System.out.println("First array");
		System.out.println();
		
		for (int i=0; i<arr1.length; i++) {
			for (int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			
			}
			System.out.println();
				
		}
		
		
		for (int i=0; i<arr2.length; i++) {
			for (int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = (int)(Math.random()*10+15);
				
			}		
		}
		System.out.println();
		System.out.println("\n----------------------------");
		System.out.println("Second array");
		System.out.println();
		for (int i=0; i<arr2.length; i++) {
			for (int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
				
			}
			System.out.println();
				
		}
		
		
		for (int i=0; i<arr3.length; i++) {
			for (int j=0; j<arr3[i].length; j++) {
				arr3[i][j] = arr2[i][j]*arr1[i][j];
				
			}
				
		}
		
		System.out.println("Multiplied array");
		System.out.println();
		
		for (int i=0; i<arr3.length; i++) {
			for (int j=0; j<arr3[i].length; j++) {
				System.out.print(arr3[i][j] + "\t");
				
			}
			System.out.println();
				
		}
		

	}

}
