package jUnit5Class;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleTest {

    @BeforeAll
    static void init(TestInfo info){
        System.out.println("into " + info.getDisplayName());
    }

    @AfterAll
    static void destroy(TestInfo info){
        System.out.println("into " + info.getDisplayName());
        System.out.println("Test end");
    }

    //В 5 jUnite нет механизма для указания вызова методов, он появиться в 5.4.
    // В 4 он есть: @FixMethodOrder(MethodSorters.NAME_ASCENDING)
    //по дефолту вызов происходит по хеш коду имени метода.
    @Test
    void testTest2(){
        System.out.println("into testTest2()");
    }

    @Test
    void testTest1(){
        System.out.println("into testTest1()");
    }

    @Test
    void testTest3(){
        System.out.println("into testTest3()");
    }

    //Позволяет изменить описание метода при выводе теста
    @Test
    @DisplayName("NullPointerException in str")
    void testDisplay(){
        String str = null;
        assertThrows(NullPointerException.class, () -> str.lastIndexOf(2));
    }
    //Запуск теста в цикле. Аннотация уже содержит в себе @Test. @RepeatedTest есть только в последнем 4.13 и 5 jUnit
    @RepeatedTest(5)
    void repeated(){
        System.out.println("into repeated()");
    }

    @Disabled
    void disabled(){
        System.out.println("into repeated()");
    }

}
