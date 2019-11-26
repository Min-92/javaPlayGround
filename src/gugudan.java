public class gugudan {
    public static int[] calculate(int num) {
        int[] result = new int[9];

        for (int i = 0; i < 9; i++) {
            result[i] = num * (i + 1);
        }

        return result;
    }

    public static void print(int[] result) {
        for (int i = 0; i < 9; i++) {
            System.out.println(result[i]);
        }
    }


}
