package com.skypro.homework3_3test.service.impl;

import com.skypro.homework3_3test.exeption.IllegalArgumentExceptionDivide;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class CalculatorServiceImplTest {
    public final CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static Stream<Arguments> argsFactory() {
        return Stream.of(
                Arguments.of(2.0, 2.0, 1.0),
                Arguments.of(50.0, 2.0, 25.0));

    }

    @Test
    void helloTest() {
        String hello = "Добро пожаловать в калькулятор";
        assertEquals(hello, out.hello());
    }

    @Test
    void divideTest() {
        assertEquals(1, out.divide(4.0, 4.0));
        assertEquals(2, out.divide(6.0, 3.0));
    }

    @Test
    void divideExceptionTest() {
        assertThrows(IllegalArgumentExceptionDivide.class, () -> out.divide(Double.MAX_VALUE, 0.0));
    }

    @Test
    void plusTest() {
        assertEquals(10, out.plus(5, 5));
        assertEquals(14, out.plus(7, 7));
    }

    @Test
    void minusTest() {
        assertEquals(0, out.minus(5, 5));
        assertEquals(10, out.minus(20, 10));
    }

    @Test
    void multiplyTest() {
        assertEquals(25, out.multiply(5, 5));
        assertEquals(100, out.multiply(10, 10));
    }

    @ParameterizedTest
    @MethodSource("argsFactory")
    void divideTestParam(Double a, Double b, Double expected) {
        assertEquals(expected, out.divide(a, b));
    }

    @ParameterizedTest
    @CsvSource({"100,3,97", "22,22,0", "1,1,0"})
    void minusTestParam(Integer a, Integer b, Integer expected) {
        assertEquals(expected, out.minus(a, b));
    }

    @ParameterizedTest
    @CsvSource({"100,3,103", "22,22,44", "1,1,2"})
    void plusTestParam(Integer a, Integer b, Integer expected) {
        assertEquals(expected, out.plus(a, b));
    }

    @ParameterizedTest
    @CsvSource({"100,3,300", "22,22,484", "1,1,1"})
    void multiplyTestParam(Integer a, Integer b, Integer expected) {
        assertEquals(expected, out.multiply(a, b));
    }
}
