public class Array {
    public static void main(String[] args){
        String[] name=new String[3];
        name[0]= "Sana";
        name[1]= "Saa";
        name[2]= "Sa";
        
             for(int i=0;i<3;i++){
                 if(name[i]=="Sana"){
                System.out.println("same");
            }

             }
           

    }
    
}/* 
import java.util.*;
public class Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter th size of array ");
        int size=sc.nextInt();
        int[] number= new int[size];
        for(int i=0;i< number.length;i++){
            System.out.println("Enter the element ");
            number[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search the index : ");
        int x=sc.nextInt();
        for(int i=0;i< number.length;i++){
             if(number[i]==x){
            System.out.println("The index is "+i);

        }
        
        }
        }} */

/* 
import java.util.*;
public class Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of name array ");
        int size=sc.nextInt();
        String[] name=new String[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the name ");
            name[i]=sc.next();
        }
        for(int i=0;i<size;i++){
            System.out.println("The names are "+name[i]);
        }


    }
}*/




/*public class Array {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];


      //input
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }
      
   }
} */
/* 
import java.util.*;
public class Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row n cols ");
        int row= sc.nextInt();
        int col = sc.nextInt();
        int[][] num=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter the element at "+i+j);
                num[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the element(row col) to search in 2D array ");
        int x=sc.nextInt();
   

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(num[i][j]==x ){
                    System.out.println("The"+x+"is found at "+i+j);


                }
            }
        }

        

    }
}

import java.util.*;
public class ArrayName {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of string ");
        int size=sc.nextInt();
        String names[]=new String[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter name ");
            names[i]=sc.next();
        }
        for(int i=0;i<size;i++){
            System.out.print(names[i]=" ");
        }

sc.close();
    }
    
}

*/







