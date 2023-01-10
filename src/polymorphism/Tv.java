package EampleTest.src.polymorphism;

public class Tv extends Product{
    boolean power; // 전원 on / off
    int channel;

    void power(){
        power = !power;
        System.out.println("전원 : " + power);
    };

    void channelUp() {
        ++channel;
        System.out.println("채널 : " + channel);
    }

    void channelDown() {
        --channel;
        System.out.println("채널 : " + channel);
    }
}
