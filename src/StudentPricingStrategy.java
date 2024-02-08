
public class StudentPricingStrategy implements IPricingStrategy{

	@Override
	public double discountedPrice(double price) {
		return price*0.9;
	}
	
}
