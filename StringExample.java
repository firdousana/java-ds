/*public class StringExample {
   public static void main(String args[]) {
       String str = "123";
       int number = Integer.parseInt(str);
       System.out.println(number);
      
      
   }
} 

public class StringExample{
    public static void main(String args[]){
        //int to str
        int num=123;
        String str=Integer.toString(num);
        System.out.println(str.length());
       

    }
}  

import java.util.*;

public class StringExample {
   public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     String str = sc.next();
     String result = "";


     for(int i=0; i<str.length(); i++) {
       if(str.charAt(i) == 'e') {
         result += 'i';
       } else {
         result += str.charAt(i);
       }
     }
     

     System.out.println(result);
   }
}  
 
import java.util.Scanner;
public class StringExample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the email : ");
        String email=sc.nextLine();
        String username="";
        for(int i=0;i<=email.length();i++){
             if(email.charAt(i)== '@'){
                break;


             }else{
                username+=email.charAt(i);
                         }

        }
        System.out.println(username);
      

    }
} 

import java.util.Scanner;
public class StringExample{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the n in decimal: ");
        int n = sc.nextInt();
        System.out.println("Enter the position to toggle/update ");
        int pos = sc.nextInt();
        System.out.println("Enter the operation ");
        int oper=sc.nextInt();
        int bitmask= 1<<pos;
        if(oper==1){
            //setbit
            int setresult=(bitmask | n);
            System.out.println(setresult);

        }else{
            int clearresult = (~(bitmask) & n);
            System.out.println(clearresult);
        }

    }
} /* 
import java.util.Scanner;
 class StringExample
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();
        int bitmask=1<<pos;
        int newnumber=bitmask ^ n;
        System.out.println(newnumber);
    }
} 
import java.util.Scanner;
public class StringExample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary number ");
        int n=sc.nextInt();
        String str=Integer.toString(n);
        int res=str.length()+1;
        System.out.println("No of bits "+res);
    
    }
} */




