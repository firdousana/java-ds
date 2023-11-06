/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class dolls
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int count=0;
		    String str=sc.next();
		    for(int i=0;i<=3;i++){
		        if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='u'&&str.charAt(i)!='i'&&str.charAt(i)!='o'){
		            count++;
		       }
		       
		    }
		    if(count!='4'){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");;
		    }
		}
	}
}
