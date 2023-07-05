package Polymorphism;

public class CastingTest2 {
    public static void main(String[] args) {
//        Car car = new Car();
        Car car = new FireEngine(); // FireEngine 타입으로 변경하면 에러 없이 실행됨
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine)car;   // 참조변수 car이 참조하고 있는 인스턴스가 Car타입의 인스턴스라서 실행시 에러 발생
        fe.drive();

        car2 = fe;
        car2.drive();
    }
}
