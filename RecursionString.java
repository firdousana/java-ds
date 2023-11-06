/*public class RecursionString {
public static int first = -1;
public static int last = -1;
public static void getIndices(String str, char el, int idx) {
if(idx == str.length()) {
return;
}
if(str.charAt(idx) == el) {
if(first == -1) {
first = idx;
} else {
last = idx;
}
}
getIndices(str, el, idx+1);
}
public static void main(String args[]) {
String str = "aooooooooooa";
char el = 'a';
getIndices(str, el, 0);
System.out.println("First occurence : " + first);
System.out.println("Last occurence : " + last);
}
}*/

public class RecursionString{
    public static void main(String args[]){
        int first=-1;
        int last=-1;
        String str="sana";
        
        char ch='a';
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                if(first==-1){
                    first=i;
                }else{
                    last=i;
                }

            }

        }
        System.out.println("first at index "+first+" last occoured at index "+last);
        
         

    }
}

