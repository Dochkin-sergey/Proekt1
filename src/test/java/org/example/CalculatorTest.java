package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {

    @DisplayName("Summa")
    @Test
    @Tag("summ")
    void summ() {
        Calculator calkKul = new Calculator();
        int equals = calkKul.summ(3,5);
        Assertions.assertEquals(8, equals,"Неправильно");
    }

    @Test
    @DisplayName("Ne Summa")
    @Tag("subtraction")
    void subtraction() {
        Calculator calkKul = new Calculator();
        int equals = calkKul.subtraction(10,5);
        Assertions.assertEquals(5, equals,"Неправильно");
    }

    @CsvSource({"5, 6, 11" , "-1 , 2, 1"})
    @ParameterizedTest(name = "#{index} - cложение {0} и {1} будет {2}")
    @Tag("summ")
    void summ1(int a, int b, int equals) {
        Calculator calkKul = new Calculator();
        int result = calkKul.summ(a, b);
        Assertions.assertEquals(equals, result, "Если будет что то не так");
    }


    @CsvSource({"10, 5, 5" , "99 , 10, 89"})
    @ParameterizedTest(name = "#{index} - Вычитание {0} из {1} будет {2}")
    @Tag("subtraction")
    void subtraction1( int a, int b, int  equals) {
        Calculator calkKul = new Calculator();
        int result = calkKul.subtraction(a, b);
        Assertions.assertEquals(equals, result, "Если будет что то не так");
    }
}