/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		int count=0;
		
		for(int x=1;x<=t;x++){
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		    if(arr[i]>=1000){
		        count++;
		    }
		}
		System.out.println(count);
		count=0;
		
		}
		sc.close();
	}
}

