public class RecursionPhone {
    public static String[] Keypad={".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
    "tu", "vwx", "yz"};

    public static void printcom(String str,int idx,String Combination){
        if(idx==str.length()){
            System.out.println(Combination);
            return;
        }
        char currchar=str.charAt(idx);
        String work=Keypad[currchar-'0'];
        for(int i=0;i<work.length();i++){
            printcom(str, idx+1, Combination+work.charAt(i));
        }
 }
    public static void main(String args[]){
        String str="23";
        printcom(str,0,"");
    }
    
}
