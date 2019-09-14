package module3.lecture_11_BlackBoxWhiteBox;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BlackBoxTest {

	//По модели черного ящика мы не знаем содержимое класса, не видим код, известно только спецификация метода
	@ParameterizedTest
	@ValueSource (  ints = {-10,10,0,1024} )
	void testPrintNumBytes( int ints ) {
		BlackBox.printNumBytes(  ints  );
	}

}
