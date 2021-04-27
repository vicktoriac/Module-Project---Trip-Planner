import java.util.Scanner;

public class TesterTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greeting(input);
        printSeparator();
        timeAndBudget(input);
        printSeparator();
        timeAndDifference(input);
        printSeparator();
        countryArea(input);
        printSeparator();
        input.close();

    }
    public static void greeting(Scanner input){
        System.out.println("Welcome to Vacation Planner!");
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Nice to meet you " + name + ",where are you traveling to?");
        String country = input.nextLine();
        System.out.println("Great!" + country + "sounds like a great trip");

    }
    public static void timeAndBudget(Scanner input){
        System.out.println("How many days are you going to be traveling?");
        int days = input.nextInt();
        System.out.println("How much money, in USD, are you planning to spend on your trip?");
        int usd = input.nextInt();
        System.out.println("What is the three letter currency symbol for travel destination?");
        String symbol = input.nextLine();
        System.out.println("How many" + symbol + "are there in 1 usd?");
        double conversion = input.nextDouble();
        System.out.println();
        int hours = days * 24;
        int minutes = hours * 60;
        System.out.println("If you are travelling for" + days + "days, that is same as " + hours + "hours" + "or"+ minutes + "minutes.");
        double perDay = usd / (1.0 * days);
        System.out.println("if you are going to spend $" + usd + "USD, that means per day you can spend up to $" + truncate2Decimal(perDay) + "USD.");
        double converted = usd * conversion;
        double perDayConverted = usd * conversion / days;
        System.out.println("Your total budget in " + symbol + " is " + converted + " " + symbol + ", which " +
                "per day is " + truncate2Decimal(perDayConverted) + " " + symbol + "." );

    }

    public static void timeAndDifference(Scanner input){
        System.out.print("What is the time difference, in hours, between you home and your destination? ");
        int timeDiff = input.nextInt();
        System.out.println("That means that when it is midnight at home it will be " + (24 + timeDiff) % 24 + ":00 in" +
                " your travel destination and when it is noon at home it will be " + (12 + timeDiff) % 24 + ":00");

    }

    public static void countryArea(Scanner input) {
        System.out.print("What is the square area of your destination country in km2? ");
        double km2 = input.nextDouble();
        double miles2 = km2 / 2.58999;
        System.out.print("In miles2 that is " + truncate2Decimal(miles2));
    }

    public static void printSeparator(){
        System.out.println("*********************");
        System.out.println("");
        System.out.println("");
    }

    public static Double truncate2Decimal(Double num){
        return (int)(num*100)/100.0;
    }

}
