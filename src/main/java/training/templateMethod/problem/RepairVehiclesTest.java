package training.templateMethod.problem;

import training.templateMethod.VehicleForRepair;

public class RepairVehiclesTest {
	
	public static void main(String[] args) {
		
		System.out.println("------------------------------Luxo-------------------------------");

		
		VehicleForRepair luxuryVehicle = new VehicleForRepair();
		luxuryVehicle.setDamagePercentage(49);
		
		LuxuryVehicleRepairService rpl = new LuxuryVehicleRepairService(luxuryVehicle);
		
		rpl.repair();
		
		System.out.println("-----------------------------Commmon------------------------------");
		
		VehicleForRepair commonVehicle = new VehicleForRepair();
		commonVehicle.setDamagePercentage(71);
		
		CommonVehicleRepairService rpc = new CommonVehicleRepairService(commonVehicle);
		rpc.repair();
		
	}

}
