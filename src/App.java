class triAngles{
    public static void main(String[] args) {
        System.out.println("printing pyraminds");
        int row_1 = 5;
        for(int i = 0 ; i < row_1 ; i++){
            for(int j = i ; j < row_1 ; j++){
                System.out.print("  ");
            }
            for(int j = 0 ; j < i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}