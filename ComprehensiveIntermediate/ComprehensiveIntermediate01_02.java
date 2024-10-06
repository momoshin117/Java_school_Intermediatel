import java.util.Scanner;

public class ComprehensiveIntermediate01_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputAraay = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("整数を入力してください ＞ ");
            inputAraay[i] = sc.nextInt();
        }

        for (int i = 0; i < 2; i++) {
            if (inputAraay[i] <= inputAraay[i + 1]) {
                if (i == 1) {
                    System.out.print("OK");
                }
            } else {
                System.out.print("NG");
                break;
            }
        }
        sc.close();
    }
}
