import java.util.*;
public class sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n=sc.nextInt();
        int sum=0;
        
        for(int i=1;i<=n;i++){
            System.out.println("Enter num "+ (i+1)+ ": ");
            int num=sc.nextInt();
            sum+=num;
            
            

        }
        System.out.println("Sum: "+sum);
        System.out.println("Avg: "+ sum/n);
        sc.close();

    }
}