public class Test35 {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-2;j++){
                if(i==1||i==3||i==5){
                    System.out.print("* ");
                }
            }
            for(int j=1;j<=n-3;j++){
                if(i==2||i==4){
                    System.out.print(" *");
                }
            }
            System.out.println();

        }
}
}
