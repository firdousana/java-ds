public class Test33 {
    public static void main(String args[]){
      int row=5;
       for(int i=1;i<2*5-1;i++){
        if(i==row){
            for(int j=1;j<=2*row-1;j++){
               System.out.print("*");
            }
         }else{
            for(int k=1;k<=4;k++){
                System.out.print(" ");
            }
            System.out.print("*");
         }
         System.out.println();
       } 
        
    }
}
        
   


    

