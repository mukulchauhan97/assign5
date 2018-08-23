import java.util.Scanner;
class wave
{
int a[],n;
Scanner kb=new Scanner(System.in);
wave(int s)
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
void createw()
{
int t;
for(int i=1;i<n;i++)
{
for(int j=0;j<n-i;j++)
{
if(a[j]>a[j+1])
{
t=a[j+1];
a[j+1]=a[j];
a[j]=t;
}
}
}
for(int i=0;i<n;i+=2)
{
//int t;
if(a[i+1]>a[i])
{
t=a[i+1];
a[i+1]=a[i];
a[i]=t;
}
}
}
void display()
{
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
public static void main(String args[])
{
wave s=new wave(Integer.parseInt(args[0]));
s.setData();
s.createw();
s.display();
} 
}