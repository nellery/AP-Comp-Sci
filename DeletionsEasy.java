import java.util.Scanner;

public class DeletionsEasy {
    public static void main (String args[]) {
        char greatest;
        int newGreatest;
        int moves=0;
        String newStr="";
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the string of numbers to play with.");
        String str = scan.nextLine();
        str=str.replace(", ","");
        while (!str.equals("")) {
            if (str.contains("0")) {
                str=removeZeros(str);
                moves++;
            }
            if (str.equals("")) {
                break;
            }
            greatest=findGreatest(str);
            int location = str.lastIndexOf(Character.toString(greatest));
            if (greatest % 2==0) {
                newGreatest = Character.getNumericValue(greatest)-2;
                newStr = str.substring(0,location) + newGreatest + str.substring(location+1);
            }
            else {
                newGreatest = Character.getNumericValue(greatest)-1;
                newStr = str.substring(0,location) + newGreatest + str.substring(location+1);
            }
            str=newStr;
            moves++;
        }

        System.out.println("It took " + moves + " moves to delete all the digits.");
    }

    public static String removeZeros(String str) {
        int len=str.length();

        for (int i=0; i<len; i++) {
            if (i<str.length() && str.charAt(i)=='0') {
                str=str.substring(i+1);
                i=0;
            }
        }

        return str;
    }

    public static char findGreatest(String str) {
        char max=0;

        str=str.replace(",","");
        for(int i=0; i<str.length();i++) {
            if (str.charAt(i)>=max) {
                max=str.charAt(i);
            }
        }
        //return mostFrequent;
        return max;
    }
}
