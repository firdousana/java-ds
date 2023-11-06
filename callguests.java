public class callguests {
    public static int fun(int n){
        if(n<=1){
            return 1;
        }
        int way1=fun(n-1);//single 2
        int way2=(n-1)*fun(n-2);//pair 2*1=4
        return way1+way2;
    }
    public static void main(String args[]){
        int n=3;
        System.out.println(fun(n));

    }
    
}
