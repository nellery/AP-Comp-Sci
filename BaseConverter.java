import java.util.Scanner;

public class BaseConverter
{
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        String result="";
        System.out.println("Please enter an integer in base ten that you want to convert.");
        double input = scan.nextInt();
        double res=input;
        System.out.println("Enter a base that you want to convert the number to.");
        int base = scan.nextInt();
        while (input>0) {
            int exp = 1;
            int count=0;
            while (exp <= input/base) {
                exp = exp*base;
                System.out.println("exp is now " + exp);
            }
            if (input-exp<0) {
                result=result+"0";
                System.out.println("I entered the if loop!");
            }
            while (input-exp>=0) {
                res = input-exp;
                System.out.println("input is now " +input);
                count++;
                System.out.println("count: " + count);
            }
            result=result+count;
        }
        

        System.out.println("result is " + result);
    }
}
