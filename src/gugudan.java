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

        for (int j = 1; j < 10; j++) {
            System.out.println(i + "*" + j + " 은 " + i * j);
        }


    }
}
