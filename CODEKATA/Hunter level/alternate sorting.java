package arrays.java;

import java.util.Scanner;

public class Alternatesorting {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}		
		}
		if(n%2==0)
		{
			for(int j=n-1,i=0;j>=(n/2)&&i<(n/2);j--,i++)
			{
				System.out.print(a[j]+" "+a[i]+" ");
			}
		}
		else
		{
			for(int j=n-1,i=0;j>=(n/2)&&i<(n/2);j--,i++)
			{
				System.out.print(a[j]+" "+a[i]+" ");
			}
			System.out.print(a[(n-1)/2]);
		}
		sc.close();
	}
}
