package template;

public class ManualCar extends Car{

    @Override
    public void drive() {
        System.out.println("사람이 운전");
        System.out.println("사람이 핸들 조작");
    }

    @Override
    public void stop() {
        System.out.println("사람이 브레이크로 정지");
    }

    @Override
    public void wiper() {
        System.out.println("사람이 수동으로 와이퍼를 조작합니다.");

    }
}
