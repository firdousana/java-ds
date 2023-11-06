import java.util.*;
public class ArraySearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and col  ");
        int row= sc.nextInt();
        int col=sc.nextInt();
        int numbers[][]=new int[row][col];
        System.out.println("Enter the elements ");
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++)
            {
                numbers[i][j]=sc.nextInt();
            }

        }//printing 
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++)
            {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("Enter element to search ");
        int x=sc.nextInt();
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++)
            {
               if(x==numbers[i][j]){
                System.out.print("Element found at row  "+i+" and col "+j);
               }
            }
            System.out.println();

        }
        

    sc.close();
}
}
 

