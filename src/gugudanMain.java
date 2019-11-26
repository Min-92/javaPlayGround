import java.util.Scanner;

public class gugudanMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        int[] result = gugudan.calculate(i);
        gugudan.print(result);
    }
}