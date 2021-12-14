package by.bsuir.lab2.entity;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class VacuumCleaner extends Appliance {
	@XmlElement
	private int powerConsumption;
	@XmlElement
	private String filterType;
	@XmlElement
	private String bagType;
	@XmlElement
	private String wandType;
	@XmlElement
	private int motorSpeedRegulation;
	@XmlElement
	private int cleamotorSpeedRegulationingWidth;
	private int cleaningWidth;

	public VacuumCleaner(double price, int powerConsumption, String filterType, String bagType, String wandType,
			int motorSpeedRegulation, int cleaningWidth) {
		super(price);
		this.setPowerConsumption(powerConsumption);
		this.setFilterType(filterType);
		this.setBagType(bagType);
		this.setWandType(wandType);
		this.setMotorSpeedRegulation(motorSpeedRegulation);
		this.setCleaningWidth(cleaningWidth);
	}

	public VacuumCleaner() {
		super(0);
		this.setPowerConsumption(0);
		this.setFilterType("");
		this.setBagType("");
		this.setWandType("");
		this.setMotorSpeedRegulation(0);
		this.setCleaningWidth(0);
	}

	public int getCleaningWidth() {
		return cleaningWidth;
	}

	public void setCleaningWidth(int cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}

	public int getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}

	public void setMotorSpeedRegulation(int motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}

	public String getWandType() {
		return wandType;
	}

	public void setWandType(String wandType) {
		this.wandType = wandType;
	}

	public String getBagType() {
		return bagType;
	}

	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	@Override
	public String toString() {
		return String.format(
				"Vacuum cleaner:\n %s, Power consumption: %d, Filter type: %s, Bag type: %s, Wand type: %s, Motr speed regulation: %d, Cleaning width: %d",
				super.toString(), this.powerConsumption, this.filterType, this.bagType, this.wandType,
				this.motorSpeedRegulation, this.cleaningWidth);
	}
}
