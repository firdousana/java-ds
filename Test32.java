public class Test32 {
    public static void main(String args[]){
       int n=3;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }//stars 5 3 1==>2*i-1
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //bottom
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }//stars 5 3 1==>2*i-1
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
   
}
