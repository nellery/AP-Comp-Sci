import java.io.*;
//compares the distance between each letter in two same-length words
public class AlphabetDistances
{
    public static void main (String arg[])throws Exception {
        //setting up the reader of the given file
        BufferedReader fin;
        fin = new BufferedReader(new FileReader ("README.TXT"));
        String word1 = "";
        String word2 = "";
        //figuring out how many times to do it
        String line = fin.readLine();
        int itt = Integer.parseInt(line);
        line = fin.readLine();
        //interating through the lines and words to print the distances
        for (int i=0;i<itt;i++) {
            word1 = line.substring(0, line.indexOf(' '));
            word2 = line.substring(line.indexOf(' ')+1);
            System.out.println("Distance: " + findDistances(word1,word2));
            line = fin.readLine();
        }
    }
    
    public static String findDistances(String w1, String w2) {
        String result="";
        int dist;
        //iterates through the first word
        for (int i=0;i<w1.length();i++) {
            //define let1 and let2 as the letters at point i in the words
            String let1 = Character.toString(w1.charAt(i));
            String let2 = Character.toString(w2.charAt(i));
            if (let1.compareTo(let2)<=0) {
                dist=Math.abs(let1.compareTo(let2));
            }
            else {
                dist= 26-let1.compareTo(let2);
            }
            result+=dist+" ";
        }
        return result;
    }
}
