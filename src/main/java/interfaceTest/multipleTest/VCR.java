package interfaceTest.multipleTest;

public class VCR {
    protected int counter;
    public void play(){
        System.out.println("vcr play");

    }
    public void stop(){
        System.out.println("vcr stop");
    }
    public void reset(){
        counter = 0;
    }
    public int getCounter() {
        return counter;
    }
    public void setCounter(int c) {
        counter = c;
    }
}
