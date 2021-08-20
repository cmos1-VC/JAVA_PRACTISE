/*Sarah got confused to calculate volume of cylinder and cuboid. Write a Java application to help Sarah to do this.

Create a class called VolumeCalculator that has the following methods
double calculateVolume(double radius,double height)
This method calculates the volume of the cylinder using the formula 3.14*radius*radius*height
double calculateVolume(int length,int breadth,int height)
This method calculates the volume of the cuboid using the formula length*breadth*height
Write a TestMain class to test the application.

Sample Input

Enter the choice
1.Find Volume For Cylinder
2.Find Volume For Cuboid
1
Enter the radius
3
Enter the height
2

Output
Volume of the Cylinder is 56.52*/

package Problems;

import java.util.Scanner;

class VolumeCalculator
{
    double calculateVolume(double radius, double height)
    {
        return 3.14*radius*radius*height;
    }
    double calculateVolume(int lenght, int breath, int height)
    {
        return lenght*breath*height;
    }
}
class Student_details
{
    public static void main(String args[])
    {
        VolumeCalculator obj = new VolumeCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice\n 1.Find Volume For Cylinder\n 2.Find VOlume For Cuboid");
        int choice = sc.nextInt();
        if(choice == 1)
        {
            System.out.println("enter the radius:");
            double radius =sc.nextDouble();
            System.out.println("Enter the height: ");
            double height = sc.nextDouble();
            System.out.println(obj.calculateVolume(radius, height));
        }
        else if(choice == 2)
        {
            System.out.println("Enter the lenght:");
            int lenght = sc.nextInt();
            System.out.println("enter the breath: ");
            int breath = sc.nextInt();
            System.out.println("Enter the height: ");
            int height = sc.nextInt();
            System.out.println(obj.calculateVolume(lenght, breath, height));
        }
    }
}
