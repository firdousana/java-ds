public class nxmTiles {
    public static int tiles(int n,int m){
        //base cases
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int horplacements=tiles(n-1,m);
        int verplacements=tiles(n-m,m);
        return horplacements+verplacements;

    }
    public static void main(String args[]){
        int n=4,m=2;
        System.out.println(tiles(n, m));
    }
    
}
