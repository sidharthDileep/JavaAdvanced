package principles.SRP;

import java.util.ArrayList;
import java.util.List;

public class BankService {

	int balance;
	List<String> transactions = new ArrayList<>();

	public String deposit(long amount, String accountNo) {
		balance += amount;
		transactions.add("Deposited" + amount);
		return "Deposited" + amount;
	}

	public String withdraw(long amount, String accountNo) {
		balance -= amount;
		transactions.add("Withdrawed" + amount);
		return "Withdrawed" + amount;
	}

	public List<String> getTransactions() {
		return transactions;
	}

}
