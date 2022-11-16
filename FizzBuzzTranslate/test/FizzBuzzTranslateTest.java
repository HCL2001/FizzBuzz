import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {
    @Test
    @DisplayName("Test number 3")
    void testNumber3(){
        int numberTest = 3;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.fizzBuzzMethod(numberTest);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test number 3")
    void testNumber5(){
        Scanner sc = new Scanner(System.in);
        int numberTest = 5;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.fizzBuzzMethod(numberTest);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test number 3")
    void testNumber31(){
        int numberTest = 31;
        String expected = "31";
        String result = FizzBuzzTranslate.fizzBuzzMethod(numberTest);
        assertEquals(expected, result);
    }
}