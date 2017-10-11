package by.tc.task01.entity;


public class Laptop extends Appliance{
	// you may add your own code here
    private double batteryCapacity ; 
	private String os;
	private double memoryROM;
	private double systemMemory;
	private double cpu;
	private double displayInchs;
	public double getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public double getMemoryROM() {
		return memoryROM;
	}
	public void setMemoryROM(double memoryROM) {
		this.memoryROM = memoryROM;
	}
	public double getSystemMemory() {
		return systemMemory;
	}
	public void setSystemMemory(double systemMemory) {
		this.systemMemory = systemMemory;
	}
	public double getCpu() {
		return cpu;
	}
	public void setCpu(double cpu) {
		this.cpu = cpu;
	}
	public double getDisplayInchs() {
		return displayInchs;
	}
	public void setDisplayInchs(double displayInchs) {
		this.displayInchs = displayInchs;
	}
	@Override
	public String toString() {
		return "Laptop :batteryCapacity=" + batteryCapacity + ", os=" + os + ", memoryROM=" + memoryROM
				+ ", systemMemory=" + systemMemory + ", cpu=" + cpu + ", displayInchs=" + displayInchs + ";";
	}

	public boolean equals(Object obj) {
		if(this==obj){
			return true;
		}
		if(obj==null){
			return false;
		}
		if(this.getClass() != obj.getClass()){
			return false;
		}
		Laptop laptop = (Laptop) obj;
		if(laptop.batteryCapacity!=this.batteryCapacity){
			return false;
		}
		if (laptop.cpu != this.cpu) {
			return false;
		}
		if (laptop.displayInchs != this.displayInchs) {
			return false;
		}
		if (laptop.memoryROM != this.memoryROM) {
			return false;
		}
		if (os == null) {
			if (this.os != null) {
				return false;
			}
		} else if (!os.equals(this.os)) {
			return false;
		}
		if (laptop.systemMemory != this.systemMemory) {
			return false;
		}
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(batteryCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(cpu);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(displayInchs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(memoryROM);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((os == null) ? 0 : os.hashCode());
		temp = Double.doubleToLongBits(systemMemory);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	
	
	
}
