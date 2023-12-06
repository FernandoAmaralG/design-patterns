package training.singleton.solution;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestScheduleWithSingleton {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		ScheduleSingletonEnum schedule1 = ScheduleSingletonEnum.getInstance();
		ScheduleSingletonEnum schedule2 = ScheduleSingletonEnum.getInstance();

		System.out.println(schedule1.hashCode());
		System.out.println(schedule2.hashCode());
		
		//REFLECTION possible to use in Singleton EAGER & LAZY
		Constructor<ScheduleSingletonLazy> jokerConstructor = ScheduleSingletonLazy.class.getDeclaredConstructor();
		jokerConstructor.setAccessible(true);
		
		ScheduleSingletonLazy jokerSchedule1 = jokerConstructor.newInstance();
		ScheduleSingletonLazy jokerSchedule2 = jokerConstructor.newInstance();
		
		System.out.println(jokerSchedule1);
		System.out.println(jokerSchedule2);
		
		scheduleDayEnum("Friday");
		scheduleDayEnum("Saturday");
		
	}

	public static void scheduleDayEager(String day) {
		
		ScheduleSingletonEager schedule = ScheduleSingletonEager.getInstance();
		schedule.book(day);
		System.out.println(schedule.getDays());
		
	}
	
	public static void scheduleDayLazy(String day) {
		
		ScheduleSingletonLazy schedule = ScheduleSingletonLazy.getInstance();
		schedule.book(day);
		System.out.println(schedule.getDays());
		
	}
	
	public static void scheduleDayEnum(String day) {
		
		ScheduleSingletonEnum schedule = ScheduleSingletonEnum.getInstance();
		schedule.book(day);
		System.out.println(schedule.getDays());
		
	}

}
