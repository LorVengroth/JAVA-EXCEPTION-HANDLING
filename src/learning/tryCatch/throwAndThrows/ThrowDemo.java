package learning.tryCatch.throwAndThrows;

import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age to join the club party : ");
        int age = scanner.nextInt();

        if(age < 18){

            throw new IllegalArgumentException("the age is too young");

        }else {

            System.out.println("You are adult you are agree to join the party ");
        }


    }
}
