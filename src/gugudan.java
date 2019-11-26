import java.util.Scanner;

public class gugudan {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i < 2) {
            System.out.printf("2 이상 입력해야 합니다.");
            return;
        } else if (i > 9) {
            System.out.println("9 이하 입력해야 합니다.");
            return;
        }

        int[] result = new int[9];

        for (int j = 0; j < 9; j++) {
            result[j] = i*(j+1);
        }

        for (int j = 0; j < 9; j++) {
            System.out.println(result[j]);

        }






    }
}
