import java.util.Scanner;
class ShortHand{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int x=sc.nextInt();
        String result=(x>17)? "Can vote":"You are not eligible to vote";
        System.out.println(result);
        sc.close();
    }
}