package EampleTest.src.polymorphism;

public class CaptionTv extends Tv{
    String text;

    void caption() {
        System.out.println("캡션 : " + this.text);
    }

}
