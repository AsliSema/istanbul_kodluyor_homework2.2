
public class CentralBankServiceAdapter implements IBankService{

	@Override
	public double convertRate(CurrencyRate currencyRate) {
		
		CentralBankService centralBankService = new CentralBankService();
		return centralBankService.convertCurrency(currencyRate);
	}

}
