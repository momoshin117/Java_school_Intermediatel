public class ComprehensiveIntermediate01_05 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int x = i * j;
                if (x < 10) {
                    System.out.print("  " + x);
                } else {
                    System.out.print(" " + x);
                }
            }
            System.out.println();
        }
    }
}
