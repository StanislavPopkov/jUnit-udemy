package module3.lecture_08_UserExtensions;

import static org.junit.jupiter.api.Assertions.*;

import module3.lecture_08_UserExtensions.InvalidPersonParameterResolver;
import module3.lecture_08_UserExtensions.Person;
import module3.lecture_08_UserExtensions.PersonValidator;
import module3.lecture_08_UserExtensions.ValidPersonParameterResolver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

//используем кастомные резолверы для создания бинов и передачи их в тест
@DisplayName("Testing PersonValidator")
class PersonValidatorTest {

	@Nested
	@DisplayName("When using valid data")
	@ExtendWith(ValidPersonParameterResolver.class)
	public class ValidData{
		@RepeatedTest(10)
		@DisplayName("All first names are valid")
		public void testValidateFirstName(Person person) {
			assertTrue(PersonValidator.validateFirstName(person));
		}
	}
	
	@Nested
	@DisplayName("When using invalid data")
	@ExtendWith(InvalidPersonParameterResolver.class)
	public class InvalidData{
		@RepeatedTest(10)
		@DisplayName("All first names are valid")
		public void testValidateFirstName(Person person) {
			assertTrue(PersonValidator.validateFirstName(person));
		}
	}
	
	
}
