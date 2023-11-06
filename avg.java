import java.util.*;
public class avg {
    public static void avgNo(int a, int b, int c){
        int result=(a+b+c)/3;
        System.out.println("Avg is "+result);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a b c ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        avgNo(a,b,c);
        sc.close();
    }
}
