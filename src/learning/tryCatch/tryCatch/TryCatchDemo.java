package learning.tryCatch.tryCatch;

public class TryCatchDemo {
    public static void main(String[] args) {

        System.out.println("First Display");

        int a = 0 ;
        int b = 10 ;

        try {

            int result = b / a ;
            // if we dont use try-catch the Exception will end our application

        }catch (ArithmeticException e){

            System.out.println("this is ArithmaticException occured");
            // but if we use try-catch even have an Exception the app still process to the end

        }

        System.out.println("Last Display ");


        try {

            String myText = null;
            System.out.println(myText.length()); // Fails because myText is null

        } catch (NullPointerException e) {

            System.out.println("Error: You are trying to use an object that is null!");

        }finally {

            System.out.println(" Even the try section is fail the finally statement still processing.");

        }

        /*

        this is an example there are not only ArithmaticException there are more exception like :
       - NullPoionterException
       - ArrayIndexOutOfBoundsException
       - NumberFormatException ....
         */


    }
}
