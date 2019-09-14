package module3.mockito.mockobjects;

public class SimpleAuditService implements AuditService {

	@Override
	public void logNewTrade(Trade trade) {
		throw new RuntimeException("implement logNewTrade() in SimpleAuditService");
	}
}
