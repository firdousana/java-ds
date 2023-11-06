class SwapWithoutThirdVariable{
    public static void main(String args[]){
        int a=101;
        int b=34;
        System.out.println("The two numbers are "+a+" and "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The swapped numbers are "+a+" and "+b);
    }
}