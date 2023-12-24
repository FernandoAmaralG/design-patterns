package training.strategy.solution;

import java.math.BigDecimal;

import training.strategy.Employee;

public class CalculatorAnnualSalaryAdjustmentInternship implements CalculatorAnnualSalaryAdjustment {

	@Override
	public void calculateAnnualAdjustment(Employee employee) {
		BigDecimal salary = employee.getSalary();
		employee.setSalary(salary.add(salary.multiply(new BigDecimal(0.02))));		
	}
	
}
