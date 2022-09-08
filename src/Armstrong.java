public class Armstrong {
    public static void main(String[] args){
        int number = 371 , number_1 , remainder , result = 0;
        int length_number = String.valueOf(number).length();
        number_1 = number;
        while(number_1 != 0 ){
            remainder = number_1 % 10;
            result += Math.pow(remainder, length_number);
            number_1 /= 10;
        }
        if(result == number){
            System.out.print("Armstrong Number");
        }else{
            System.out.print("Not An Armstrong Number");
        }

    }
}
