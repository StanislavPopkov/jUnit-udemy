package jUnit5Class;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterableAllMatch {

    //Сравнивает данные в коллекциях через итератор
    @Test
    void iterableTest(){
        List<String> actual = Arrays.asList("one", "two", "three");
        List<String> exp = new ArrayList<>(actual);
        assertIterableEquals(exp, actual);
    }

    //assertAll выполняет тесты и ловит исключения. Все тесты выполняются, несмотря на исключение.
    //assertThat - это матчер
    @Test
    void assertingAllTest(){
        String actual = "www.yandex.ru";
        assertAll(() -> assertThat(actual, endsWith("ru")),
                () -> assertThat("test", isA(String.class)),
                () -> assertThat("10", is("10")));
    }

    //Выполняет сравнение строк в коллекциях
    @Test
    void linesMatchTest(){
        List<String> actualLines = Arrays.asList("Happy", "new", "test");
        assertLinesMatch(Arrays.asList("Happy", "new", "test"), actualLines);
    }
}
