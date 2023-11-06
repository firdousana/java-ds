
/*import java.util.*;
import java.lang.*;
import java.io.*;




class passingmarks
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int[] marks=new int[n];
		    for(int i=0;i<n;i++){
		        marks[i]=sc.nextInt();
		        
		    }
		    Arrays.sort(marks);
		        if(n==x){
		            System.out.println("0");
		        }else if(x==1){
		            System.out.println(marks[n-1]-1);
		        }else if(n-x==1){
		            System.out.println(marks[1]-1);
		        }
		    
		}
	}
}
 


import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int[] marks=new int[n];
		    for(int i=0;i<n;i++){
		        marks[i]=sc.nextInt();
		        
		    }
		    Arrays.sort(marks);
		        if(n==x){
		            System.out.println("0");
		        }else {
		            System.out.println(marks[n-x]-1);
               }
		}
	}
}
*/
import java.util.Arrays;

class passingmarks {
	public static void main(String args[])
	{
		int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
		System.out.println("The original array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		Arrays.sort(arr);
		System.out.println("\nThe sorted array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}

