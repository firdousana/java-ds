import java.util.Scanner;
public class ProblemGcd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers to calculate gcd ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int g=0;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                g=i;

            }

        }
        System.out.println("GCD : "+g);
sc.close();
    }
    
}
