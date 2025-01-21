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

    }

    @Test
    @DisplayName("Roman MMXXV returns 2025")
    void romanMmxxvReturns2025() {

    }

    @Test
    @DisplayName("Blank string input returns 0")
    void blankStringInputReturns0() {

    }
  
}
