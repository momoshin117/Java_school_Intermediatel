import java.util.Scanner;

public class ComprehensiveIntermediate01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("人数を入力してください ＞ ");
        int count = sc.nextInt();

        int price;

        if (count < 5) {
            price = 600;
        } else if (count >= 20) {
            price = 500;
        } else {
            price = 550;
        }

        System.out.print("合計の入場料金は、" + Multiplication(count, price) + "円です。");
        sc.close();
    }

    private static int Multiplication(int x, int y) {
        return x * y;
    }
}
