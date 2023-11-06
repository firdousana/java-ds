public class FibonacciByRecursion {
    public static void printFactorial(int a, int b, int n) {
        if(n == 0) {
        return;
        }
        System.out.print(a+" ");//0
        printFactorial(b, a+b, n-1);//n-1 coz we printed a in the above line
        }
        // 1 1 4
        //1 2 3
        //2 3 2
        public static void main(String args[]) {
        printFactorial(0, 1, 5);
        }
       
}
