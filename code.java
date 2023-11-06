import java.util.*;
public class code {
    public static void main(String args[]){
        int n=3;
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
           }
        int[] arr2=new int[n];
		for(int i=0;i<n;i++){
		    arr2[i]=sc.nextInt();
		 }
         int[] newarr=new int[n];
         newarr[0]=arr[0];
         for(int i=1;i<n;i++){
            newarr[i]=arr[i]-arr[i-1];
 }
       
         
sc.close();
    }
}
