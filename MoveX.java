public class MoveX {
    
    public static void Moveall(String str,int idex,int count,String newstr){
        
        if(idex==str.length()){
            for(int i=0;i<count;i++){
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }
        char currentchar=str.charAt(idex);
        if(currentchar=='x'){
            count++;
            Moveall(str,idex+1,count,newstr);
      }else{
        newstr+=currentchar;
        Moveall(str,idex+1,count,newstr);
     }
    }
    public static void main(String args[]){
        String str="xmnsjdxxjnx";
        Moveall(str,0,0,"");
    }
}

