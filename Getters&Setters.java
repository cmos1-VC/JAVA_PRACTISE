class Employee
{
    private String name;
    private int id;
    public String GetName()
    {
        return name;
    }
    public void Setid(int i)
    {
        this.id = i;
    }
    public void Setname(String n)
    {
        this.name = n;
    }
    public int Getid()
    {
        return id;
    }
}

/* ina aprivate Access modifier we cant acess the data-types normally so we use Getters and Setters.
Getters - returns a value(accessors)
Setters - Sets/Updates a value(Mutators)*/ 

public class hello
{
    public static void main(String args[])
    {
        Employee emp1 = new Employee();
        emp1.Setname("Harry");
        System.out.println(emp1.GetName());
        emp1.Setid(9);
        System.out.println(emp1.Getid());
    }
}
