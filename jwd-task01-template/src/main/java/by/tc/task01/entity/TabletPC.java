package by.tc.task01.entity;


public class TabletPC extends Appliance{

	// you may add your own code here
	private double batteryCapacity;
	private double displayInches;
	private double memoryROM;
	private double flashMemoryCapacity;
	private String color;
	public double getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public double getDisplayInches() {
		return displayInches;
	}
	public void setDisplayInches(double displayInches) {
		this.displayInches = displayInches;
	}
	public double getMemoryROM() {
		return memoryROM;
	}
	public void setMemoryROM(double memoryROM) {
		this.memoryROM = memoryROM;
	}
	public double getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}
	public void setFlashMemoryCapacity(double flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}
	public String getColor() {
		return color;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(batteryCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		temp = Double.doubleToLongBits(displayInches);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(flashMemoryCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(memoryROM);
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
		TabletPC other = (TabletPC) obj;
		if (Double.doubleToLongBits(batteryCapacity) != Double.doubleToLongBits(other.batteryCapacity)) {
			return false;
		}
		if (color == null) {
			if (other.color != null) {
				return false;
			}
		} else if (!color.equals(other.color)) {
			return false;
		}
		if (Double.doubleToLongBits(displayInches) != Double.doubleToLongBits(other.displayInches)) {
			return false;
		}
		if (Double.doubleToLongBits(flashMemoryCapacity) != Double.doubleToLongBits(other.flashMemoryCapacity)) {
			return false;
		}
		if (Double.doubleToLongBits(memoryROM) != Double.doubleToLongBits(other.memoryROM)) {
			return false;
		}
		return true;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "TabletPC :batteryCapacity=" + batteryCapacity + ", displayInches=" + displayInches + ", memoryROM="
				+ memoryROM + ", flashMemoryCapacity=" + flashMemoryCapacity + ", color=" + color + ";";
	}
}
