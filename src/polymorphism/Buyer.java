package EampleTest.src.polymorphism;

public class Buyer implements orderService{

    int money = 10000; // 소유금액

//    void buy(Tv tv) {
//        money = money - tv.price;
//        System.out.println(money);
//    }
//
//    void buy(Computer computer) {
//        money = money - computer.price;
//        System.out.println(money);
//    }
//
//    void  buy(Audio audio) {
//        money = money - audio.price;
//        System.out.println(money);
//    }

    @Override
    public void buy(Product product) {
        money = money - product.price;
        System.out.println(money);
    }
}
