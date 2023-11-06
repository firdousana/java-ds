public class Test34 {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-2;j++){
                if(i==1||i==n||j==1||j==3){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //bottom
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=n-2;j++){
                if(i==n-1||j==1||j==3){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    
    
}
