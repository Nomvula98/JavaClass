
import java.text.ParseException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        System.out.println("--------------------1. Decimals---------------------------------");
        //Check for decimals
        System.out.println("Enter a value: ");
        Scanner sc4 = new Scanner(System.in);
        String inputValue = sc4.next();
        Float value = Float.parseFloat(inputValue);
        //Create an object and invoke the checkDecimal method which has 1 Parameter
        DecimalCheck dc = new DecimalCheck();
        dc.checkDecimal(inputValue);

        System.out.println("---------------------2. DOB-------------------------------------");
        //Date of birth
        System.out.println("Enter your date of birth in this format: yyyy/mm/dd ");
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("/");
        String dateString = scanner.nextLine();
        //Create an object and invoke the daysLived method which has 1 Parameter
        DateOfBirth dob = new DateOfBirth();
        dob.daysLived(dateString);

        System.out.println("-----------------3. Reverse a String---------------------------");
        //Reverse a String
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String tempStr="";
        String newStr = "";
        //Create an object and invoke the reverseString method which has 3 Parameters
        ReverseWord rw = new ReverseWord();
        rw.reverseString(input, tempStr, newStr);

    }
}
