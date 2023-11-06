/*public class Keypad {
    public static String[] Keyword={".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
    "tu", "vwx", "yz"};

    public static void printcom(String str,int idx,String Combination){
        if(idx==str.length()){
            System.out.println(Combination);
            return;
        }
        char currchar=str.charAt(idx);
        String work=Keyword[currchar-'0']; 
        for(int i=0;i<work.length();i++){
            printcom(str, idx+1, Combination+work.charAt(i));
        }                 
    } 
    public static void main(String args[]){
        String str="23";
        printcom(str,0,"");
    }
    
}*/
public class Keypad {
    public static String[] keypad={".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
    "tu", "vwx", "yz"};
    public static void printcom(String str,int idx,String comb){
        if(idx==str.length()){
            System.out.println(comb);
            return;
        }
        char currchar=str.charAt(idx);
        String work=keypad[currchar-'0'];
        for(int i=0;i<work.length();i++){
            printcom(str, idx+1, comb+work.charAt(i));
        }

    }
    public static void main(String args[]){
        String str="23";
        printcom(str, 0, "");
    }
}
