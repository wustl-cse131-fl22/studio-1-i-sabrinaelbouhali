package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The first of two integrers averaged?");
		int n1= in.nextInt();
		System.out.println( "The second of two integers averaged?");
		int n2= in.nextInt();
		double totalInteger = n1 + n2;
		double average = totalInteger/2;
		System.out.println( "The average of your integers is " + average);

	}

}
