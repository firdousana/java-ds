import java.util.Scanner;

public class cheffact {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
             int t=sc.nextInt();
             int[] arr=new int[t];
             for(int i=0;i<t;i++){
                arr[i]=sc.nextInt();
             }
             int fact=1;
             for(int i=0;i<arr.length;i++){
                for(int j=1;j<=arr[i];j++){
                    fact=fact*j;
                }
                System.out.println(fact);
                fact=1;

             }
           sc.close();
    }
}
