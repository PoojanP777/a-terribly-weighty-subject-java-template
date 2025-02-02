package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    // Welcome prompt
    System.out.println("Welcome to the Ounce Conversion Program!");

      try (Scanner scanner = new Scanner(System.in)) {
          int ounces;
          
          // Prompt the user for input and validate it
          while (true) {
              System.out.print("How many ounces do you have? ");
              String input = scanner.nextLine();
              
              try {
                  ounces = Integer.parseInt(input);
                  if (ounces < 0) {
                      System.out.println("Your input should be a positive number. Please try again.");
                  } else {
                      break; // Valid input
                  }
              } catch (NumberFormatException e) {
                  System.out.println("That is not a number! Please enter the number of ounces.");
              }
          }
          
          System.out.println("Thank you! Converting ounces to pounds.");
          
          // Create a Converter object and perform conversions
          Converter converter = new Converter();
          System.out.println(ounces + " oz is equivalent to " + converter.toPoundsAndOunces(ounces) + ".");
          System.out.println(ounces + " oz is equivalent to " + converter.toPounds(ounces) + ".");
          
          // Exit message
          System.out.println("Thank you for using the OCP!");
      }
  }
}

