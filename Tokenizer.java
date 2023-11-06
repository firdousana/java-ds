import java.util.*;
public class Tokenizer {
    public static void main(String args[]){
        int sum=0;
        
        System.out.println("Enter the numbers ");
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer st=new StringTokenizer(s," ");
        while(st.hasMoreTokens()){
            String str=st.nextToken();
            int x=Integer.parseInt(str);
            sum=sum+x;
        }
        System.out.println(sum);
        sc.close();
      }
    
}
