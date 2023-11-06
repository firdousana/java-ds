public class Permutation {
    public static void printpermu(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String ros=str.substring(0, i)+str.substring(i+1);//abc
            printpermu(ros, permutation+ch);
        }
}
public static void main(String args[]){
    String str="abc";
    printpermu(str, "");
}
}
