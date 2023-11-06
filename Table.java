import java.util.Scanner;
class Table{
    public static void TableFun(int n){

        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+i*n);

        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        TableFun(n);
        sc.close();
    }
}