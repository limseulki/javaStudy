package interfaceTest.multipleTest;

// VCR클래스 타입의 참조변수를 멤버변수로 선언하여 IVCR 인터페이스의 추상메서드를 구현하는데 사용
public class TVCR extends Tv implements IVCR {
    VCR vcr = new VCR();

    public void play() {
        vcr.play();
    }
    public void stop() {
        vcr.stop();
    }
    public void reset() {
        vcr.reset();
    }
    public int getCounter() {
        return vcr.getCounter();
    }
    public void setCounter(int c) {
        vcr.setCounter(c);
    }

    public static void main(String[] args) {
        TVCR tvcr = new TVCR();

        System.out.println(tvcr.power);
        tvcr.play();
        tvcr.stop();
        tvcr.reset();
        System.out.println(tvcr.getCounter());
        tvcr.setCounter(3);
        System.out.println(tvcr.getCounter());
    }
}
