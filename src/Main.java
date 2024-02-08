
public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Laptop",1000);
		StudentPricingStrategy studentPricing = new StudentPricingStrategy();
		Customer customer1 = new Customer(1,"Nikola", studentPricing);
		
       
		
		IBankService bankService = new FakeBankService();
		ProductManager productManager = new ProductManager(bankService);

		
		IProductService productService = new ProductManager(new CentralBankServiceAdapter());
		IProductService productService2 = new ProductManager(new FakeBankService());

		System.out.println("CentralBankService ----->");
		productService.sell(product1, customer1);
		System.out.println("FakeBankService ------>");
		productService2.sell(product1, customer1);
		

	}

}
