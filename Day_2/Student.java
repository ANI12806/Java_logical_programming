import java.util.*;
class Student
{
public static void main(String args[])
{
Scanner b = new Scanner(System.in);
int sno,m,p,c,tot;
String sname;
float savg;
System.out.println("Enter the student number:");
sno=b.nextInt();
System.out.println("Enter the student name:");
sname=b.next();
System.out.println("Enter the maths marks:");
m=b.nextInt();
System.out.println("Enter the physics marks:");
p=b.nextInt();
System.out.println("Enter the chemistry marks:");
c=b.nextInt();
tot=m+p+c;
savg=m+p+c/3;
System.out.println("the student number is:"+sno);
System.out.println("the student name is:"+sname);
System.out.println("the maths marks is:"+m);
System.out.println("the physics marks is:"+p);
System.out.println("the chemistry marks is:"+c);
System.out.println("the total marks is:"+tot);
System.out.println("the average marks is:"+savg);
}
}
