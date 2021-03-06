package javasmmr.zoowsome.models.animals;

public class Owl extends Bird {
	private static long counter;
	private final long id = counter++;

	public Owl() {
		setName("Owl" + id);
		setNrOfLegs(2);
		setMigrate(true);
		setAvgFlightAltitude(2000);
	}

	public Owl(String name) {
		setName(name);
		setNrOfLegs(2);
		setMigrate(true);
		setAvgFlightAltitude(2000);
	}

	public Owl(int legs, Boolean migrate, int altitude) {
		setName("Owl" + id);
		setNrOfLegs(legs);
		setMigrate(migrate);
		setAvgFlightAltitude(altitude);
	}
}
