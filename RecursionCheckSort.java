public class RecursionCheckSort {
    public static boolean isSort(int arr[],int idex){
        
        if(idex==arr.length-1){
           return true;
        }
        if(arr[idex]<arr[idex+1]){
            return isSort(arr,idex+1);
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        System.out.println(isSort(arr,0));
    }
}
