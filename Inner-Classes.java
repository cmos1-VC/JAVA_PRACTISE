/* 3-TYpes of inner classes
1 - Memeber class(Non-static)
2- Static Class(//Commented lines are examples...)
3- Anonymous Class
*/



class Outter
{
    int i;
    public void show()
    {
        System.out.println("Outter class ");
    }

    class Inner  //Static class Inner   Outter$Inner.class
    {
        public void display()
        {
            System.out.println("Inner class");
        }
    }
}


public class hello
{
    public static void main (String args[])
    {
        Outter obj1 = new Outter();
        obj1.show();

        Outter.Inner obj2 = obj1.new Inner();    //Outter.Inner obj2 = new Outter.Inner();
        obj2.display();
    }
}
