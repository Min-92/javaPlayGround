import java.util.Scanner;

public class gugudanMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] splitValue = str.split(",");

        int a = Integer.parseInt(splitValue[0]);
        int b = Integer.parseInt(splitValue[1]);

        int[] result = gugudan.calculate(a,b);
        gugudan.print(result);
    }
}