public class ExceptionHandling {
    public static void main(String args[]){
        try{
            int a[]=new int[5];
            a[5]=30/0;
        }catch(Exception e){
            throw new ArithmeticException("error ");
        }
        finally{
            System.out.println("tRY-CATCH BLOCK IS FINISHED ");
        }
    }
}
