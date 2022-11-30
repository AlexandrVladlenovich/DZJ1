public class ProstChisla {
    public static void main(String[] args) {
        System.out.print("1 2");
        for (int i = 3; i <= 1000; i++) {
            boolean temp = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    temp = true;
                    break;
                }
            }
            if (temp == false) {
                System.out.printf(" %d", i);
            }
        }
    }
}