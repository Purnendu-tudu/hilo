class OnlySimpleFibo{    
    int no_times ;

    void SimpleFiboPrint(){
        int number_1 = 0 , number_2 = 1 , number_3 ;
        //printing default 
        System.out.print("Fibonaci series: ");
        System.out.print(number_1 + " " + number_2);

        //the fibo loop
        for(int i = 0 ; i < no_times - 2 ; i++){
            number_3 = number_1 + number_2;
            number_1 = number_2 ;
            number_2 = number_3 ;
            //printing the others
            System.out.print(" "+number_3);

        }
        System.out.println("");
        
    }


    void PrimeFiboPrint(){
        //flag set
        int number_1 = 0 , number_2 = 1 , number_3 ;        
        //printing outpt
        System.out.print("Prime Fibonaci Series: ");
        //the fibo loop
        for(int i = 0 ; i < no_times - 2 ; i++){
            int flag = 0;
            number_3 = number_1 + number_2;            
            if(number_3 > 1){                
                for(int j = 2 ; j <= number_3 - 1 ; j++ ){
                    if( number_3 % j == 0){
                        flag = flag+1;
                    }
                }
                if(!(flag > 0)){
                    System.out.print(" "+number_3);
                }
            } 
            number_1 = number_2 ;
            number_2 = number_3 ;           

        }

    }

}



class Fibonaci {
    public static void main(String[] args) {
        //test section 

        OnlySimpleFibo new_fibo_serires = new OnlySimpleFibo();

        new_fibo_serires.no_times = 22; // set the no_times as you need
        new_fibo_serires.SimpleFiboPrint();
        new_fibo_serires.PrimeFiboPrint();

        
    }
}