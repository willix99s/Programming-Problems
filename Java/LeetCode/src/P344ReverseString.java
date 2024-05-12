// Write a function that reverses a string. The input string is given as an array of characters s.
// You must do this by modifying the input array in-place with O(1) extra memory.
//
// Example 1:
// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
//
// Example 2:
// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]

import java.util.*;

public class P344ReverseString {
    public static void main(String[] args) {
        char[] string = {'h', 'e', 'l', 'l', 'o'};
        reverseString(string);
    }

    public static void reverseString(char[] string) {
        char[] newString = new char[string.length];
        int j = 0;

        for (int i = string.length - 1; i >= 0; i--) {
            newString[j] = string[i];
            j++;
        }

        for (int i = 0; i < newString.length; i++) {
            string[i] = newString[i];
        }
            System.out.println(Arrays.toString(string));
    }
}
