package by.tc.task01.entity;


public  class Speakers extends Appliance{

	// you may add your own code here
	private double powerConsumption;
	private double numberOfSpeakers;
	private String frequencyRange;
	private double cordLength;
	public String getFrequencyRange() {
		return frequencyRange;
	}
	public void setFrequencyRange(String frequencyRange) {
		this.frequencyRange = frequencyRange;
	}
	
	public double getPowerConsumption() {
		return powerConsumption;
	}
	public void setPowerConsumption(double powerConsumption) {
		this.powerConsumption = powerConsumption;
	}
	public double getNumberOfSpeakers() {
		return numberOfSpeakers;
	}
	public void setNumberOfSpeakers(double numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}
	public double getCordLength() {
		return cordLength;
	}
	public void setCordLength(double cordLength) {
		this.cordLength = cordLength;
	}
	@Override
	public String toString() {
		return "Speakers :powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", frequencyRange=" + frequencyRange + ", cordLength=" + cordLength + ";";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cordLength);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((frequencyRange == null) ? 0 : frequencyRange.hashCode());
		temp = Double.doubleToLongBits(numberOfSpeakers);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(powerConsumption);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Speakers other = (Speakers) obj;
		if (Double.doubleToLongBits(cordLength) != Double.doubleToLongBits(other.cordLength)) {
			return false;
		}
		if (frequencyRange == null) {
			if (other.frequencyRange != null) {
				return false;
			}
		} else if (!frequencyRange.equals(other.frequencyRange)) {
			return false;
		}
		if (Double.doubleToLongBits(numberOfSpeakers) != Double.doubleToLongBits(other.numberOfSpeakers)) {
			return false;
		}
		if (Double.doubleToLongBits(powerConsumption) != Double.doubleToLongBits(other.powerConsumption)) {
			return false;
		}
		return true;
	}
}
