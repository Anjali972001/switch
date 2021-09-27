package Demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


               Scanner input = new Scanner(System.in);
               System.out.println("Enter the name of any one fruit ");
                String fruit=input.next();


                switch (fruit) {
                   case "Mango" -> System.out.println("Mango is king of all fruits .");
                   case "Apple" -> System.out.println("One apple a day keeps doctor away.");
                   case "Banana" -> System.out.println("Banana is good for health. ");
                   default -> System.out.println("Please enter a valid fruit .");
                }
           }
    }

