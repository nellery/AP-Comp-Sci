public class MostFrequent {
    public static void main (String args[]) {
        findMostFreq("0011");
    }

    public static void findMostFreq(String str) {
        int count=0;
        char mostFrequent='h';
        int max=0;
        
        for(int i=0; i<str.length();i++) {
            count=0;
            for (int j=i+1;j<str.length();j++) {
                if (j+count<str.length() && 
                    i+count<str.length() &&
                    str.charAt(j)==str.charAt(i)) {
                    count++;
                }
                if (count>max) {
                    max=count;
                    mostFrequent=str.charAt(j);
                }
                else if (count==max) {
                    if(str.charAt(j)>Integer.parseInt(Character.toString(mostFrequent))) {
                        mostFrequent=str.charAt(j);
                    }
                }
                }
            }
            System.out.println(mostFrequent);
        }
    }
