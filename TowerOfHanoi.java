public class TowerOfHanoi {
    public static void tower(int n,String source,String helper,String destination){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+source+" to "+destination);
            return;
        }
        tower(n-1,source,destination,helper);
        System.out.println("Transfer disk "+n+" from " +source+" to "+destination);
        tower(n-1,helper,source,destination);
}//timecomplexity O(2^n)
public static void main(String args[]){
    int n=2;
    tower(n,"S","H","D");
}
}
/*
public class TowerOfHanoi{
    public static void fun(int n,String source,String helper,String dest){
        if(n==1){
            System.out.println("Disk transferred from "+source+" to "+dest);
        }
        fun(n-1 , source, dest, helper);
         System.out.println("Disk transferred from "+source+" to "+dest);
         fun(n-1 , helper, source, dest);
          
    }
    public static void main(String args[]){
        int n=2;
        fun(n, "s", "h", "d");

    }
}*/