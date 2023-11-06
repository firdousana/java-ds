import java.util.*;
public class Power {
    public static void powernum(int x,int n){
        int result=1;
        for(int i=1;i<=n;i++){
            
            result=result*x;
           }
        System.out.println(x+" to the power "+n+" is "+result);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x and n ");
        int x=sc.nextInt();
        int n=sc.nextInt();
        powernum(x,n);
        sc.close();


    }
}
