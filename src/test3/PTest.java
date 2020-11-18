package test3;

public class PTest {
    public static void main(String[] args) {

        int n1 = 20;
        int n2 = 2;
        int n3 = 10;

        Person person = new P();
        System.out.println("나이" + person.addage(n1, n2));
        System.out.println("걸음" + person.step(n3));
    }
}
