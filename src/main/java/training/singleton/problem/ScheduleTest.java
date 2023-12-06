package training.singleton.problem;

public class ScheduleTest {
	
	public static void main(String[] args) {
		
		schedule("Friday");
		schedule("Saturday");
		
	}
	
	public static void schedule(String day) {
		
		Schedule schedule = new Schedule();
		schedule.book(day);
		System.out.println(schedule.getDays());
		
	}

}
