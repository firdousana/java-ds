public class SubarraySum {
    public static void main(String args[]){
        int arr[]=new int[]{10,20,3,50,60,3};
        int sum=63;
        for(int i=0;i<arr.length;i++){
            int currentsum=arr[i];
            if(currentsum==sum){
                System.out.println("The sum is found at index "+i);
            }else {
                for(int j=i+1;j<arr.length;j++){
                    currentsum+=arr[j];
                    if(currentsum==sum){
                        System.out.println("The sum is found at index from "+i+" to "+j);
                    }

                }
            }


        }
    }
}
