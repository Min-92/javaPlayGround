import java.util.Scanner;

public class gugudanMain {
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
        int[] result = gugudan.calculate(i);
        gugudan.print(result);
    }
}