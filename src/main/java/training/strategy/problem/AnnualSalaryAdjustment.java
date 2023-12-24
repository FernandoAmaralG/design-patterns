package training.strategy.problem;

import java.math.BigDecimal;

import training.strategy.Employee;
import training.strategy.HiringTypeEnum;

public class AnnualSalaryAdjustment {

	public void calculateAnnualAdjustment(Employee employee) {
		
		if(HiringTypeEnum.CLT.name().equals(employee.getHiringType().name())) {
			BigDecimal salary = employee.getSalary();
			employee.setSalary(salary.add(salary.multiply(new BigDecimal(0.10))));
		} else if(HiringTypeEnum.PJ.name().equals(employee.getHiringType().name())) {
			BigDecimal salary = employee.getSalary();
			employee.setSalary(salary.add(salary.multiply(new BigDecimal(0.05))));
		} else if(HiringTypeEnum.INTERNSHIP.name().equals(employee.getHiringType().name())) {
			BigDecimal salary = employee.getSalary();
			employee.setSalary(salary.add(salary.multiply(new BigDecimal(0.02))));
		}
		
	}
	
}
