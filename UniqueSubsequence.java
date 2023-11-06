import java.util.HashSet;

public class UniqueSubsequence {
    public static void func(String str,int idex,String newstr,HashSet<String> set){
        if(idex==str.length()){
            
            if(set.contains(newstr)){
                return;
            }else{
            System.out.println(newstr);
            set.add(newstr);
            return;
        }
           
        }
        char currentchar=str.charAt(idex);
        //to be
        func(str, idex+1, newstr+currentchar,set);
        //not to be
        func(str, idex+1, newstr,set);

    }
    public static void main(String args[]){
        HashSet<String> set=new HashSet<>();
        String str="aaa";
        func(str, 0, "",set);
}
}
