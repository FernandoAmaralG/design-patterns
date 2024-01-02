package training.templateMethod.problem;

import training.templateMethod.VehicleForRepair;

public class CommonVehicleRepairService {
	
	private VehicleForRepair vehicleForRepair;
	
	public CommonVehicleRepairService(VehicleForRepair vehicleForRepair) {
		this.vehicleForRepair = vehicleForRepair;
	}
	
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
	
	private boolean vehicleNeedsRepair() {
		return vehicleForRepair.getDamagePercentage() <= 70;
	}
	
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
