package EampleTest.src.polymorphism;

public class TvMain {

    public static void main(String[] args) {
//        Tv tv = new Tv();
//        CaptionTv c = new CaptionTv();
//
//        tv.power();
//        c.power();
//        System.out.println("=================");
//
//        Tv up = new CaptionTv();
//        up.power();
//        CaptionTv down = (CaptionTv) up;
//        down.power();

        Tv tv = new Tv();
        tv.price = 100;
        Computer com = new Computer();
        com.price = 150;
        Audio au = new Audio();
        au.price = 20;

        Buyer buyer = new Buyer();
        System.out.println(buyer.money);
        buyer.buy(tv);
        buyer.buy(com);
    }

}
