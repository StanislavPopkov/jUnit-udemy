package jUnit5Class;


import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.runners.MethodSorters;
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FruitsBasketTest {

    private FruitsBasket basket = new FruitsBasket();
    private Fruit apple = new Fruit("Apple", 120); 
    private Fruit orange = new Fruit("Orange", 120); 
    private Fruit pear = new Fruit("Pear", 120);
    private Fruit kiwi = new Fruit("Kiwi", 80);

    @BeforeEach
    void init() {
    	basket.add(apple);
    	basket.add(orange);
    	basket.add(pear);
    }

    @Test
    void testSize() {
        assertEquals(3, basket.getSize(), "Checking basket's size");
    }

    @Test
    void testAdd() {
    	basket.add(new Fruit("Banana", 200));
        assertEquals( 4, basket.getSize(), "Adding one more fruit to the basket");
    }

    @Test
    void testRemove() {
    	basket.remove(orange);
        assertEquals(2, basket.getSize(), "Removing a fruit from the basket");
    }

    @Test
    void testRemoveException() throws Exception {
    	basket.remove(new Fruit("Kiwi", 80));
        assertEquals( 2, basket.getSize(), "Removing a fruit from the basket");
    }

    @Test
    void testRemoveException2(){
        assertThrows(NoSuchElementException.class, () -> basket.remove(kiwi), "Removing a fruit from the basket");
    }
    
    @AfterEach
    void destroy() {
    	basket.removeAll();
    }

    @Test
    void testTimeExecute(){
        //assertTimeout(Duration.ofMillis(0), () -> basket.add(new Fruit("Banana", 200)), "Test time");
        assertTimeout(Duration.ofMillis(10), () -> basket.add(new Fruit("Banana", 200)), "Test time");
    }
    @Test
    void testNull(){
        String str = null;
        assertNull(str, "Null");
    }

    @Test
    void testTrue(){
        assertTrue(basket.containsElement(kiwi), "not contain");
    }

    @Test
    void testText(){
        assertArrayEquals(new java.lang.String[]{"Text", "test", "test"}, basket.text("Text test test!"));
    }
}