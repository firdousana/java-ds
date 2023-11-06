import java.util.*;
public class Username{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter email : ");
        String email=sc.next();
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                System.out.println("Your username is "+email.substring(0,i));
            }
            

        }
        sc.close();

    }
}