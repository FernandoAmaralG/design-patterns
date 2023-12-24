package training.strategy;

import java.math.BigDecimal;

public class Employee {

	private String name;
	
	private BigDecimal salary;
	
	private HiringTypeEnum hiringType;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public BigDecimal getSalary() {
		return salary;
	}
	
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	public HiringTypeEnum getHiringType() {
		return hiringType;
	}
	
	public void setHiringType(HiringTypeEnum hiringType) {
		this.hiringType = hiringType;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", hiringType=" + hiringType + "]";
	}
	
	
	
}
