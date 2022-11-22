import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int studentAddmissionNo,phone;
    static String studentName,department,email;
    static int opt;
    static Student s;
    static ArrayList<Student> studentArrayList=new ArrayList<Student>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.println("Student App");
            System.out.println("1 : Add Student\n" +
                    "2 : View Student\n" +
                    "3 : Search the Student\n"+
                    "4 : Delete the Student\n"+"" +
                    "5 : Exit ");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("enter the addmission number");
                    studentAddmissionNo= sc.nextInt();
                    System.out.println("enter the name");
                    studentName = sc.next();
                    System.out.println("enter the department");
                    department = sc.next();
                    System.out.println("enter the phone");
                    phone = sc.nextInt();
                    System.out.println("enter the email ");
                    email = sc.next();
                    studentArrayList.add(new Student(studentAddmissionNo,studentName,department,phone,email));



                    break;

                case 2:

                    System.out.println("Student List");
                    for(Student s : studentArrayList)
                    {
                        System.out.println("Student Addmission no :"+s.studentAddmissionNo);
                        System.out.println("Studene Name :"+s.studentName);
                        System.out.println("Department :"+s.department);
                        System.out.println("Phone "+s.phone);
                        System.out.println("Email"+s.email);

                    }
                    break;

                case 3:

                    System.out.println("enter the id");
                    int id = sc.nextInt();

                    for(Student s : studentArrayList)
                    {
                        if(id == s.studentAddmissionNo)
                        {
                            System.out.println("Student Addmission no :"+s.studentAddmissionNo);
                            System.out.println("Studene Name :"+studentName);
                            System.out.println("Department :"+s.department);
                            System.out.println("Phone "+s.phone);
                            System.out.println("Email"+s.email);
                        }
                    }
                    break;

                case 4:

                    System.out.println("enter the Addmission");
                    int idd = sc.nextInt();


                    for(Student index : studentArrayList)
                    {
                        if(idd == index.studentAddmissionNo)
                        {
                           s= index;

                        }

                    }
                    studentArrayList.remove(s);
                case 5:
                    System.exit(0);

            }
        }
    }
}