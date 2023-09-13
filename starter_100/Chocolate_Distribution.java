
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
		while(t-->0)
		{
		    int arr[]=new int[3];
		    int n=sc.nextInt();
		    if(n%2 != 0){
		        arr[0]=1;
		        arr[1]=(n-1)/2;
		        arr[2]=(n-1)/2;
		    }
		    
		    if(n%2 ==0){
		        arr[0]=1;
		        arr[1]=1;
		        arr[2]=n-2;
		    }
		    for(int i=0;i<arr.length;i++){
		        System.out.print(arr[i]+" ");
		    }
            System.out.println();
		        
		}
		
	}
}
