import java.util.*;
class Even
{
public static void main(String args[])
{
int i=1,n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the n value:");
n=sc.nextInt();
do
{
if(i%2==0)
{
System.out.println(i);
i++;
}
}while(i<=n);
}
}