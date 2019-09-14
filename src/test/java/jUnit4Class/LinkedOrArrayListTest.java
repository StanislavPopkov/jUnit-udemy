package jUnit4Class;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//
public class LinkedOrArrayListTest {
    ArrayList<java.lang.String> arrayList = new ArrayList<String>();
    List<java.lang.String> linkedList = new LinkedList<String>();

    @Test(timeout = 25)
    public void remove_AR() {
        LinkedOrArrayList.remove(arrayList, "100");
    }

    @Test
    public void remove_LI() {
        LinkedOrArrayList.remove(linkedList, "100");
    }
    @Before
    public void setUp(){
        System.out.println("Вставка данных в лист... ");
        for (int i = 0; i < 1000000; i++){
            arrayList.add(new java.lang.String("i"));
        }
        for (int i = 0; i < 1000000; i++){
            linkedList.add(new java.lang.String("i"));
        }
        System.out.println("Сделано");
    }

    @Test
    @Ignore
    public void addList_AR() {
        LinkedOrArrayList.populateList(arrayList, 10000);
    }

    @Test
    @Ignore
    public void addList_LI() {
        LinkedOrArrayList.populateList(linkedList, 10000);
    }

    @Test
    public void addElem_AR() {
        LinkedOrArrayList.addElem(arrayList, "5", 1000);
    }

    @Test
    public void addElem_LI() {
        LinkedOrArrayList.addElem(linkedList, "5", 1000);
    }

}