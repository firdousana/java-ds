public class HallowRec{
    public static void main(String args[]) {
       
       
        for(int i=1; i<=4; i++) {//4 rows
            for(int j=1; j<=5; j++) {// 5 columns
                if(i == 1|| i == 4 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}

