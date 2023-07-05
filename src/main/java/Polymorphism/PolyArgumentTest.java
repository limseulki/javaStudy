package Polymorphism;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("잔액 : " + b.money);
        System.out.println("보너스점수 : " + b.bonusPoint);
    }
}
