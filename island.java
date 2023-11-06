/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class island
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=23;
        int count=0;
        if(n<50){
            while(n<50){
             n=n+2;
             count++;
            }
            if(n>50){
                while(n>50){
             n=n-3;
             count++;
            }
             if(n<50){
            while(n<50){
             n=n+2;
             count++;
            }
        }
            }
           
       }
        System.out.println(count);
        sc.close();
	}
}
