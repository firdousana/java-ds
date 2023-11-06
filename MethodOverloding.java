class Sum{
    int add(int a,int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}
public class MethodOverloding {
    public static void main(String args[]){
        Sum S = new Sum();
        System.out.println(S.add(11,11));
        System.out.println(S.add(11,22,33));
    }
    
}
//Method Overloading
//compile time polymorphism
//same method with diff para