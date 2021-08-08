// Super Method


class A
{
    public A()
    {
        System.out.println("in A");
    }
    public A(int i)
    {
        System.out.println("in A int");
    }

}
class B extends A
{
    public B()
    {
        //super(8);
        System.out.println("in B");
    }
    public B(int i)
    {
        super(8);
        System.out.println("in B int");
    }
}


public class hello
{
    public static void main(String args[])
    {
        B obj = new B(0);

    }
}
