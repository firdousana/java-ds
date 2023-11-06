
import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class codechef1
{
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int S=0,L=0;
		int t=sc.nextInt();
		while(t!=0){
		    int x=sc.nextInt();
		    String[] arr=new String[x];
		    for(int i=0;i<x;i++){
		        arr[i]=sc.next();
		    }
		    for(int i=0;i<x;i++){
		        if(arr[i]=="START38"){
		            S++;
		        }else{
		            L++;
		        }
		    }
	}
	System.out.println(S+" "+L);
    sc.close();
}

}
