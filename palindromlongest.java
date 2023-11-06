import java.util.*;
class palindromlongest{
    public static String xoxo(String s) {
        String palindrome="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(palindrome.length()<(s.substring(i,j+1)).length()){
                        palindrome=s.substring(i,j+1);
                    }
                  
                }
            }
        }
        System.out.println(palindrome);
   return palindrome;
    
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        xoxo(s);
        sc.close();
    }
}