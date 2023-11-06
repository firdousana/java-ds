/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class songs
{
    public static void func(int m,int s,int count){
       
        if(m-s>0||m-s==0){
            func(m-s,s,count++);
        }
        if(m-s<0){
            System.out.println(count);
        }
        
      
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		/*while(t-->0){
		    int m=sc.nextInt();
		    int s=sc.nextInt();
		    int count=0;
            func(m,s,0);
            
		   }*/
           for(int i=0;i<t;i++){
            int m=sc.nextInt();
		    int s=sc.nextInt();
		    int count=0;
            func(m,s,0);
            System.out.println(count);
   }
   sc.close();
	}
}
