package codestates;

public class Car {
    public String model; // 필드 선언
    public String color;

    public Car(String model, String color) { // 인스턴스 초기화를 위한 생성자 함수. 이후 챕터에서 학습 예정.
        this.model = model;
        this.color = color;
    }

    public void power() { // 메서드 선언
        System.out.println("시동을 걸었습니다.");
    }

    public void accelerate() {
        System.out.println("더 빠르게!");
    }

    public void stop(){
        System.out.println("멈춰!!");
    }
}