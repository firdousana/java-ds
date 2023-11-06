public class Subsetofn {
    public static String input="";
    public static void fun(int n,String subset,int idx){
        
        if(idx==input.length()){
            System.out.println(subset);
            return;
        }
        char ch=input.charAt(idx);
        fun(n, subset+ch, idx+1);
        fun(n, subset, idx+1);
        
    }
    public static void main(String args[]){
        int n=3;
        for(int i=n;i>=1;i--){
            input+=i;
        } 
        fun(n, "", 0);
       }

}
