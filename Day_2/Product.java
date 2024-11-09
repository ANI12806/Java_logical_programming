import java.util.*;
class Product
{
public static void main(String args[])
{
Scanner a = new Scanner(System.in);
int pno;
String pname;
float pcost,pqty;
System.out.println("Enter the product number:");
pno=a.nextInt();
System.out.println("Enter the product name:");
pname=a.next();
System.out.println("Enter the product cost:");
pcost=a.nextFloat();
System.out.println("Enter the product quantity:");
pqty=a.nextFloat();
float bill=pcost*pqty;
System.out.println("the product number is:"+pno);
System.out.println("the product name is:"+pname);
System.out.println("the product cost is:"+pcost);
System.out.println("the product quantity is:"+pqty);
System.out.println("the product bill is:"+bill);
}
}