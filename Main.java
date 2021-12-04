package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userInput == computerInput){
            System.out.println("Result ---> Draw.");
        }
        else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1){
            System.out.println("Result ---> You Win.");
        }
        else{
            System.out.println("Result ---> Computer Win.");
        }

        System.out.println();

        if(userInput == 0){
            System.out.println("Your choice ---> Rock.");
        }
        else if(userInput == 1){
            System.out.println("Your choice ---> Paper.");
        }
        else if(userInput == 2){
            System.out.println("Your choice ---> Scissor.");
        }

        if(computerInput == 0){
            System.out.println("Computer choice ---> Rock.");
        }
        else if(computerInput == 1){
            System.out.println("Computer choice ---> Paper.");
        }
        else if(computerInput == 2){
            System.out.println("Computer choice ---> Scissor.");
        }

    }
}
