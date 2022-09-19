class fibonacciprime {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int num3;
        int ns = 20;

        // System.out.print(num1 + " " + num2);

        for (int i = 0; i < ns - 2; i++) {
            num3 = num1 + num2;
            int flag = 0;
            if (num3 > 1) {
                for (int j = 2; j < num3 - 1; j++) {
                    if (num3 % j == 0) {
                        flag = flag + 1;
                    }
                }
                if (flag == 0) {
                    System.out.print(" " + num3);
                }

            }

            num1 = num2;
            num2 = num3;
        }
    }
}
