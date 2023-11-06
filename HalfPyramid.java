public class HalfPyramid {
    public static void main(String args[]){
        int n=4;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){//if i just change n-1 i will get the stars at left side
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    
}
}
