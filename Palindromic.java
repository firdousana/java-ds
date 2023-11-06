public class Palindromic {
    public static void main(String args[]) {
            int n = 5;
            for(int i=1; i<=n; i++) {
                //spaces
                for(int j=1; j<=n-i; j++) {
                    System.out.print(" ");
                }
     
     
                //first part 1 3 5 7 9
                for(int k=i;k>=1;k--){//if k is in 3rd row since k=i i.e 3 start printing from 3 2 1
                    System.out.print(k);
                }
                for(int a=2;a<=i;a++){
                    System.out.print(a);
                }
                System.out.println();

            }
        }   
     
     
}
