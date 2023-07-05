package polymorphism.bindingTest;

public class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();

        // 멤버변수가 조상 클래스와 자손 클래스에 중복으로 정의된 경우, 참조변수 타입에 따라 달라진다.
        // 메서드의 경우 항상 실제 인스턴스의 메서드(오버라이딩된 메서드)가 호출됨
    }
}
