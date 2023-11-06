public class PrePost {
    public static void main(String args[]){
        int a=10;
        int b=a++;
        //b=a--; try with ++ too
        //inc and dec are called as unary since they perform on single variable
      
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
