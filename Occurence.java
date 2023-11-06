class Occurence {
    static int  countOccurence(int arr[],int n,int x){
        int count=0;
        for(int i=0;i<n;i++){
            
                if(x==arr[i]){
                    count++;

                }
            

    }return count;


}
    public static void main(String args[]){
        int arr[]=new int[]{2,3,6,3,4,4,3,3,3};
        int n=arr.length;
        int  x=3;
        
            System.out.println(countOccurence(arr, n, x));
        }
    }


