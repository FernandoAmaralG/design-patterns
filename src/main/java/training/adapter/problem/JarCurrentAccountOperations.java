package training.adapter.problem;

import java.math.BigDecimal;

public class JarCurrentAccountOperations {
	
	public boolean validateBalance(BigDecimal intendedWithdrawalAmount) {
		System.out.println("Validating the balance...");
		return true;
	}
	
	public void toWithdraw(BigDecimal intendedValue) {
		System.out.println("Taking out...");
	}
	
	public void deposit(BigDecimal value) {
		System.out.println("Depositing...");
	}

}
