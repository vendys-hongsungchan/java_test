package staticex;

public class StudentTest1 {
    public static void main(String[] args) {

        System.out.println(Student.getSerialNum());

        Student studentA = new Student();
        System.out.println(studentA.getSerialNum());


        Student studentB = new Student();
        System.out.println(studentB.studentID);

    }

}
