import java.util.Scanner;
import java.util.Random;

public class ComprehensiveIntermediate02_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ゾロ目で大当たり！チャンスは30回");
        System.out.print("beginと入力してください ＞ ");
        String a = sc.nextLine();

        if (a.equals("begin")) {
            Random r = new Random();
            int[] arr = new int[3];

            int count = 0;

            for (int i = 1; i <= 30; i++) {
                for (int j = 0; j <= 2; j++) {
                    arr[j] = r.nextInt(9) + 1;
                }
                System.out.println(i + "回目" + arr[0] + arr[1] + arr[2]);

                if (arr[0] == arr[1]) {
                    if (arr[0] == arr[2]) {
                        System.out.println(i + "回目で大当たりです。おめでとうございます！");
                        count++;
                        break;
                    }
                }

            }
            if (count == 0) {
                System.out.println("残念でした。終わります。");
            }

        }
        sc.close();
    }
}