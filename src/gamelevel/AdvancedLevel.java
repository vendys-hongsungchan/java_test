package gamelevel;

public class AdvancedLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("빨리 달림");
    }

    @Override
    public void jump() {
        System.out.println("높이 점프함");
    }

    @Override
    public void turn() {
        System.out.println("턴 할 줄 모름");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("중급자 레벨");
    }
}
