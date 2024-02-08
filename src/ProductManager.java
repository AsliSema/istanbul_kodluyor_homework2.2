
public class ProductManager implements IProductService{
	
	private IBankService bankService;
	

	public ProductManager(IBankService _bankService) {
		super();
		this.bankService = _bankService;
	}


	@Override
	public void sell(Product product, Customer customer) {
		
//		double price = product.price;
//		if(customer.isStudent) {
//			price = price * 0.9;
//		}
//		else if(customer.isOfficer) {
//			price = price * 0.8;
//		}
		
		//Önemli nokta!! yukardaki gibi if koşuluyla yazıldığında price ı 
		//direk product.price dan alıp ondan sonra siyat azaltma işlemi 
		//uygulanıyordu. Ama aşağıda indirimli fiyat üzerinden kur hesabı yapılmalı. 
		//Çünkü if koşulunu kaldırmak için Customer sınıfının içinde double değer döndüren 
		//IPricingStrategy sınıfına tanımlı price mevcut!
		
		double price = customer.calculateDiscount(product.price); 
		
		price = bankService.convertRate(new CurrencyRate(price, 1));
		System.out.println("price ----> " + price);
		//FakeBankService fakeBankService = new FakeBankService();
		//fakeBankService.convertRate(new CurrencyRate(price = 1000, currency= 1));
		//bankService.convertRate(new CurrencyRate(price, 2));
		
		//System.out.println(price);
		
		//CentralBankService centralBankService = new CentralBankService();
		//centralBankService.convertRate(new CurrencyRate(1000, 1));
		
		//bankService.convertRate(new CurrencyRate(1000,1));
	}
}
