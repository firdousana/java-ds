public class TestFifteen {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){//rows
            for(int j=1;j<=i;j++){//cols
                if(i==n||j==1||j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }
    
}
