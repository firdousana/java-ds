import java.util.Scanner;
class PalindromicSubstring {
    public static int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i)){
                count++;
            }
        }
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
        }
        return count;
     
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        countSubstrings(s);
sc.close();

    }
}