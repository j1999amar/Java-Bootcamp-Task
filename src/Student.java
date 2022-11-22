public class Student {

    int studentAddmissionNo,phone,number;
     String studentName,department,email;

    public int getStudentAddmissionNo() {
        return studentAddmissionNo;
    }

    public int getPhone() {
        return phone;
    }

    public int getNumber() {
        return number;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public Student(int studentAddmissionNo, String studentName, String department,int phone ,String email) {
        this.studentAddmissionNo = studentAddmissionNo;

        this.studentName = studentName;
        this.department = department;
        this.phone=phone;
        this.email = email;


    }
}
