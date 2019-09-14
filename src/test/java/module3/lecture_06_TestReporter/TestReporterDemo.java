package module3.lecture_06_TestReporter;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

//TestReporter используется для вывода информации о тестах. Он встроен в пакет.
//Рекомендован к использованию, когда надо передать информацию в каналы stdout или stderr.
//Эта информация поступает в метод TestExecutionListener.reportingEntryPublished() и может обрабатываться
// средствами IDEs или включаться в отчеты.
class TestReporterDemo {

	@Test
	void testKeyValuePair(TestReporter testReporter) {
		testReporter.publishEntry("my key", "my value");
	}

	@Test
	void testMultipleKeyValuePairs(TestReporter testReporter) {
		Map<String, String> values = new HashMap<>();
		values.put("name", "Kolya");
		values.put("handle", "Pikachu");
		testReporter.publishEntry(values);
	}

}
