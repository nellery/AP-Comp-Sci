
public class LongestPalindrome
{
    static String b="";
    public static void main (String args[]) {
        findPalindrome("cool racecars are happy");
    }
    public static void findPalindrome(String a) {
        reverseString(a);
        findCommon(a,b);
    }
    public static void reverseString(String a) {
        char[] in = a.toCharArray();
        int start=0;
        int end=in.length-1;
        char temp;
        while (end>start) {
            temp=in[start];
            in[start]=in[end];
            in[end]=temp;
            end--;
            start++;
        }
        b = new String(in);
    }
    public static void findCommon(String a, String b) {
        int count=0;
        int max=0;
        String longest="";
        a=a.toLowerCase();
        b=b.toLowerCase();
        for (int i=0;i<a.length();i++) {
            for (int j=0;j<b.length();j++) {
                count=0;
                while (j+count<b.length() && 
                       i+count<a.length() && 
                       b.charAt(j+count)==a.charAt(i+count)) {
                    count++;
                    //System.out.println("i is " + i);
                    //System.out.println("j is " + j);
                    //System.out.println("count is " + count);
                }
                if (count>=max) {
                    longest = a.substring(i,Math.min(i+count,a.length()));
                    max=count;
                    //System.out.println("Maximum is now " + max);
                }
            }
        }
        System.out.println(longest);
    }
}


