package EampleTest.src.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cart {

    List<String> cartList;

    public Cart() {
        this.cartList = new ArrayList<>();
    }

    void addCart(String productName) {
        cartList.add(productName);
        System.out.println("상품추가 : " + productName);
    }

    void removeCart(String productName) {
        if(Boolean.FALSE.equals(Objects.isNull(cartList))) {
            cartList.removeIf(e -> productName.equals(e));
            cartList.forEach(e -> System.out.println(e));
        } else {
            System.out.println("장바구니에 상품이 없습니다.");
        }
    }

}
