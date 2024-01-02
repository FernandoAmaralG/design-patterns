package training.templateMethod.solution;

import training.templateMethod.VehicleForRepair;

public class LuxuryVehicleRepairServiceWithTemplateMethod extends RepairVehicleService {

	private VehicleForRepair vehicleForRepair;

	public LuxuryVehicleRepairServiceWithTemplateMethod(VehicleForRepair vehicleForRepair) {
		this.vehicleForRepair = vehicleForRepair;
	}

	@Override
	protected boolean vehicleNeedsRepair() {
		return vehicleForRepair.getDamagePercentage() <= 50;
	}
	
}
