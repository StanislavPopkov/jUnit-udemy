package module3.lecture_05_ParameterResolver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

//Создаем наш ParameterResolver который инжектит объект
//Поддерживает constructor injection.
//Поддерживает method injection в методах со след.аннотациями:
//@Test
//@TestFactory
//@BeforeEach, @AfterEach, @BeforeAll или @AfterAll
@ExtendWith(ThingParameterResolver.class)
class ThingTest {

	@Test
	void testAnswer(Thing thing) {
		assertEquals(42, thing.answer());
	}

}
