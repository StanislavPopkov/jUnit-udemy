package jUnit4Class;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortBubbleTest {

    @Test
    public void bubbleSort() {
        int[] arr = {-1, 10, -2, 15};
        int[] exp = {-2, -1, 10, 15};
        SortBubble.bubbleSort(arr);
        assertArrayEquals(exp, arr); //из-за того что массивы не переопределяют equals, hashcode, сравниваютя они по
        //элементам.
    }

    @Test(expected = NullPointerException.class)
    public void bubbleSortException() {
        int[] arr = null;
        int[] exp = {-2, -1, 10, 15};
        SortBubble.bubbleSort(arr);
        assertArrayEquals(exp, arr);
    }
}