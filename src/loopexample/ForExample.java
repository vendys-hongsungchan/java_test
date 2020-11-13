package loopexample;

public class ForExample {
    public static void main(String[] args) {
        int num;
        int sum = 0;

        // ( ; ; ) -> 무한 루프
        for(num = 1, sum = 0; num <= 10; num++) {
            sum += num;
        }

        int dan = 2;
        int times = 1;

        // for(dan = 2; dan <= 9; dan++) {
        while(dan <= 9) {
            // for(times = 1; times <= 9; times++) {
            if( (dan % 2) != 0) {
                dan++;
                continue;
            }
            times = 1;
            while(times <= 9) {
                if(times > dan) break;
                System.out.println(dan + "X" + times + "=" + dan*times);
                times++;
            }
            dan++;
            System.out.println();
        }

        System.out.println(sum);
        System.out.println(num);
    }
}
