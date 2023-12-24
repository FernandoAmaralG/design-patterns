package training.adapter.solution;

import java.math.BigDecimal;

import training.adapter.problem.JarCurrentAccountOperations;

public class JarCurrentAccountOperationsAdapter {

	private JarCurrentAccountOperations jarAccount;
	
	public JarCurrentAccountOperationsAdapter(JarCurrentAccountOperations jarAccount) {
		this.jarAccount = jarAccount;
	}
		
	public void toWithdraw(BigDecimal intendedValue) {
		if(jarAccount.validateBalance(intendedValue)) {			
			jarAccount.toWithdraw(intendedValue);
		} else {
			throw new IllegalArgumentException("Withdrawal amount not allowed.");
		}
	}
	
	public void deposit(BigDecimal value) {
		jarAccount.deposit(value);
	}
	
}
