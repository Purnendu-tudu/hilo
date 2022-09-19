//what is wrong with this program? Lets find out
public class Errorarm {
    public static void main(String[] args) {
        int number;
        for(number = 1 ; number < 999 ; number++){
            int backup_of_number = number;
            int[] num_array = new int[20];
            int count = 0;
            int sum = 0;
            int x;

            while(number !=0){
                x = number % 10;
                num_array[count] = x;
                number /= 10;
                count++;
            }
            //1st checking count var
            //System.out.print(count); //this line give us unlimited 1's as result

            for(int j = 0 ; j < count ; j++){
                sum += Math.pow(num_array[j], count);
                //System.out.println(sum); //sum is also giving lots of 1's as result

                //2nd checking the array 
                //System.out.println(num_array[j]); // this line also give us unlimited 1's as result
            }
            if(sum==backup_of_number){
                System.out.println(backup_of_number);
                
            }
            sum = 0;
        }
    }
}
