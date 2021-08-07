/* Create a class Employee with the following private member variables.

> int employeeId
> String employeeName
> double salary
> double netSalary
Include appropriate getters and setters method in Employee class. Write the following method in the Employee class:
public void calculateNetSalary(int pfpercentage)  - This method should take PF percentage as argument. Deduct the PF amount from the salary and set the netSalary.  


Create a Main class which has the main method which invokes the method to get the input and prints the details as shown in the sample. 

Also write a method :

   public static Employee getEmployeeDetails() -  which gets the employee details and returns the employee object.

public static int getPFPercentage() -  which gets the PF percentage and returns the same

Note: Do not create a static reference for the Scanner class, create a scanner object inside the method.

Sample Input 1:

Enter Id:
101
Enter Name:
Vivek
Enter salary:
20000
Enter PF percentage:
7

Sample Output 1:

Id : 101

Name : Vivek

Salary : 20000.0

Net Salary : 18600.0
*/


import java.util.Scanner;

class Employee
{
    private String employeeName;
    private int employeeId;
    private double salary;
    private  double netsalary;

    public String Getemployeename()
    {
        return employeeName;
    }
    public int Getemployeeid()
    {
        return employeeId;
    }
    public double Getsalary()
    {
        return salary;
    }
    public double Getnetsalary()
    {
        return netsalary;
    }
    public void Setemployeename(String employeename)
    {
        this.employeeName = employeename;
    }
    public void setemployeeid(int employeeid)
    {
        this.employeeId = employeeid;
    }
    public void Setsalary(Double salary)
    {
        this.salary = salary;
    }
    public void Setnetsalary(Double netsalary)
    {
        this.netsalary = netsalary;
    }
    public void calculatenetSalary(int pfpercentage)
    {
        Double NetSalary = this.salary - (this.salary*(pfpercentage/100.00));
        this.netsalary = NetSalary;
    }
}


public class Employee_salary_caluculation {
    public static  Employee getEmployeeDetails()
    {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        System.out.println("Enter Id: ");
        e.setemployeeid(sc.nextInt());
        System.out.println("Enter Name: ");
        e.Setemployeename(sc.next());
        System.out.println("Enter Salary: ");
        e.Setsalary(sc.nextDouble());
        return e;
    }
    public static int getPFpercentage()
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter PF percentage: ");
        int pfpercentage = sc1.nextInt();
        return pfpercentage;
    }
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        Employee e = getEmployeeDetails();
        int temp = getPFpercentage();
        e.calculatenetSalary(temp);
        System.out.println("Enter ID : " +  e.Getemployeeid());
        System.out.println("Name : " +  e.Getemployeename());
        System.out.println("Salary : " +  e.Getsalary());
        System.out.println("Net Salary : " +  e.Getnetsalary());


    }
        
}
