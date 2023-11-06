import java.util.*;
public class StringLength {
    public static void main(String args[]){
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter string1 and string 2");
        String str1=sc.next();
        String str2=sc.next();
        String comb=str1+str2;
        System.out.println(comb.length());
        sc.close(); */
Scanner sc=new Scanner(System.in);
System.out.println("Enter size ");
int size=sc.nextInt();
String arr[]=new String[size];
int totlen=0;
System.out.println("Enter elements ");
for(int i=0;i<arr.length;i++){
    arr[i]=sc.next();
    totlen+=arr[i].length();
}
System.out.println(totlen);
sc.close();
        }
}
