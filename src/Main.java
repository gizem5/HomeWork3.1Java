

public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		person.setId(1);
		person.setFirstName("Gizem");
		person.setLastName("Kurtuluş");
		person.setNationalIdentity("22552255");
		person.setCity("Bursa");
		
		Company company = new Company();
		company.setId(2);
		company.setCompanyName("Zem Medya");
		company.setTaxNumber("Konya");
		
		MilitaryCreditManager militaryCreditManager = new MilitaryCreditManager();
		TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
		
		militaryCreditManager.calculate();
		teacherCreditManager.save();
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.giveCredit();
		
	}

}
