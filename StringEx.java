import java.util.StringTokenizer;
import java.util.Scanner;
public class StringEx
{
public static void main(String args[])
{
String s2;
int sum=0,x;
Scanner scan = new Scanner(System.in);
System.out.println("Enter numbers ");
String s = scan.next();
 StringTokenizer st = new StringTokenizer(s,",");
 while (st.hasMoreTokens())
 {
s2=st.nextToken();
System.out.println(s2);
x=Integer.parseInt(s2);
sum=sum+x;
 }
System.out.println(sum);
scan.close();
}
} 
