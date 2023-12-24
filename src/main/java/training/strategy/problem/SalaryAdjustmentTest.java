package training.strategy.problem;

import java.math.BigDecimal;

import training.strategy.Employee;
import training.strategy.HiringTypeEnum;

public class SalaryAdjustmentTest {

	public static void main(String[] args) {
		
		AnnualSalaryAdjustment annualSalaryAdjustment = new AnnualSalaryAdjustment();
		
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
		
		annualSalaryAdjustment.calculateAnnualAdjustment(employeeCLT);
		annualSalaryAdjustment.calculateAnnualAdjustment(employeePJ);
		annualSalaryAdjustment.calculateAnnualAdjustment(employeeInternship);
		
		System.out.println(employeeCLT);
		System.out.println(employeePJ);
		System.out.println(employeeInternship);
		
	}
	
}
