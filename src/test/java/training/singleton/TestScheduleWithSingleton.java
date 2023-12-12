package training.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import training.singleton.solution.ScheduleSingletonEnum;

class TestScheduleWithSingleton {

	@Test
	void testToCheckIfAtributesRefersToTheSameInstance() {
		ScheduleSingletonEnum schedule1 = ScheduleSingletonEnum.getInstance();
		ScheduleSingletonEnum schedule2 = ScheduleSingletonEnum.getInstance();

		assertEquals(schedule1.hashCode(), schedule2.hashCode(), "Atributes refers to the same instance.");
	}

}
