/*Inheritence*/



class Calc     //super
{
    public int add(int i, int j)
    {
        return i+j;
    }
}

class calc2 extends Calc   // sub
{
    public int sub(int i, int j)
    {
        return i-j;
    }
}
class calc3 extends calc2      /*java only supports Single and multi level Inheritence but doesent allow Multiple Inheritence..*/
{
    public int mul(int i, int j)
    {
        return i*j;
    }
}


public class hello
{
    public static void main(String args[])
    {
        calc3 c1 = new calc3();
        System.out.println(c1.add(7,8));
        System.out.println(c1.sub(7,8));
        System.out.println(c1.mul(7,8));

    }
}
