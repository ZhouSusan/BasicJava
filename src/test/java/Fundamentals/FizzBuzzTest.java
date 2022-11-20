package Fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Fundamentals.FizzBuzz.fizzBuzz;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void fizzBuzzTest() {
        List<String> res = new ArrayList<String>(Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"));
        assertArrayEquals(res.toArray(), fizzBuzz(15).toArray());
    }
}