class InvertedPattern{
    public static void main(String args[]){
        int n=4;
        for(int i=n;i>=1;i--){//since they are n stars in 1st row so n to 1
            for(int j=1;j<=i;j++){ //print i stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
