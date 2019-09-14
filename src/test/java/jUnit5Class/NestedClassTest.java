package jUnit5Class;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class NestedClassTest {

    @BeforeAll
    static void init(){
        System.out.println("Before All");
    }

    @BeforeEach
    void beforeTest(){
        System.out.println("Before Each");

    }

    @AfterEach
    void afterTest(){
        System.out.println("After Each");
    }

    @AfterAll
    static void destroy(){
        System.out.println("After All");
    }

    @Test
    void consolePrint(){
        System.out.println("Print console");
    }

    //Аналог внутренних классов, не могут содержать в себе статические методы. Представляют собой группу тестов.
    //При запуске сначала отрабатывают статические инициализаторы внешнего класс(без тестов), потом тесты
    //внутреннего класса.
    @Nested
    class ArrayListTest{
        List<String> list;

        @BeforeEach
        void initNested(){
            System.out.println("Before Each");
            list = new ArrayList<>(Arrays.asList("1", "2", "3"));
        }

        @AfterEach
        void destroyNested(){
            System.out.println("After Each");
        }

        @Test
        void arrayNotNull(){
            System.out.println("in test");
            assertNotNull(list);
        }
    }

}
