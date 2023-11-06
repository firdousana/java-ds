public class HallowwButterfly {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }//spaces 8 6 4 2 0
            for(int j=1;j<=(n*2-i*2);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //bottom 8 6 4 2 0 n=5,

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }//spaces 8 6 4 2 0
            for(int j=1;j<=(n*2-i*2);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        

    }
}
    

