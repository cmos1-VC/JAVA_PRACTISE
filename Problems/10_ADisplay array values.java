/*Display array values

Write a java program to create an array of size ānā and accepts ānā number of integers from the user and display all the values from an array

Sample Input 1

Enter the array size

5

Enter the values

10

15

62

94

78

*/


import java.util.Scanner;

public class Array
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int[] a;
        System.out.println("Enter the Array Size");
        int s = sc.nextInt();
        a = new int[s];
        System.out.println("Enter their values");;
        for(int i = 0; i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int j:a)
        {
            System.out.println(j);
        }
    }
}

/* Same question but try printing the values in reverse order*/

import java.util.Scanner;

public class Array
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int[] a;
        System.out.println("Enter the Array Size");
        int s = sc.nextInt();
        a = new int[s];
        System.out.println("Enter their values");;
        for(int i = 0; i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int j=(a.length)-1;j>=0;j--)
        {
            System.out.println(a[j]);
        }
    }
}









