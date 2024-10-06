import java.util.Scanner;

public class ComprehensiveIntermediate01_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("整数aを入力してください ＞ ");
        int a = sc.nextInt();

        System.out.print("整数bを入力してください ＞ ");
        int b = sc.nextInt();

        System.out.print("整数cを入力してください ＞ ");
        int c = sc.nextInt();

        int D = b * b - (4 * a * c);

        if (D > 0) {
            System.out.print("2つの実数解");
        } else if (D == 0) {
            System.out.print("重解");
        } else {
            System.out.print("2つの虚数解");
        }
        sc.close();
    }
}
