import java.util.Scanner;

public class ComprehensiveIntermediate01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("整数を入力してください ＞ ");
        int inputNum = sc.nextInt();

        switch (inputNum % 2) {
            case 0:
                System.out.print("even");
                break;

            case 1:
                System.out.print("odd");
                break;
        }
        sc.close();
    }
}
