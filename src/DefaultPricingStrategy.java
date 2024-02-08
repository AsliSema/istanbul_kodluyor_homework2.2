
public class DefaultPricingStrategy implements IPricingStrategy{

	@Override
	public double discountedPrice(double price) {
		return price;
	}

}
