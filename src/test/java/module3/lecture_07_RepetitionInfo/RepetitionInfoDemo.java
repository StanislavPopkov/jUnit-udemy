package module3.lecture_07_RepetitionInfo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestReporter;

//Инжектирует объект типа RepetitionInfo в методы, маркированные аннотациями @RepeatedTest, @BeforeEach или @AfterEach.
//Зарегистрирован по умолчанию, но работает только в контексте @RepeatedTest.
//Когда объект RepetitionInfo используется в качества параметра @BeforeEach- или @AfterEach-метода,
// все тестовые методы должны иметь аннотацию @RepeatedTest.
class RepetitionInfoDemo {

	@RepeatedTest(3)
	void testWithRepetitionInfo(RepetitionInfo repetitionInfo, TestReporter testReporter) {
		testReporter.publishEntry("Repetition #" + repetitionInfo.getCurrentRepetition());
		assertEquals(3, repetitionInfo.getTotalRepetitions());
	}

}
