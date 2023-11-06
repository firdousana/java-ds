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
            System.out.print(names[i]+" ");
        }

sc.close();
    }
    
}
