/*public class SumSub {
    
 
        // Computes sum all sub-array
        public static long SubArraySum(int arr[], int n)
        {
            long result = 0, temp = 0;
     
            // Pick starting point 123
            for (int i = 0; i < n; i++) {
                // Pick ending point
                temp = 0;
                for (int j = i; j < n; j++) {
                    // sum subarray between current
                    // starting and ending points
                    temp += arr[j];//=1
                    result += temp;// 
                }
            }
            return result;
        }
     
        public static void main(String[] args)
        {
            int arr[] = { 1, 2, 3 };
            int n = arr.length;
            System.out.println("Sum of SubArray : "
                               + SubArraySum(arr, n));
        }
    }*/
    

public class SumSub{
    public static void fun(int[] arr,int sum){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                System.out.println();
            }
        }
        System.out.println(sum);

    }
    public static void main(String args[]){
        int[] arr={1,2,3};
        System.out.println("Subarrays");
        fun(arr,0);
    }

}
