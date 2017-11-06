import java.util.Scanner;

public class LeapYear
{
    public static void main (String args[]) {
        checkYear();
    }
    public static void checkYear() {        
        boolean leap=false;
        int year=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the year you wish to check.");
        year = scan.nextInt();
        while (year<1582) {
            System.out.println("Please input a year greater than 1582.");
            System.out.println("Please enter the year you wish to check.");
            year = scan.nextInt();
        }
        if (year%4==0) {
            if (year%100==0 && year%400!=0) {
                leap=false;
            }
            else {
                leap=true;
            }
        }       
        if (leap) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
