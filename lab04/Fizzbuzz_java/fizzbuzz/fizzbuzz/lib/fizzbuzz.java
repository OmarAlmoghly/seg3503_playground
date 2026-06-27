package lib;

import java.util.List;
import java.util.ArrayList;

public class Fizzbuzz {

    public String fizzbuzz(int n) {
        if (n != 0 && n % 15 == 0) {
            return "FizzBuzz";
        } else if (n != 0 && n % 3 == 0) {
            return "Fizz";
        } else if (n != 0 && n % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(n);
        }
    }

    public List<String> fizzbuzz(int start, int end) {
        List<String> result = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            result.add(fizzbuzz(i));
        }
        return result;
    }
}