package learning.tryCatch.tryCatch;

public class Demo {
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


    }
}
