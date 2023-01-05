package EampleTest.src.ann;

public class Test01 {

    public static void main(String[] args) {
        System.out.println("A".equals("A"));
        System.out.println("A"=="A");

        String a = "A";
        String b = "A";


        System.out.println(a==b);
        System.out.println(a.equals(b));

        System.out.println("a".hashCode());
        System.out.println(b.hashCode());
        System.out.println(b.hashCode());
    }

}
