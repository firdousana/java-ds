/*public class DuplicateElement {
    public static boolean[] map=new boolean[26];
    public static void removeduplicate(String str,int idex,String newstr){
        if(idex==str.length()){
            System.out.println(newstr);
            return;
        }
        
        char curchar=str.charAt(idex);   //curchar-a gives us the index of the element
        //below true means we have that charachter in the array
        if(map[curchar-'a']==true){              //a b c d......z
            removeduplicate(str,idex+1,newstr); //0 1 2 3 ......25
        }else{
            newstr+=curchar;
            map[curchar-'a']=true;
            removeduplicate(str,idex+1,newstr);

        }

    }
    public static void main(String args[]){
        String str="sana";
        removeduplicate(str,0,"");

    }
}*/
public class DuplicateElement{
    public static boolean[] alpha=new boolean[25];
    public static void removeduplicate(String str,int idex,String res){
        if(idex==str.length()){
            System.out.println(res);
            return;
        }//sama
        char ch=str.charAt(idex);
        if(alpha[ch-'a']==true){
            removeduplicate(str, idex+1, res);
        }else{
            res+=ch;
            alpha[ch-'a']=true;
            removeduplicate(str, idex+1, res);
        }

    }
    public static void main(String args[]){
        String str="sama";
        removeduplicate(str, 0, "");
    }
}