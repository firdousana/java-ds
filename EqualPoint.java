//asked in amazon
class EqualPoint {
 public static int equal(String str){
    int close_br=0;
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)==')'){
            close_br++;
        }
    }
    return close_br;
 }
 public static void main(String args[]){
    String str="(()))(()()())))";
   System.out.println( "result "+equal(str));
 }
}
//since the given test cases return the no. of close br so we did only one iteration
