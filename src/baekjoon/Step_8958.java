package EampleTest.src.baekjoon;

public class Step_8958 {
    public static void main(String[] args) {
        String[] n = {"OOXXOXXOOO"
                , "OOXXOOXXOO"
                , "OXOXOXOXOXOXOX"
                , "OOOOOOOOOO"
                , "OOOOXOOOOXOOOOX"};

        for (int k = 0; k < n.length; k++) {
            int j = 0;
            int c = 1;
            for (int i = 0; i < n[k].length(); i++) {
                if ("X".equals(n[k].substring(i, i + 1))) {
                    c = 1;
                } else {
                    j += c;
                    c++;
                }
            }
            System.out.println(j);
        }
    }
}


