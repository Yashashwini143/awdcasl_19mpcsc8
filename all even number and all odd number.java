import java.util.*;
public class Sample
{
public static void main(String args[])
{
int n,r,rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter n");
n=sc.nextInt();
while(n>0)
{
r=n%10;
rev=rev*10+r;
n/=10;
}
int temp=rev;
while(temp>0)
{
r=temp%10;
if(r%2==0)
System.out.print(r);
temp/=10;
}
System.out.println();
while(rev>0)
{
r=rev%10;
if(r%2!=0)
System.out.print(r);
rev/=10;
}
}
}


output:
enter n
12345
24
135