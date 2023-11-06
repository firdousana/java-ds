import java.util.*;
public class ArraySorted {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size ");
        int size=sc.nextInt();
        int marks[]=new int[size];
        System.out.println("enter values");
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
            
        }

        boolean isAscending=true;
        for(int i=0;i<marks.length-1;i++){
            if(marks[i]>marks[i+1]){
                isAscending=false;
            }
        }
        if(isAscending){
            System.out.println("sorted array ");
        }else{
            System.out.println("unsorted array ");
        }
        sc.close();
    }
    
}
