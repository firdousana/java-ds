import java.util.Scanner;
class Factorial{
    public static void fact(int n){
        
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
        System.out.println("fact is "+fact);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number ");
            int n=sc.nextInt();
           fact(n);
           sc.close();
        }
}


