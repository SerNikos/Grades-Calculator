//This program calculates the average number of some uni lessons (as many as the user wants)
//The user must give studnt's id then the lesson's name and the grade and so on..
//if the studen's id is '000000' the program terminates

import java.util.Scanner;
import static java.lang.System.exit;

public class Grades {

    public static void main(String[] args) {
        String STUD_ID;
        float sum = 0;
        int total_lessons = 0;
        boolean flag = true;

        Scanner input = new Scanner(System.in); //We create a Scanner object "input"
        do { // infinite loop that breaks only if the program terminates

            System.out.println("Please give me the Student's data:");

            STUD_ID = input.next(); //We read the user's input

            if (STUD_ID.equals("000000")) // If the student's id is '000000' the program will be terminated
            {
                break; // we break the do-while loop an the program terminates

            } else //if the student's id is NOT '000000'
            {
                String string = ""; //we create a String
                do {
                    string = input.next(); //we fill the String with User's input

                    if (string.equals("end")) { //we could also use the .matches method intead pf equals
                        break;
                    }

                    total_lessons ++; //we add one more lesson

                    sum += input.nextFloat(); //we read the next grade
                } while (flag); //while(true)

                System.out.println("The average number is: " + sum / total_lessons); //we divide the Grade addition to total lessons number to find the average
            }

        } while (flag); 
    }
}




