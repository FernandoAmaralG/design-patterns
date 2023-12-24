package training.adapter.problem;

import java.math.BigDecimal;

public class ClientJarCurrentAccountOperations {

	private JarCurrentAccountOperations jcao;
	
	public ClientJarCurrentAccountOperations(JarCurrentAccountOperations jcao) {
		this.jcao = jcao;
	}
	
	public boolean validateBalance(BigDecimal intendedWithdrawalAmount) {
		return jcao.validateBalance(intendedWithdrawalAmount);
	}
	
	public void toWithdraw(BigDecimal intendedValue) {
		jcao.toWithdraw(intendedValue);
	}
	
	public void deposit(BigDecimal value) {
		jcao.deposit(value);
	}
	
}
