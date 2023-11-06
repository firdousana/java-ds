public class NumberToRoman {
    public static void  ntr(int num){
        System.out.println("Integer :"+num);
        int value[]={1000,900,500,400,100,90,50,40,10,9,5, 4,1};
        String letters[]={"M","CM", "D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman=new StringBuilder();
        for(int i=0;i<value.length;i++)   
        {  //LET num=11                                 LET num=54
while(num >= value[i]) //11>10     1=1        54>50 4=4
{  
  num = num - value[i];//11-10=1    1-1=0     //54-50=4  
roman.append(letters[i]); //XI                //LIV
}  
} 
        System.out.println("Roman Number "+roman);
    }
    public static void main(String args[]){
        ntr(54);
        
    }
}
