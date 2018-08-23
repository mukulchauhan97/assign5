class realimg
{
private int r,i;
void setData(int a,int b)
{
r=a;
i=b;
}
void display()
{
System.out.println(r+"+"+i+"i");
}
}
class complex
{
public static void main(String args[])
{
realimg r=new realimg();
r.setData(2,3);
r.display();
}
}