package inheritance;

public class CaptionTvTest {
    public static void main(String[] args) {
        // 자손 클래스의 인스턴스를 생성하면 조상 클래스의 멤버도 생성되기 때문에
        // 따로 조상 클래스의 인스턴스를 생성하지 않아도 조상 클래스의 멤버 사용 가능
        CaptionTv captionTv = new CaptionTv();

        captionTv.channel = 10;
        captionTv.channelUp();
        System.out.println("channel : " + captionTv.channel);

        captionTv.displayCaption("before: Hello new world");
        // caption이 true가 되어야 자막이 출력된다.
        captionTv.caption = true;
        captionTv.displayCaption("after: Hello new world");
    }
}
