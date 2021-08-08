import java.util.Scanner;

class calc     // class calc
{
    int num1;    // variables
    int num2;
    int result;

    public void perform()     //Method perform()
    {
        result = num1 + num2;
    }
}
public class hello {

    public static void main(String[] args) {
        calc obj = new calc();        //creating a reference object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vaue number 1 :");
        obj.num1 = sc.nextInt();
        System.out.println("Enter the vaue number 2 :");
        obj.num2 = sc.nextInt();
        obj.perform();
        System.out.println(obj.result);
    }
}
