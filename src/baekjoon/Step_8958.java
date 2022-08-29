package EampleTest.src.baekjoon;

public class Step_8958 {
    public static void main(String[] args) {
        String[] n = {"OOXXOXXOOO"
                , "OOXXOOXXOO"
                , "OXOXOXOXOXOXOX"
                , "OOOOOOOOOO"
                , "OOOOXOOOOXOOOOX"};

        final String ANSWER_O = "O";
        final String ANSWER_X = "X";

        for (int b = 0; b < n.length; b++) {
            int j = 0;
            for (int i = 0; i < n[b].length(); i++) {
                String now = n[b].substring(i, i + 1);
                int c = 1;
                int k = 0;
                if (ANSWER_O.equals(now)) {
                    k = c;
                    j += k;
                    c++;
                } else {
                    c = 1;
                }
            }
            System.out.println("정답 : " + j);
        }

    }
}


