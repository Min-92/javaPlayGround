import java.util.Scanner;

public class gugudan {
    public static int[] calculate(int num){
        int[] result = new int[9];

        for(int i = 0; i < 9; i++){
            result[i] = num * (i+1);
        }

        return result;
    }

    public static void print(int[] result){
        for(int i = 0; i < 9; i++){
            System.out.println(result[i]);
        }
    }

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

        int[] result = calculate(i);
        print(result);




    }
}
