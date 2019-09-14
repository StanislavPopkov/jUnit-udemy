package jUnit4Class;

import java.util.*;
import javax.swing.JDialog;

@FunctionalInterface
interface Interfacable{
	void run();
	
}
@SuppressWarnings("all")
public class AnnotationsDemo {

//	@Override
	public boolean equals(Object str) {
		return this.equals(str);
	}
	
//	@SuppressWarnings({"unchecked", "deprecation"})
	public void run() {
		List list = new ArrayList();
		list.add("");
		
		JDialog jd = new JDialog();
		jd.show();
	}

	public static void main(String[] args) {
		new AnnotationsDemo().run();
	}
}
