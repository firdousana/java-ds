public class TestNineteen {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                if(i==n||j==1||j==2*i-1){//print stars for col=2*i-1 i.e the last col
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();

        }
    }
    
}
