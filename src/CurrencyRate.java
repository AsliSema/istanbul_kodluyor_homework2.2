
public class CurrencyRate {
	
	public double price;
	public int currency;
	
	
	public CurrencyRate(double price, int currency) {
		this.price = price;
		this.currency = currency;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCurrency() {
		return currency;
	}
	public void setCurrency(int currency) {
		this.currency = currency;
	}
	
	
}
