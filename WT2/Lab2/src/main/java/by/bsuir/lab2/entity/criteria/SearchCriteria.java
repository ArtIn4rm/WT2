package by.bsuir.lab2.entity.criteria;

public final class SearchCriteria {

	public static enum Teapot {
		COST, POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
	}

	public static enum Laptop {
		COST, BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS
	}

	public static enum Refrigerator {
		COST, POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
	}

	public static enum VacuumCleaner {
		COST, POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
	}

	public static enum TabletPC {
		COST, BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR
	}

	public static enum Speakers {
		COST, POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH
	}

	private SearchCriteria() {
	}
}
