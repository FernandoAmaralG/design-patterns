package training.templateMethod.solution;

public abstract class RepairVehicleService {

	public void repair() {
		workshopEntrance();
		dataAnalytics();
		if(vehicleNeedsRepair()) {
			repairVehicle();
			notifyRepairForInsuranceCompany();
		} else {
			notifyTotalLossForInsuranceCompany();
		}
	}
	
	protected abstract boolean vehicleNeedsRepair();
	
	public void notifyRepairForInsuranceCompany() {
		System.out.println("Notify repair...");
	}
	
	public void notifyTotalLossForInsuranceCompany() {
		System.out.println("Notify total loss...");
	}
	
	public void repairVehicle() {
		System.out.println("Repair vehicle...");
	}
	
	private void dataAnalytics() {
		System.out.println("Analyzing data...");
	}
	
	private void workshopEntrance() {
		System.out.println("Vehicle entering the workshop...");
	}
	
}
