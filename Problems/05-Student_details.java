/*Create a class Student with the private attributes

int studentId

String studentName, studentAddress, collegeName. 

Include appropriate getter methods.

Assume most of the students are from “NIT” college. So user has to give input whether the student is from NIT or not. 

If student belongs to NIT, give input as 'yes/YES' and  skip input for the attribute collegeName  and create student object with 3-argument constructor to initilze the values for studentId, studentName and studentAddress and  collegeName as “NIT”.
If student belongs to other college, give input as 'no/NO' and get college name from the user and create student object with 4-argument constructor to initialize all the values. 
Instead of Yes / No, if user enters different input then display 'Wrong Input' and get the input again.
Based on the above assumptions write the necessary constructors in the Student class.

Write a class StudentMain with the main method and test the application.  





Sample Input 1:

Enter Student's Id:

12

Enter Student's Name:

John

Enter Student's address:

Chennai

Whether the student is from NIT(Yes/No):

NO

Enter the college name:

SVS



Sample Output 1:

Student id:12

Student name:John

Address:Chennai

College name:SVS*/



package Problems;

import java.util.Scanner;

class Student
{
    private int studentid;
    private String studentName;
    private String studentAdress;
    private String collegeName;
    public int getStudentid() {
        return studentid;
    }
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentAdress() {
        return studentAdress;
    }
    public void setStudentAdress(String studentAdress) {
        this.studentAdress = studentAdress;
    }
    public String getCollegeName() {
        return collegeName;
    }
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    public Student(int studentid, String studentName,String studentAdress)
    {
        this.studentid = studentid;
        this.studentAdress = studentAdress;
        this.studentName = studentName;
        this.collegeName = "NIT";
    }
    public Student(int studentid, String studentName, String studentAdress, String collegeName)
    {
        this(studentid, studentName, studentAdress);
        this.collegeName = collegeName;
    }
}




public  class Student_details
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Students id:");
        int studentid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student's Name:");
        String studentName = sc.nextLine();

        System.out.println("Enteer Student Adress:");
        String studentAdress = sc.nextLine();
        
        while(true){
            System.out.println("Whether the student is from NIT(Yes/No): ");
            String answer = sc.nextLine();
            if(answer.equalsIgnoreCase("yes"))
            {
                Student obj = new Student(studentid, studentName, studentAdress);
                System.out.println("Student id;" + obj.getStudentid());
                System.out.println("Student name:" + obj.getStudentName());
                System.out.println("Adress:" + obj.getStudentAdress());
                System.out.println("College name:" + obj.getCollegeName());
            }
            else if(answer.equalsIgnoreCase("no"))
            {
                System.out.println("Enter the college name:");
                String collegeName = sc.nextLine();
                Student obj = new Student(studentid, studentName, studentAdress, collegeName);
                System.out.println("Student id;" + obj.getStudentid());
                System.out.println("Student name:" + obj.getStudentName());
                System.out.println("Adress:" + obj.getStudentAdress());
                System.out.println("College name:" + obj.getCollegeName());
            }
            else
            {
                System.out.println("Wrong Input");
            }
        }

    }
}
