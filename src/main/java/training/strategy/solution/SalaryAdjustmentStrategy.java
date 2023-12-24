package training.strategy.solution;

import java.math.BigDecimal;

import training.strategy.Employee;
import training.strategy.HiringTypeEnum;

public class SalaryAdjustmentStrategy {

	public static void main(String[] args) {

		AnnualSalaryAdjustmentWithStrategy annualSalaryAdjustment = new AnnualSalaryAdjustmentWithStrategy();

		Employee employeeCLT = new Employee();
		employeeCLT.setName("Fernando");
		employeeCLT.setHiringType(HiringTypeEnum.CLT);
		employeeCLT.setSalary(new BigDecimal(5000));

		Employee employeePJ = new Employee();
		employeePJ.setName("Podolski");
		employeePJ.setHiringType(HiringTypeEnum.PJ);
		employeePJ.setSalary(new BigDecimal(10000));

		Employee employeeInternship = new Employee();
		employeeInternship.setName("Vitor");
		employeeInternship.setHiringType(HiringTypeEnum.INTERNSHIP);
		employeeInternship.setSalary(new BigDecimal(2000));

		annualSalaryAdjustment.calculateAnnualAdjustment(employeeCLT, new CalculatorAnnualSalaryAdjustmentCLT());
		annualSalaryAdjustment.calculateAnnualAdjustment(employeePJ, new CalculatorAnnualSalaryAdjustmentPJ());
		annualSalaryAdjustment.calculateAnnualAdjustment(employeeInternship, new CalculatorAnnualSalaryAdjustmentInternship());

		System.out.println(employeeCLT);
		System.out.println(employeePJ);
		System.out.println(employeeInternship);

	}

}
