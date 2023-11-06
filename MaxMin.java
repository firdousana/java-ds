import java.util.*;
public class MaxMin {
  
    
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int numbers[] = new int[size];
      
      
            //input
            for(int i=0; i<size; i++) {
                numbers[i] = sc.nextInt();
            }
      
      
            int a = Integer.MIN_VALUE;
            int b = Integer.MAX_VALUE;
           
             for(int i=0; i<numbers.length; i++) {
                 if(numbers[i] < b) {
                     b = numbers[i];
                 }
                 if(numbers[i] > a) {
                    a = numbers[i];
                 }
             }
      
      
             System.out.println("Largest number is : " + a);
             System.out.println("Smallest number is : " + b);
            sc.close();
         }
      


       
}


