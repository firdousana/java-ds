/*public class SumFromRecursion {
    public static void printsum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;

        }
        sum=sum+i;
        printsum(i+1,n,sum);
    }

    public static void main(String args[]){
        int n=5;
        printsum(1,n,0);

    }
}*/
public class SumFromRecursion{
    public static void fun(int n,int i,int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;

        }
        fun(n, i+1,sum+i);
    }
    public static void main(String args[]){
        int n=5;
        fun(n, 1, 0);
    }
}
