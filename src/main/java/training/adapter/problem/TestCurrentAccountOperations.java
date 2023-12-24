package training.adapter.problem;

import java.math.BigDecimal;

public class TestCurrentAccountOperations {

	public static void main(String[] args) {
		
		JarCurrentAccountOperations jarAccount = new JarCurrentAccountOperations();
		
		ClientJarCurrentAccountOperations client = new ClientJarCurrentAccountOperations(jarAccount);
		
		BigDecimal intendedWithdrawalAmount = new BigDecimal(1000);
		
		if(client.validateBalance(intendedWithdrawalAmount)) {
			client.toWithdraw(intendedWithdrawalAmount);
		}
		
		client.deposit(new BigDecimal(500));
		
	}
	
}
