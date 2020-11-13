package reference;

public class StudentTest {

    public static void main(String[] args) {

        Student student_01 = new Student(1, "chan");
        student_01.setKorea(100);
        student_01.setMath(100);

        Student student_02 = new Student(2, "min");
        student_02.setKorea(80);
        student_02.setMath(60);

        student_01.showStudentInfo();
        student_02.showStudentInfo();
    }
}
