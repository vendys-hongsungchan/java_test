package array;

public class ArrayTest3 {
    public static void main(String[] args) {
        char[] alpthabets = new char[26];
        char ch = 'A';

        for(int i = 0; i<alpthabets.length; i++, ch++) {
            alpthabets[i] = ch;
        }

        for(int i = 0; i<alpthabets.length; i++, ch++) {
            System.out.println(alpthabets[i]);
        }
    }
}
