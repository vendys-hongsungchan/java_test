package abstractex;

// 추상 클래스
public abstract class Computer {

    // 추상 메서드
    public abstract void display();
    public abstract void typing();

    // public int add(int x, int y) {
        // return x + y;
    // };

    public void turnOn() {
        System.out.println("전원 on");
    }

    public void turnOff() {
        System.out.println("전원 off");
    }
}
