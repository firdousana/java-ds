/*public class Reverse {
    public static void main(String args[]){
        int num[]={1,2,3,4,5};
        System.out.println("The original array is ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println("Reversed array is ");
        for(int i=num.length-1;i>=0;i--){
            System.out.print(num[i]+" ");

        }

    }
    
}*/
public class Reverse {
    public static void main(String args[]){
        String name="Sana";
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));

        }
        int[] num={1,2,3,4,5};
        for(int i=num.length-1;i>=0;i--){
            System.out.print(" "+num[i]+" ");
        }

    
    
}
}



