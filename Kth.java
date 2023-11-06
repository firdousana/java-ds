import java.util.Arrays;

import java.util.Scanner;
public class Kth {
    public static void main(String args[]){
        int arr[]=new int[]{12, 3, 5, 7, 19};
        System.out.println("sorted array ");
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            /*for(int j=i+1;j<arr.length;j++){
                int temp=0;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }*/
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the kth element ");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        
     for(int i=0;i<arr.length;i++){
            if(k==i){
            System.out.println(arr[k-1]);
        }
        }
        sc.close();

    }
    
}
