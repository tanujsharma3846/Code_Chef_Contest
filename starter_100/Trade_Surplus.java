
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int a1=sc.nextInt();
		    int a2=sc.nextInt();
		    int b1=sc.nextInt();
		    int b2=sc.nextInt();
		    int a_total=a1-a2;
		    int b_total=b1-b2;
		    int total=a_total+b_total;
		    if(total<0){
		        System.out.println("YES");
		    }
		    else{
		         System.out.println("NO");
		    }
		}
	}
}
