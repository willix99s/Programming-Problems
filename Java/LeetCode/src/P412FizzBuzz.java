// Given an integer n, return a string array answer (1-indexed) where:
//
//answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//answer[i] == "Fizz" if i is divisible by 3.
//answer[i] == "Buzz" if i is divisible by 5.
//answer[i] == i (as a string) if none of the above conditions are true.
//
//Example 1:
//Input: n = 3
//Output: ["1","2","Fizz"]
//
//Example 2:
//Input: n = 5
//Output: ["1","2","Fizz","4","Buzz"]

import java.util.*;

public class P412FizzBuzz {
    public static void main(String[] args) {
        int tamanho = 5;
        fizzBuzz(tamanho);
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }

        return list;
    }
}
