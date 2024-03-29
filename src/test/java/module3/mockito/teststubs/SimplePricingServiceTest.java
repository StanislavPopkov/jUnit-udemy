package module3.mockito.teststubs;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.util.*;
import org.junit.jupiter.api.Test;


class SimplePricingServiceTest {

	//Тест Мок стаб имитирует PricingRepository с вызовом метода и возвращением 3 прайсов. Он не проверяет реальную
	//работосопособность имитируемого класса
	@Test
	public void testGetHighestPricedTrade() throws Exception {
		Price price1 = new Price(10);
		Price price2 = new Price(15);
		Price price3 = new Price(25);

		Collection<Trade> trades = new ArrayList<>();
		trades.add(new Trade(price1));
		trades.add(new Trade(price2));
		trades.add(new Trade(price3));
	  
		PricingRepository pricingRepository = mock(PricingRepository.class);
		when(pricingRepository.getPriceForTrade(any(Trade.class)))
	    					  .thenReturn(price1, price2, price3);
	   
		PricingService service = new SimplePricingService(pricingRepository);
		Price highestPrice = service.getHighestPricedTrade(trades);
	  
		assertEquals(price3.getAmount(), highestPrice.getAmount());
	}
}
