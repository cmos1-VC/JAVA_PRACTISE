
// Method overriding is the sub class overriding the method of super class .


class A
{
    public void show()
    {
        System.out.println("in A");
    }
}

class B extends A
{
    @Override    //annotation better to use.
    public void show()
    {
        super.show();     //super method used to get the o/p from the parent/super class as well
        System.out.println("in B");
    }
}


public class hello
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.show();
    }
}
