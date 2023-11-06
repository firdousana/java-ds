/*public class StringPrefix {
    public  String longestCommonPrefix(String[] strs){
        if (strs.length == 0){
             return "";
 }
       
         String Prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf("Prefix")!=0){
                Prefix=Prefix.substring(0,Prefix.length()-1);
            }
        }
        return Prefix;
    }
   
    public static void main(String args[]){
        
        String strs[]={"flower","flow","flue"};
        String res=longestCommonPrefix(strs);
        
         
        System.out.println();
     
        

    }
    
}*/

public class StringPrefix{
    public static void main(String args[]){
        String[] arr={"sana","sama","safa"};
        String prefix=arr[0];
        for(int i=1;i<arr.length;i++){
            while(arr[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0, prefix.length()-1);
            }
        }
        System.out.println(prefix);
    }
}

