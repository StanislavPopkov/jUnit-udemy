package jUnit4Class;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(value= Parameterized.class)
public class StringUtilsParamererizedTest {
    //создаем параметризованный метод, который при каждой прогонке теста, выдает в цикле новые параметры для объекта
    //jUnit4Test.StringUtilsParamererizedTest. Параметры попадают в конструктор, затем тестовый метод считывает поля jUnit4Test.StringUtilsParamererizedTest.

    private Boolean exp;
    private String arg;

    public StringUtilsParamererizedTest(Boolean exp, String arg) {
        this.exp = exp;
        this.arg = arg;
    }

    @Test
    public void are2CharsAtHeadAndTailEqual(){
        StringUtils utils = new StringUtils();
        assertEquals(exp, utils.are2CharsAtHeadAndTailEqual(arg));
    }
    @Parameterized.Parameters
    public static Collection<Object[]> getTestParameter(){
//        List<Object[]> list = new ArrayList<Object[]>();
//        list.add(new Object[]{Boolean.FALSE, "1234"});
//        list.add(new Object[]{Boolean.TRUE, "1212"});
//        list.add(new Object[]{Boolean.TRUE, "12"});
//        list.add(new Object[]{Boolean.FALSE, "1"});
//        return list;
        return Arrays.asList(new Object[][]{
                {Boolean.FALSE, "1234"},
                {Boolean.TRUE, "1212"},
                {Boolean.TRUE, "12"},
                {Boolean.FALSE, "1"},
        });

    }
}