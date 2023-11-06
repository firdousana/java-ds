import java.util.*;
public class Greatest {
    public static void Great(int a, int b){
        if(a>b){
            System.out.println(a+" is greatest");
        }else{
            System.out.println(b+" is greatest");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Great(a,b);
        sc.close();

    }
    
}
