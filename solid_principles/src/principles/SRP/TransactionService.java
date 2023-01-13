package principles.SRP;

public class TransactionService {

	BankService bankService = new BankService();

	public void printPassbook() {
		System.out.println(bankService.getTransactions());
	}

}
