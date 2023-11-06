public class RomanToNumber {
   public static int value(char ch){
        if(ch=='I'){
            return 1;
        }
        if(ch=='V'){
            return 5;
        }
        if(ch=='X'){
            return 10;
        }
        if(ch=='L'){
            return 50;
        }
        if(ch=='C'){
            return 100;
        }
        if(ch=='D'){
            return 500;
        }
        if(ch=='M'){
            return 1000;
        }
        return -1;
    }
    public static int rtn(String str){
        int res=0;
        for(int i=0;i<str.length();i++){
            int s1=value(str.charAt(i));
            if(i+1<str.length()){
                int s2=value(str.charAt(i+1));
                if(s1>=s2){
                    res+=s1;
              }else{
                res=res+s2-s1;
               }
 
            }else{
    res=res+s1;
 }

        }
        System.out.println(res);
        return res;
    
    }
    public static void main(String args[]){
    String str="XI";
    rtn(str);
    
    
    }
}
