/*public class BubbleSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,9,7,3};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){//loop to sort the element i=0 by checking with others
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

                }
                
            }

        }
        printArray(arr);
    }
    
}*/
public class BubbleSort{
    public static void bs(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={4,5,3,7,1};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
           }
        }
        bs(arr);
    }
}