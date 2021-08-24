/*Develop a smart application as Student Grade Calculator(SGC).

Create a class Student with following private attribute :

int id, String name, marks(integer array), float average and char grade. Include appropriate getters and setters methods and constructor.

void calculateAvg()- This method should calculate average and set average mark for the current student.

void findGrade()- This method should set the grade based on the average calculated. If the average is between 80 and 100 then, then return grade as 'O', else 'A' .If the student gets less than 50 in any of the subjects then return grade as 'F'. Using appropriate setter method set the grade to the student.

(Note : number of subject should be greater than zero, if not display as 'Invalid number of subject' and get number of subject again, Assume mark for a subject should be in the range 0 - 100.  If not display a message "Invalid Mark" and get the mark again)

Write a class StudentMain and write the main method.

In this class, write a method

public static Student getStudentDetails() - this method should get the input from the user for a student, create a student object with those details and return that object.


In main create student’s object by invoking the getStudentDetails method.  Also calculate average and grade for that student object using appropriate methods.

SGC app should get the input and display the output as specified in the snapshot:



Sample Input 1:
Enter the id:
123
Enter the name:
Tom
Enter the no of subjects:
3
Enter mark for subject 1:
95
Enter mark for subject 2:
80
Enter mark for subject 3:
75

Sample Output 1:

Id:123
Name:Tom
Average:83.33
Grade:O
*/


import java.util.Scanner;

class Student
{
    private int id;
    private String name;
    private int marks[] = new int[100];
    private float average;
    private char grade;


    public Student(int id,String name,int a[])
    {
        this.id = id;
        this.name = name;
        this.marks = a;
    }
    public void setGrade(char g) {
        this.grade = g;
    }
    
    public char getGrade() {
        return grade;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int[] getMarks() {
        return marks;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public float getAverage() {
        return average;
    }
    public void setAverage(float average) {
        this.average = average;
    }
    
    public void calculateAvg()
    {
        int s = 0;
        for(int i=0;i<marks.length;i++)
        {
            s=s+marks[i];
        }
        double d = s;
        average = (float)(d/marks.length);
    }
    public void findGrade()
    {
        int flag = 0;
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]<50)
            {
                flag = 1;
                break;
            }
        }
        if(flag ==0)
        {
            if(average>=80 && average<=100)
                grade='O';
            else if(average>=50 && average<80)
                grade='A';
            else if(average<50)
                grade='F';
        }
        else
        {
            grade='F';
        }
    }
}
public class Average_and_grade_Calculation {
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter the no of subjects:");
        int subjects = sc.nextInt();
        sc.nextLine();
        int a[] = new int[subjects];
        int pr=1;
        for(int i=0;i<subjects;i++)
            {
                System.out.println("Enter mark for subject "+(pr++)+":");
                a[i] =sc.nextInt();
            }
        Student s1 = new Student(id, name, a);
        System.out.println("id:"+s1.getId());
        System.out.println("Name:"+s1.getName());
        s1.calculateAvg();
        s1.findGrade();
        System.out.println("Average:"+s1.getAverage());
        System.out.println("Grade:"+s1.getGrade());
    }
}
