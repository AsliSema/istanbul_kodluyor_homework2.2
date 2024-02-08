
public class Customer implements IEntity {
	public int id;
	public String name;
	//public  boolean isStudent;
	//public boolean isOfficer;
	public IPricingStrategy pricingStrategy;


    public double calculateDiscount(double price) {
        return pricingStrategy.discountedPrice(price);
    }
	
	
	public Customer(int id, String name, IPricingStrategy pricingStrategy) {
		super();
		this.id = id;
		this.name = name;
		//this.isStudent = isStudent;
		//this.isOfficer = isOfficer;
		this.pricingStrategy = pricingStrategy;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public boolean isStudent() {
//		return isStudent;
//	}
//	public void setStudent(boolean isStudent) {
//		this.isStudent = isStudent;
//	}
	
	
	
}
