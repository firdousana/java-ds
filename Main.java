import java.util.*;
public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the rows and columns ");
       int row=sc.nextInt();
       int col=sc.nextInt();
       int[][] num=new int[row][col];
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.println("Enter the value ");
            num[i][j]=sc.nextInt();
        }
       }
       System.out.println("Original array ");
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(num[i][j]+" ");
        }
        System.out.println();

       }

       System.out.println("The transpose of matrix is ");
       for(int j=0;j<col;j++){
        for(int i=0;i<row;i++){
            System.out.print(num[i][j]+" ");
        }
        System.out.println();
       }
  sc.close();
   }   
}

bnbs