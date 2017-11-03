public class MostFrequent {
    public static void main (String args[]) {
        findMostFreq("3,4,2,6,6,6,2,0,2");
    }

    public static void findMostFreq(String str) {
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
            if (count>max) {
                max=count;
                mostFrequent=str.charAt(i);
            }
            else if (count==max) {
                if(str.charAt(i)>=Integer.parseInt(Character.toString(mostFrequent))) {
                    mostFrequent=str.charAt(i);
                }
            }
        }
        System.out.println(mostFrequent);
    }
}
