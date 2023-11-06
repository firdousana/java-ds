public class Subsequence {
    public static void func(String str,int idex,String newstr){
        if(idex==str.length()){
            System.out.println(newstr);
            return;
        }
        char currentchar=str.charAt(idex);
        //to be
        func(str, idex+1, newstr+currentchar);
        //not to be
        func(str, idex+1, newstr); 

    }
    public static void main(String args[]){
        String str="abc";
        func(str, 0, "");
}
    
}


