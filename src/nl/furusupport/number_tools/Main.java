package nl.furusupport.number_tools;

import java.util.Scanner;

public class Main {

    /*this little piece of code is designed to generate a positive integer which you can use as an unique ID. I designed
      I designed it to make life a little simpler, so hopefully it can help you to!

TODO build a little checker to make sure every generated ID is unique. perhaps with a list of unique numbers.

     */
    static Randomnator idGenerator;
    static Integer newID;
    static Integer idCount;
    static Scanner inputScan;

    public static void main(String[] args) {

        System.out.println();

        //Generate one ID
        idGenerator = new Randomnator();
        newID = idGenerator.RandomnizerInt();
        System.out.println("Your random IDno. = " + newID);

        //Enter an integer to generate multiple ID's':
        inputScan = new Scanner(System.in);
        System.out.println("\n\nHow many ID's do you need?");
        idCount = inputScan.nextInt();

        for (int i = 0; i < idCount; i++) {
            newID = idGenerator.RandomnizerInt();
            System.out.println("Your random IDno. = " + newID);
        }




    }
}
