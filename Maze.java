public class Maze {
    public static int fu(int i,int j,int m,int n){
        if(i==m-1||j==n-1){
            return 1;
        }
        return fu(i+1,j,m,n) + fu(i, j+1, m, n); 
    }
    public static void main(String args[]){
        int m=3;
        int n=3;
        System.out.println(fu(0, 0, m, n));
    }
}
