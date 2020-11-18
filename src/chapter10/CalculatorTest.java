package chapter10;

public class CalculatorTest {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 2;

        Calc calc = new CompleteCalc();

        System.out.println(calc.add(n1, n2));
    }
}
