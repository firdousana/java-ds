import java.io.*;
public class Buffered {
    public static void main(String args[]){
        InputStreamReader is= new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(is);
        int x[] = new int[5];
        int y[] = new int[5];
        int z[] = new int[5];
        System.out.println("Enter the elements of 1st array ");
        try{
            for(int i=0;i<5;i++){
                String str1=bf.readLine();
                x[i]=Integer.parseInt(str1);
            }
            
        }catch(IOException e ){

        }
        System.out.println("Enter the elements of 2nd array ");
        try{
            for(int i=0;i<5;i++){
                String str2=bf.readLine();
                y[i]=Integer.parseInt(str2);
                z[i]=x[i]+y[i];
            }
            
        }catch(IOException e ){

        }
        System.out.println("Resultant array ");
        for(int i=0;i<5;i++){
            System.out.println(z[i]);
        }

    }
    
}
