public class Armstrong_2 {
    public static void main(String[] args) {
        int number = 0 ;
        for(int i = 1 ; i <= 999 ; i++){
            int remainder, result = 0;
            number= i;
            //System.out.println(number);
            int number_length = String.valueOf(number).length();
            //System.out.println(number_length+" len");
            while(number > 0){
                remainder = number% 10;
                result += (int)Math.pow(remainder , number_length);
                number /= 10;
            }
            //System.out.println(result+ " num " + number);
            if(result == i){
                System.out.print(i+" ");                
            }       
                      
        }
    }
}
