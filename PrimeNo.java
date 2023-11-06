import java.util.Scanner;
class PrimeNo{
    public static void main(String args[]){
        int c=0;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check if it is Prime or not");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                
                c++;

            }
        }
        if(c>2){//coz the number comes under 1 and itself
            System.out.println("Not a prime");
        }else{
            System.out.println("Prime");
        }


sc.close();
    }
}