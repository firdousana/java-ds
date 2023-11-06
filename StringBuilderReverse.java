
public class StringBuilderReverse {
    public static void main(String args[]){
        /*StringBuilder sb = new StringBuilder("HelloWorld");
    
       for(int i=0; i<sb.length()/2; i++) {
       int front = i;
       int back = sb.length() - i - 1;


       char frontChar = sb.charAt(front);
       char backChar = sb.charAt(back);


       sb.setCharAt(front, backChar);
       sb.setCharAt(back, frontChar);
     }


     System.out.println(sb);


 


    String str="Sana";
    for(int i=str.length()-1;i>=0;i--){
System.out.print(str.charAt(i));

    }
*/
StringBuilder str
= new StringBuilder("WelcomeGeeks");

// print string
System.out.println("String = "+ str.toString());
//System.out.println(str);

// reverse the string
//StringBuilder reverseStr = str.reverse();

// print string
//System.out.println("Reverse String = " + reverseStr.toString());
System.out.println(str.reverse());
    }
    
}
