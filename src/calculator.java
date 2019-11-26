import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번쨰 값 입력");
        int a = sc.nextInt();

        System.out.println("두 번쨰 값 입력");
        int b = sc.nextInt();


        System.out.println("덧셈 : " + (a+b));
        System.out.println("뺼셈 : " + (a-b));
        System.out.println("곱셈 : " + (a*b));
        System.out.println("나눗셈 : " + (a/b));

    }
}
