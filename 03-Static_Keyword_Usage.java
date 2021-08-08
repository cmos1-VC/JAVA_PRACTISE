class Laptop
{
    String processor;
    int ram;
    static String company;  //static data-Type is used

    public void specs()
    {
        System.out.println(processor + ":" + ram + ":" + company);
    }
}

public class hello
{
    public static void main(String args[])
    {
        Laptop varma = new Laptop();
        Laptop chekuri = new Laptop();

        varma.processor = "ryzen";
        varma.ram = 16;

        chekuri.processor = "Intel";
        chekuri.ram = 8;

        Laptop.company = "Lenovo";  //Static keyword usage of the object class name can be used while declaring the object.

        varma.specs();
        chekuri.specs();
    }
}


                                     /*OR*/

class Laptop
{
    String processor;
    int ram;
    static String company = "Lenovo";


    
    static       // will be executed when u load a class.
    {
         company = "lenovo";
    }  


    public Laptop()  //will be executed when u create an object.
    {
        processor = "Ryzen";
        ram = 16;
    }

    public void specs()
    {
        System.out.println(processor + ":" + ram + ":" + company);
    }
}

public class hello
{
    public static void main(String args[])
    {
        Laptop varma = new Laptop();
        Laptop chekuri = new Laptop();

         

        varma.specs();
        chekuri.specs();
    }
}
