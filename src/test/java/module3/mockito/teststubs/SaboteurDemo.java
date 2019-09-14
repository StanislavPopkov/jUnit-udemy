package module3.mockito.teststubs;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

class SaboteurDemo {
	//Тест Мок стаб имитирует CustomerRepository, вызов метода и бросание исключения. Он не проверяет реальную
	//работосопособность имитируемого класса
	@Test
	public void testInvalidCustomer() {

	  Customer customer = new Customer();
	  CustomerRepository customerRepository = mock(CustomerRepository.class);

	  when(customerRepository.getCustomerById(anyLong()))
	    					 .thenThrow(new CustomerNotFoundException());

	  CustomerService customerService = new SimpleCustomerService(customerRepository);
	  assertThrows(CustomerNotFoundException.class, () -> customerService.getCustomerById(customer.getId()));
	}
}
