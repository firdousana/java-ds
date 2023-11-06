class TypeCasting{
    public static void main(String args[]){
        int x=8;
        double y= x;
        System.out.println("automatic conversion of int  to double "+y);
        //automatically
        double a=7.0d;
        int b=(int)a;
        System.out.println("manual conversion of double to int "+b);
        //Widening Casting (automatically) - converting a smaller type to a larger type size. byte -> short -> char -> int -> long -> float -> double.
//Narrowing Casting (manually) - converting a larger type to a smaller size type. double -> float -> long -> int -> char -> short -> byte.

    }
}