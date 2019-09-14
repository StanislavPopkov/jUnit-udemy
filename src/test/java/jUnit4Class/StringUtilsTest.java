package jUnit4Class;

import org.junit.Test;

import static org.junit.Assert.*;


public class StringUtilsTest {
    StringUtils utils = new StringUtils();

    @Test
    public void chopOff2SpacesAtHead_2Spaces() {
        assertEquals("**test", utils.chopOff2SpacesAtHead("  **test"));
    }

    @Test
    public void chopOff2SpacesAtHead_1Space() {
        assertEquals("*test", utils.chopOff2SpacesAtHead(" *test"));
    }

    @Test
    public void chopOff2SpacesAtHead_NoSpace() {
        assertEquals("test",  utils.chopOff2SpacesAtHead("test"));
    }

    @Test
    public void are2CharsAtHeadAndTailEqual_False() {
        assertFalse(utils.are2CharsAtHeadAndTailEqual("1234"));
        //assertFalse("test not pass", utils.are2CharsAtHeadAndTailEqual("1212"));
    }

    @Test
    public void are2CharsAtHeadAndTailEqual_True() {
        assertTrue(utils.are2CharsAtHeadAndTailEqual("1212"));

    }
}