package classpart;

public class Student {
    int studentID;
    String studentName;
    int grage;
    String address;

    public Student(int id, String name) {
        studentID = id;
        studentName = name;

    }
    public void showStudentInfor() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String name) {
        studentName = name;
    }
}
