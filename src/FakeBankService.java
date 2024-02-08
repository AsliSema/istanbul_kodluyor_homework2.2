public class FakeBankService implements IBankService{

	
	@Override
    public double convertRate(CurrencyRate currencyRate) {
        return (currencyRate.price / 30.49);     
    }
}

