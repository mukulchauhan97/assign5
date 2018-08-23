class rect
{
private int l,b;
void setData(int x,int y)
{
l=x;
b=y;
}
int calArea()
{
return l*b;
}
}
class rectangle
{
public static void main(String args[])
{
rect r=new rect();
r.setData(10,20);
System.out.println("Area:"+r.calArea());
}
}
