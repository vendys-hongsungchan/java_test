package gamelevel;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("겁나 빨리 뜀");
    }

    @Override
    public void jump() {
        System.out.println("겁나 높이 점프함");
    }

    @Override
    public void turn() {
        System.out.println("한 바퀴돔");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("고급 레벨");
    }
}
