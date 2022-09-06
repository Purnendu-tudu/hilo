class Pyramids{
    //here row is varible we will determine it at main test section
    int no_of_row;


    void IncreasingPyramid(){
        System.out.println("IncreasingPyramid: ");
        for(int rows = 1 ; rows < no_of_row ; rows++){
            for(int stars = 0 ; stars < rows; stars++){ // for first row we print 1 star then continue as row increse star increse
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void DecreasingPyramid(){
        System.out.println("DecreasingPyramid: ");
        for(int rows = 1; rows < no_of_row ; rows++){
            for(int stars = rows ; stars < no_of_row ; stars++){
                System.out.print("* ");
            }            
            System.out.println();
        }
    }

    void LowerRightPyramid(){
        for(int rows = 1 ; rows < no_of_row ; rows++){ //this line for row print
            //now for each row we will print space and star
            for(int space = rows ; space < no_of_row ; space++){
                System.out.print("  "); //here is 2 space [imp]
            }
            
            //now for stars print
            for(int stars = 0 ; stars < rows ; stars++){
                
                System.out.print("* ");//here also need 2 thing for 2 space[imp]
            }
            //now for new line we will need println[imp]
            System.out.println();

        }
    }
}



class triAngles{
    public static void main(String[] args) {
        System.out.println("printing pyraminds");
        
        //test section
        //initialize a new pyramd here
        Pyramids pyramid_1 = new Pyramids();

        //set the pyramid row;
        pyramid_1.no_of_row = 8;

        //call the pyramid_method
        pyramid_1.LowerRightPyramid();
        pyramid_1.IncreasingPyramid();
        pyramid_1.DecreasingPyramid();
    }
}