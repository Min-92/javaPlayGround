public class gugudan {
    public static int[] calculate(int num) {
        int[] result = new int[num];

        for (int i = 0; i < num; i++) {
            result[i] = num * (i + 1);
        }

        return result;
    }

    public static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


}
