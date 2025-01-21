package org.example.roman;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

class RomanNumeralTest {

    RomanNumeral romanNumeral = new RomanNumeral();

    @Test
    @DisplayName("Roman I returns 1")
    void romanIReturns1() {
       int result = romanNumeral.convert("I");

       assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("Roman IV returns 4")
    void romanIvReturns4() {
        int result = romanNumeral.convert("IV");
        assertThat(result).isEqualTo(4);
    }

    @Test
    @DisplayName("Roman MMXXV returns 2025")
    void romanMmxxvReturns2025() {
        int result = romanNumeral.convert("MMXXV");
        assertThat(result).isEqualTo(2025);
    }

    @Test
    @DisplayName("Blank string input returns 0")
    void blankStringInputReturns0() {
        int result = romanNumeral.convert("");
        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("Test all possible characters")
    void testAllPossibleCharacters() {
        int result = romanNumeral.convert("MDCLXVI");
        assertThat(result).isEqualTo(1666);
    }
  
}
