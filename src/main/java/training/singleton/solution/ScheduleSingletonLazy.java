package training.singleton.solution;

import java.util.HashMap;
import java.util.Map;

public class ScheduleSingletonLazy {


	private Map<String, Boolean> availableDays = new HashMap<>();

	private ScheduleSingletonLazy() {
		availableDays.put("Sunday", Boolean.TRUE);
		availableDays.put("Monday", Boolean.TRUE);
		availableDays.put("Tuesday", Boolean.TRUE);
		availableDays.put("Wednesday", Boolean.TRUE);
		availableDays.put("Thursday", Boolean.TRUE);
		availableDays.put("Friday", Boolean.TRUE);
		availableDays.put("Saturday", Boolean.TRUE);
	}

	private static class BillPughSingleton {
		
		private static final ScheduleSingletonLazy INSTANCE = new ScheduleSingletonLazy();
		
	}
	
	public static ScheduleSingletonLazy getInstance() {
		
		return BillPughSingleton.INSTANCE;
		
	}

	public Map<String, Boolean> getDays() {

		return availableDays;

	}

	public void book(String day) {

		availableDays.replace(day, Boolean.FALSE);

	}

}
