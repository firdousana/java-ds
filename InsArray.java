public class InsArray {
    public static void main(String args[]){
        //intersection of arrays
        int arr1[]=new int[]{10,20,30,80,90};
        int arr2[]=new int[]{20,80,54,19,34,};
        System.out.println("Intersection of arr1 and arr2 is ");
        for(int i=0;i<arr1.length;i++){
           for(int j=0;j<arr2.length;j++){
            if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                }

           }
          }
        
        
    }
    
}
