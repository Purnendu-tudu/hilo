public class Errorarm {
    public static void main(String[] args) {
        int number = 153;
        for (number = 1; number < 999; number++) {
            int number_1 = number;
            int[] num_arr = new int[20];
            int count = 0;
            int i = 0;            
            int sum = 0;
            while (number_1 != 0) {
                int x = number_1 % 10;
                num_arr[i] = x;
                count++;
                i++;
                number_1 = number_1 / 10;
            }
            while (number_1 != 0) {
                int x = number_1 % 10;
                sum = sum + (int) (Math.pow(x, count));
                number_1 = number_1 / 10;
            }
            if (sum == number) {
                System.out.println(sum);
            }

        }

    }
}
