class Sample
{ 
 void show()
{
System.out.println("show method belong to parent"); 
} 
}
class Info extends Sample
{ 
void show()
{
System.out.println("show method belong to child"); 
} 
}
class OverrideDemo
{
public static void main(String args[])
{ 
 Info i = new Info(); 
 i.show(); 
} 
}