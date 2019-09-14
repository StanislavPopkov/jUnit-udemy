package jUnit4Class;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings("all")
public class LinkedOrArrayList {

	public static void remove(List<String> list, String elem) {
		System.out.print(list.getClass().getSimpleName() + " :\t");
		long start = System.nanoTime();
		long start2 = new Date().getTime();
		list.remove(elem);
		long stop = System.nanoTime();
		System.out.println("took " + (double)(stop - start)/1000000 + " millis.");
	}

	public static void populateList(List<String> list, long elem){
		System.out.print(list.getClass().getSimpleName() + " :\t");
		long start = System.nanoTime();
		for (int i = 0; i < elem; i++){
			list.add(new java.lang.String("i"));
		}
		long stop = System.nanoTime();
		System.out.println("took " + (double)(stop - start)/1000000 + " millis.");
	}

	public static void addElem(List<String> list, String elem, int index) {
		System.out.print(list.getClass().getSimpleName() + " :\t");
		long start = System.nanoTime();
		list.add(index, elem);
		long stop = System.nanoTime();
		System.out.println("took " + (double) (stop - start) / 1000000 + " millis.");
	}


	public static void main(String[] args) {
		List<Object[]> list = new ArrayList<Object[]>();
        list.add(new Object[]{Boolean.FALSE, "1234"});
        list.add(new Object[]{Boolean.TRUE, "1212"});
        list.add(new Object[]{Boolean.TRUE, "12"});
        list.add(new Object[]{Boolean.FALSE, "1"});
		System.out.println(list.get(0));
        list.remove(0);
		System.out.println(list.get(0));
		System.out.println(list.size());
	}

	//@SuppressWarnings({"unchecked", "deprecation"})
	public void addElem_Warning() {
		List list = new ArrayList();
		list.add("");
		JDialog jd = new JDialog();
		jd.show();

	}
}
