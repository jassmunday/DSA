interface tvRemote{
    void tvChannels();
        };
interface smartTvRemote extends tvRemote{
     void openYoutube();
     void openAmazon();
};
class remote implements smartTvRemote{
    @Override
    public void tvChannels() {
        System.out.println("you can watch tv channels");
    };
    public void openYoutube() {
        System.out.println("you can watch youtube");

    };
    public void openAmazon() {
        System.out.println("you can watch amazon");
    };
}



public class java60interfaces {
    public static void main(String[] args) {
        System.out.println();
        remote r1 = new remote();
        r1.tvChannels();

    }
}
