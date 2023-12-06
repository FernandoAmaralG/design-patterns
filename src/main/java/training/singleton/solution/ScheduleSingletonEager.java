package training.singleton.solution;

import java.util.HashMap;
import java.util.Map;

public class ScheduleSingletonEager {
	
	private static final ScheduleSingletonEager INSTANCE = new ScheduleSingletonEager();
	
	private Map<String, Boolean> availableDays = new HashMap<>();
	
	private ScheduleSingletonEager() {
		availableDays.put("Sunday", Boolean.TRUE);
		availableDays.put("Monday", Boolean.TRUE);
		availableDays.put("Tuesday", Boolean.TRUE);
		availableDays.put("Wednesday", Boolean.TRUE);
		availableDays.put("Thursday", Boolean.TRUE);
		availableDays.put("Friday", Boolean.TRUE);
		availableDays.put("Saturday", Boolean.TRUE);
	}
	
	public static ScheduleSingletonEager getInstance() {
		
		return INSTANCE;
		
	}
	
	public Map<String, Boolean> getDays() {
		
		return availableDays;
		
	}
	
	public void book(String day) {
		
		availableDays.replace(day, Boolean.FALSE);
		
	}

}
