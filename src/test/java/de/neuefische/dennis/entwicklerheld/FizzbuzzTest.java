package de.neuefische.dennis.entwicklerheld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzTest {

    @Test
    void fizzbuzzReturnsNumber() {
        //Given is a number which is not divisible by 3 or 5.
        int number = 8;

        //When the function called with this number.
        String actual = Fizzbuzz.fizzbuzz(number);

        //Then the function should return the invoked number.
        assertEquals("8", actual);
    }

    @Test
    void fizzbuzzReturnsFizz(){
        //Given is a number which is divisible by 3.
        int number = 27;

        //When the function called with this number.
        String actual = Fizzbuzz.fizzbuzz(number);

        //Then the function should return "fizz".
        assertEquals( "fizz", actual);
    }

    @Test
    void fizzbuzzReturnsBuzz(){
        //Given is a number which is divisible by 5.
        int number = 25;

        //When the function called with this number.
        String actual = Fizzbuzz.fizzbuzz(number);

        //Then the function should return "buzz".
        assertEquals("buzz", actual);
    }

    @Test
    void fizzbuzzReturnsFizzbuzz(){
        //Given is a number which is divisible by 3 and 5.
        int number= 30;

        //When the function called with this number.
        String actual = Fizzbuzz.fizzbuzz(number);

        //Then the function should return the "fizzbuzz".
        assertEquals("fizzbuzz", actual);
    }
}