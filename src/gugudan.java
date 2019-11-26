public class gugudan {
    public static int[] calculate(int num1, int num2) {
        int[] result = new int[num2];

        for (int i = 0; i < num2; i++) {
            result[i] = num1 * (i + 1);
        }

        return result;
    }

    public static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


}
