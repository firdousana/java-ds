import java.util.*;
public class SumOdd {
    public static void sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
           }
        }
        System.out.println("Sum of odd numbers from 1 to  "+n+" is "+sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n ");
        int n=sc.nextInt();
        sum(n);
        sc.close();

    }
    
}
