package Main;

import InputUtil.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int year = InputUtil.InputInt("Enter a year: ", "You must enter a year on the format 'XXXX'", sc);
        if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) //Year is either divisible by 4 or divisible by 400 and not 100
        {
            System.out.println("The year " + Integer.toString(year) + " is a leap year.");
        }
        else
        {
            System.out.println("The year " + Integer.toString(year) + " is not a leap year.");
        }
    }
}