import java.util.Scanner;

public class DeletionsHard {
    public static void main (String args[]) {
        char mostFreq;
        int newFreq;
        int moves=0;
        String newStr="";
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the string of numbers to play with.");
        String str = scan.nextLine();
        str=str.replace(", ","");
        while (!str.equals("0")) {
            str=removeZeros(str);
            moves++;
            mostFreq=findMostFreq(str);
            int location = str.lastIndexOf(Character.toString(mostFreq));
            if (mostFreq % 2==0) {
                newFreq = Character.getNumericValue(mostFreq)-2;
                newStr = str.substring(0,location) + newFreq + str.substring(location+1);
            }
            else {
                newFreq = Character.getNumericValue(mostFreq)-1;
                newStr = str.substring(0,location) + newFreq + str.substring(location+1);
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

    public static char findMostFreq(String str) {
        int count=0;
        char mostFrequent='0';
        int max=0;

        str=str.replace(",","");
        for(int i=0; i<str.length();i++) {
            count=0;
            for (int j=i+1;j<str.length();j++) {
                if (str.charAt(j)==str.charAt(i)) {
                    count++;;
                }
            }
            if (count>=max) {
                max=count;
                mostFrequent=str.charAt(i);
            }
        }
        return mostFrequent;
    }
}
