package sample;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int x=sc.nextInt();
		int y=0;
		y=(a*x)+b;
		System.out.print(y);
		sc.close();
	}
}
