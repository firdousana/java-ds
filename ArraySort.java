public class ArraySort {
    public static void main(String args[]){
        int arr[]={90,80,70,60,50,40,30,20,10};
        System.out.println("Array in asccending order ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=0;
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
            
            System.out.print(arr[i]+" ");
        }

 
        }
    }


//Descending order
/*
public class ArraySort {
    public static void main(String args[]){
        int arr[]={40,50,1,5,9,30,500,-6};
        System.out.println("Array in descending order ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=0;
                if(arr[j]>arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }

            }
            
            System.out.print(arr[i]+" ");
        }

 
        }
    }
*/

// public class ArraySort{
//     public static int SortingNegative(int arr[],int n){
//         int i;
//         for( i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 int temp=0;
//                 if(arr[i]>arr[j]){
//                     temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;

//                 }

//             }
//         }
//         return arr[i];
//     }
//     public static void main(String args[]){
//         int arr[]=new int[]{4,3,2,1};
//         int n=arr.length;
//         SortingNegative(arr, n);
        

//     }
// }
