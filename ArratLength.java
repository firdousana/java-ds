
import java.util.Scanner;
public class ArratLength{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of array ");
            int size=sc.nextInt();
            String[] name=new String[size];
            int totlength=0;
            for(int i=0; i<size ;i++){
                System.out.println("Enter the name ");
                name[i]=sc.next();
                totlength +=name[i].length();

            }
           
            System.out.println(totlength);
            sc.close();

        }
} 