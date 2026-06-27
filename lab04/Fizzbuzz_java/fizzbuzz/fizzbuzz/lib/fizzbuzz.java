package lib;

import java.util.List;

public class Fizzbuzz {

    public String fizzbuzz(int n) {
        if (n % 15 == 0 && n != 0) {
            return "FizzBuzz";
        }
        if (n % 3 == 0 && n != 0) {
            return "Fizz";
        }
        if (n % 5 == 0 && n != 0) {
            return "Buzz";
        }
        return String.valueOf(n);
    }

    public List<String> fizzbuzz(int start, int end) {
        return null;
    }
}