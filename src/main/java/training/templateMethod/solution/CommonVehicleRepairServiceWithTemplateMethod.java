package training.templateMethod.solution;

import training.templateMethod.VehicleForRepair;

public class CommonVehicleRepairServiceWithTemplateMethod extends RepairVehicleService {

	private VehicleForRepair vehicleForRepair;

	public CommonVehicleRepairServiceWithTemplateMethod(VehicleForRepair vehicleForRepair) {
		this.vehicleForRepair = vehicleForRepair;
	}

	@Override
	protected boolean vehicleNeedsRepair() {
		return vehicleForRepair.getDamagePercentage() <= 70;
	}
}
