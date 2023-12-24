package training.adapter.solution;

import java.math.BigDecimal;

public class ClientJarCurrentAccountOperationsAdapter {

	private JarCurrentAccountOperationsAdapter jarAccountAdapter;

	public ClientJarCurrentAccountOperationsAdapter(JarCurrentAccountOperationsAdapter jarAccountAdapter) {
		this.jarAccountAdapter = jarAccountAdapter;
	}

	public void toWithdraw(BigDecimal intendedValue) {
		jarAccountAdapter.toWithdraw(intendedValue);
	}

	public void deposit(BigDecimal value) {
		jarAccountAdapter.deposit(value);
	}

}
