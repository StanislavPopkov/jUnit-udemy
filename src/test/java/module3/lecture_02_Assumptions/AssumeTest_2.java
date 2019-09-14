package module3.lecture_02_Assumptions;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

public class AssumeTest_2 {
	//Тоже что и предыдущий, но с заданием общих условий в объекте запуска
	@Before
	public void setUp() {
		String versionNumber = "5";  // get it from configuration on runtime
		Assume.assumeTrue(Integer.valueOf(versionNumber) >= 4);
		
	}
	
	@Test
	public void testOneThing() {
		System.out.println("Now we can test a thing...");
	}
	@Test
	public void testAnotherThing() {
		System.out.println("... or two...");
	}

}
