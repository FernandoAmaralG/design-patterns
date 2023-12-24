package training.adapter.solution;

import java.math.BigDecimal;

import training.adapter.problem.JarCurrentAccountOperations;

public class TestCurrentAccountOperationsAdapter {

	public static void main(String[] args) {

		JarCurrentAccountOperations jarAccount = new JarCurrentAccountOperations();
		
		JarCurrentAccountOperationsAdapter jarAccountAdapter = new JarCurrentAccountOperationsAdapter(jarAccount);

		ClientJarCurrentAccountOperationsAdapter client = new ClientJarCurrentAccountOperationsAdapter(jarAccountAdapter);

		BigDecimal intendedWithdrawalAmount = new BigDecimal(1000);

		client.toWithdraw(intendedWithdrawalAmount);

		client.deposit(new BigDecimal(500));

	}

}
