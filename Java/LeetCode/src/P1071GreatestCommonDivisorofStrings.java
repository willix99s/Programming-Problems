// For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
//
//Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
//
//
//
//Example 1:
//
//Input: str1 = "ABCABC", str2 = "ABC"
//Output: "ABC"
//Example 2:
//
//Input: str1 = "ABABAB", str2 = "ABAB"
//Output: "AB"
//Example 3:
//
//Input: str1 = "LEET", str2 = "CODE"
//Output: ""

public class P1071GreatestCommonDivisorofStrings {
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        System.out.println(gdcOfStrings(str1, str2));
    }

    public static String gdcOfStrings (String str1, String str2) {
        String smaller = str1.length() > str2.length() ? str2 : str1;
        String bigger = str1.length() > str2.length() ? str1 : str2;
        StringBuilder anwser = new StringBuilder();

        if (str1.charAt(0) != str2.charAt(0)) {
            anwser.append("");
            return anwser.toString();
        }

        for (int i = 0; i < smaller.length(); i++) {
            if (smaller.charAt(i) == bigger.charAt(i)){
                anwser.append(smaller.charAt(i));
            }
        }

        return anwser.toString();
    }
}