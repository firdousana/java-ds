//program to find the maxsum of subarray and pring maxsum
//subarrays are contigous
public class SubarrayMaxSum {
    public static void main(String args[]){
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int sum=0,maxsum=0;
        for(int i=0;i<arr.length;i++){
           if(sum>=0){
            sum+=arr[i];
           }else{
            sum=arr[i];
           }
           if(sum>maxsum){
            maxsum=sum;
           }
        }
        System.out.println(maxsum);

    }
}
