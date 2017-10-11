package by.tc.task01.entity;


public class VacuumCleaner extends Appliance{

	// you may add your own code here
	private double powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private double motorSpeedRegulation;
	private double cleaningWidth;
	public double getPowerConsumption() {
		return powerConsumption;
	}
	public void setPowerConsumption(double powerConsumption) {
		this.powerConsumption = powerConsumption;
	}
	public String getFilterType() {
		return filterType;
	}
	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}
	public String getBagType() {
		return bagType;
	}
	public void setBagType(String bagType) {
		this.bagType = bagType;
	}
	public String getWandType() {
		return wandType;
	}
	public void setWandType(String wandType) {
		this.wandType = wandType;
	}
	public double getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}
	public void setMotorSpeedRegulation(double motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}
	public double getCleaningWidth() {
		return cleaningWidth;
	}
	public void setCleaningWidth(double cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bagType == null) ? 0 : bagType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(cleaningWidth);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((filterType == null) ? 0 : filterType.hashCode());
		temp = Double.doubleToLongBits(motorSpeedRegulation);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(powerConsumption);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((wandType == null) ? 0 : wandType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		VacuumCleaner other = (VacuumCleaner) obj;
		if (bagType == null) {
			if (other.bagType != null) {
				return false;
			}
		} else if (!bagType.equals(other.bagType)) {
			return false;
		}
		if (Double.doubleToLongBits(cleaningWidth) != Double.doubleToLongBits(other.cleaningWidth)) {
			return false;
		}
		if (filterType == null) {
			if (other.filterType != null) {
				return false;
			}
		} else if (!filterType.equals(other.filterType)) {
			return false;
		}
		if (Double.doubleToLongBits(motorSpeedRegulation) != Double.doubleToLongBits(other.motorSpeedRegulation)) {
			return false;
		}
		if (Double.doubleToLongBits(powerConsumption) != Double.doubleToLongBits(other.powerConsumption)) {
			return false;
		}
		if (wandType == null) {
			if (other.wandType != null) {
				return false;
			}
		} else if (!wandType.equals(other.wandType)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "VacuumCleaner :powerConsumption=" + powerConsumption + ", filterType=" + filterType + ", bagType="
				+ bagType + ", wandType=" + wandType + ", motorSpeedRegulation=" + motorSpeedRegulation
				+ ", cleaningWidth=" + cleaningWidth + ";";
	}
	
}
