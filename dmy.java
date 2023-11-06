public class dmy{
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
    // m   cm  d  cd   c   xc l  xl x ix v iv i
    //1000 900 500 400 100 90 50 40 10 9 5 4   1
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
    public static void rtn(String str){
        int res=0;
        for(int i=0;i<str.length();i++){
            int s1=value(str.charAt(i));
            if(i+1<str.length()){
                int s2=value(str.charAt(i+1));
                if(s1>=s2){
                    res=res+s1;
                }else{
                    res=res+s2-s1;
                }

            }else{
                res=res+s1;
            }
        }
        System.out.println(res);
    }
    public static void main(String args[]){
        rtn("XI");
    }
}