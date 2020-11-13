package aaa;

public class FunctionTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;

        int sum = addNum(num1, num2);
        System.out.println(sum);

        int num3 = 4;
        int num4 = 4;
        sum = plus(num3, num4);
        System.out.println(sum);
    }

    public static int addNum(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public static int plus(int n1, int n2) {
        int result = n1 + (n1 * n2);
        return result;
    }
}
