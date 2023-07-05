package interfaceTest.fighterTest;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if(f instanceof Unit)
            System.out.println("f는 Unit 자손");
        if(f instanceof Fightable)
            System.out.println("f는 Fightable인터페이스 구현");
        if(f instanceof Movable)
            System.out.println("f는 Movable인터페이스 구현");
        if(f instanceof Attackable)
            System.out.println("f는 Attackable인터페이스 구현");
        if(f instanceof Object)
            System.out.println("f는 Object자손");
    }
}
