public class Sort012 {
   
    public static void main(String args[]){
        int arr[]={2,1,0,1,2,0,1,2,0};
        int n=arr.length;
        
        int i;
        for( i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
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
