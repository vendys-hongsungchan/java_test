package template;

public class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("자율 주행");
        System.out.println("자동차스스로 방향 전환");
    }

    @Override
    public void stop() {
        System.out.println("자동차 스스로 멈춤");
   }

    @Override
    public void wiper() {
        System.out.println("비나 눈의 양에 따라 자동으로 조절됩니다.");

    }
}
