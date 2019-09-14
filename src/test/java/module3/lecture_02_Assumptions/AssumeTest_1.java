package module3.lecture_02_Assumptions;

import org.junit.Assume;
import org.junit.Test;

public class AssumeTest_1 {
	// Assume.assumeTrue позволяет запускать тест только если выполнены условия. Если true, то весь последующий код
	//тоже выполняется
	@Test
	public void testIfVersionGreaterThan4() {
		String versionNumber = "5";  // get it from configuration on runtime
		Assume.assumeTrue(Integer.valueOf(versionNumber) >= 4);
		System.out.println("Test executed");
	}

}
