/*import java.util.Scanner;

public class Spiral {
     public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();


      int matrix[][] = new int[n][m];
      for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               matrix[i][j] = sc.nextInt();
           }
      }


      System.out.println("The Spiral Order Matrix is : ");
      int rowStart = 0;
      int rowEnd = n-1;
      int colStart = 0;
      int colEnd = m-1;


      //To print spiral order matrix
      while(rowStart <= rowEnd && colStart <= colEnd) {
          //1
          for(int col=colStart; col<=colEnd; col++) {
              System.out.print(matrix[rowStart][col] + " ");
          }
          rowStart++;


          //2
          for(int row=rowStart; row<=rowEnd; row++) {
              System.out.print(matrix[row][colEnd] +" ");
          }
          colEnd--;


          //3
          for(int col=colEnd; col>=colStart; col--) {
              System.out.print(matrix[rowEnd][col] + " ");
          }
          rowEnd--;


          //4
          for(int row=rowEnd; row>=rowStart; row--) {
              System.out.print(matrix[row][colStart] + " ");
          }
          colStart++;


          System.out.println();
      }
      sc.close();
   }
}*/

import java.util.Scanner;
public class Spiral{
    public static void main(String args[]){
        System.out.println("Enter the row and col ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
         }
         int rowstart=0;
         int rowend=n-1;
         int colstart=0;
         int colend=m-1;
         System.out.println("Spiral matrix is ");
         
         while(rowstart<=rowend&&colstart<=colend){
              for(int i=colstart;i<=colend;i++){
              System.out.print(arr[rowstart][i]+" ");
         }
         rowstart++;

         for(int i=rowstart;i<=rowend;i++){
            System.out.print(arr[i][colend]+" ");
         }
         colend--;

         for(int i=colend;i>=colstart;i--){
            System.out.print(arr[rowend][i]+" ");
         }
         rowend--;

         for(int i=rowend;i>=rowstart;i--){
            System.out.print(arr[i][colstart]+" ");
         }
         colstart++;

         System.out.println();
      }
       
         sc.close();
    }
    
}


