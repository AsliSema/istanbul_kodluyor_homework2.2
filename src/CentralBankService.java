
public class CentralBankService {
	public double convertCurrency(CurrencyRate currencyRate) {
		return currencyRate.getPrice()/ 30.60;
	}
}
