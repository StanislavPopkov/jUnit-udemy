package jUnit5Class;

import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTest {

    //Параметризованные тесты для 5 jUnita. Нужно добавлять junit-jupiter-params в pom
    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(strings = {"test1", "test2", "test3"})
    void lengthGreaterZero(String arg){
        assertTrue(arg.length() > 0);
    }

    //Позволяет использовать 2 аргумента
    @org.junit.jupiter.params.ParameterizedTest
    @CsvSource(value = {"TEST,test", "UNIT,unit", "'',''"})
    void toLowerCase(String arg, String lowered){
        assertEquals(lowered, arg.toLowerCase());
    }
    //Позволяет использовать файл в качестве источника
    @org.junit.jupiter.params.ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void toLowerCase2(String arg, String lowered){
        assertEquals(lowered, arg.toLowerCase());
    }


}
