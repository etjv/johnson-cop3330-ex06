/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Edmund Johnson V
 */

import java.util.Date;
import java.util.Scanner;

/*
Your computer knows what the current year is, which means you can incorporate that into your programs. You just have to figure out how your programming language can provide you with that information.

Create a program that determines how many years you have left until retirement and the year you can retire. It should prompt for your current age and the age you want to retire and display the output as shown in the example that follows.

Example Output
What is your current age? 25
At what age would you like to retire? 65
You have 40 years left until you can retire.
It's 2015, so you can retire in 2055.
Constraints
Again, be sure to convert the input to numerical data before doing any math.
Don’t hard-code the current year into your program. Get it from the system time via your programming language.
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] arg){
        Date d = new Date();
        int year = 1900 + d.getYear();
        int age = getAge();
        int retire = getRetire();
        System.out.println(output(year, age, retire));
    }

    private static Integer yearCalculation(int y, int age, int retire){
        System.out.println("What is your current age?");
        String x = in.nextLine();
        return Integer.parseInt(x.replace(" ", ""));
    }

    private static Integer getAge(){
        System.out.println("What is your current age?");
        String x = in.nextLine();
        return Integer.parseInt(x.replace(" ", ""));
    }

    private static Integer getRetire(){
        System.out.println("At what age would you like to retire?");
        String x = in.nextLine();
        return Integer.parseInt(x.replace(" ", ""));
    }

    private static String output(int y, int a, int r){
        return "You have " + (r - a) + " years left until you can retire. \nIt's " + y + ", so you can retire in " + ((r - a) + y) + ".";
    }
}

