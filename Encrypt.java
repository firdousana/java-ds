class Encrypt{
    public static void main(String args[]){
        int key=1;
        String text="Whats the next plan to kill yourself..?";
        System.out.println(text);
        char[] chars=text.toCharArray();
        for(char c:chars){
           c+=key; 
           System.out.print(c);

        }//thisis called as for-each loop in java it iterate over the 
        //array until it reaches the last element
       
      
    }
}