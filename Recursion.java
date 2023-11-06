public class Recursion {
    public static void printnum(int n){
        if(n==6){
            return;
        }
    System.out.println(n);
    printnum(n+1);//recursion calling itself
}    
public static void main(String args[]){
    int n=1;
    printnum(n);

    }
}
