package classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student student_1 = new Student(01, "홍성찬");
        student_1.address = "서울특별시 노원구 하계동";

        Student student_2 = new Student(02, "이지민");
        student_2.address = "서울특별시 성북구 정릉";

        student_1.showStudentInfor();
        student_2.showStudentInfor();

        System.out.println(student_1);
        System.out.println(student_2);
    }
}
