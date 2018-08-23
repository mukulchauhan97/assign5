import java.util.Scanner;
class second
{
int a[],n;
Scanner kb=new Scanner(System.in);
second(int s)
{
a=new int[s];
n=s;
}
void setData()
{
for(int i=0;i<n;i++)
{
a[i]=kb.nextInt();
}
}
void find()
{
int m=0,sm=0;
for(int i=0;i<n;i++)
{
if(a[i]>m)
{
m=a[i];
}
}
for(int i=0;i<n;i++)
{
if(a[i]>sm && m!=a[i])
{
sm=a[i];
}
}
System.out.println("Second highest:"+sm);
}
public static void main(String args[])
{
second s=new second(Integer.parseInt(args[0]));
s.setData();
s.find();
} 
}