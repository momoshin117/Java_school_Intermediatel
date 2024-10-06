import java.util.Scanner;
import java.util.Random;

public class ComprehensiveIntermediate02_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int computer = r.nextInt(3);

        System.out.println("ジャンケン");
        System.out.print("0:グー 1:チョキ 2: パー ＞数字を入力してください");
        int inputNum = sc.nextInt();

        while (inputNum < 0 || 2 < inputNum) {
            System.out.println("0,1,2以外の数字が入力されたため、エラーが発生しました。");
            System.out.println("ジャンケン");
            System.out.print("0:グー 1:チョキ 2: パー ＞数字を入力してください");
            inputNum = sc.nextInt();
        }

        switch (inputNum) {
            case 0:
                switch (computer) {
                    case 0:
                        System.out.println("あいこです。");
                        break;
                    case 1:
                        System.out.println("勝ちです。");
                        break;
                    case 2:
                        System.out.println("負けです。");
                        break;
                }
                break;
            case 1:
                switch (computer) {
                    case 1:
                        System.out.println("あいこです。");
                        break;
                    case 2:
                        System.out.println("勝ちです。");
                        break;
                    case 0:
                        System.out.println("負けです。");
                        break;
                }
                break;
            case 2:
                switch (computer) {
                    case 2:
                        System.out.println("あいこです。");
                        break;
                    case 0:
                        System.out.println("勝ちです。");
                        break;
                    case 1:
                        System.out.println("負けです。");
                        break;
                }
                break;
        }
        sc.close();
    }
}