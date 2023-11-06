public class TestEighteen {
    public static void main(String args[]){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }//||j==1||i==n||j==i
            for(int j=1;j<=i;j++){
                if(i==n||j==i||j==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
