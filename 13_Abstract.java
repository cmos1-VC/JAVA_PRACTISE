abstract class phone
{
    abstract public void poweron();
    abstract public void poweroff();
    abstract public void  performance();

}
class oppo extends phone
{
   
    @Override
    public void poweron() {
        System.out.println("Welcome to Oppo");
        
    }
    @Override
    public void performance() {
        System.out.println("Greart Performance");
        
    }
    @Override
    public void poweroff() {
        System.out.println("Hope you had a Great experience Bye!!!");
        
    }
    
}

public class Abstract{
    public static  void main(String args[])
    {
        phone obj = new oppo();
        obj.poweroff();
    }

}
