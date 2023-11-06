public class FactorialByRecursion {
    public static void printfact(int i,int n,int fact){
        if(n==0||n==1){
            System.out.println("fact is one");
        }
        if(i==n){
            fact=fact*n;
            System.out.println(fact);
            return;
        }
        fact=fact*i;
        printfact(i+1,n,fact);
    }
    public static void main(String args[]){
        printfact(1,5,1);

    }
    
}
