public class CustomerManager extends BaseCreditManager{
	private Customer _customer;
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;		
	}
	
	public void save() {
		System.out.println("Müşteri Kaydedildi : ");
	}
	public void delete() {
		System.out.println("Müşteri silindi : ");
	}
	public void giveCredit() {
		_creditManager.calculate();
		System.out.println("Kredi verildi");
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		
	}

}
