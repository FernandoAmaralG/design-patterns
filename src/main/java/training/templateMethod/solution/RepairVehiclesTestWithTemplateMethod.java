package training.templateMethod.solution;

import training.templateMethod.VehicleForRepair;

public class RepairVehiclesTestWithTemplateMethod {

	public static void main(String[] args) {

		System.out.println("------------------------------Luxo-------------------------------");

		VehicleForRepair luxuryVehicle = new VehicleForRepair();
		luxuryVehicle.setDamagePercentage(51);

		RepairVehicleService rpl = new LuxuryVehicleRepairServiceWithTemplateMethod(luxuryVehicle);

		rpl.repair();

		System.out.println("-----------------------------Commmon------------------------------");

		VehicleForRepair commonVehicle = new VehicleForRepair();
		commonVehicle.setDamagePercentage(69);

		RepairVehicleService rpc = new CommonVehicleRepairServiceWithTemplateMethod(commonVehicle);
		rpc.repair();

	}

}
