package by.tc.task01.dao.impl;

import java.util.HashMap;
import java.util.Map;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;

public interface Command {
	public Appliance execute(Object[] obj);
	
}
class LaptopCreator implements Command{
	public Appliance execute(Object[] obj){
		Laptop laptop = new Laptop();
		laptop.setBatteryCapacity((double) obj[0]);
		laptop.setOs((String) obj[1]);
		laptop.setMemoryROM((double) obj[2]);
		laptop.setSystemMemory((double) obj[3]);
		laptop.setCpu((double) obj[4]);
		laptop.setDisplayInchs((double) obj[5]);
		return laptop;
    }
}
 
class OvenCreator implements Command{
	public Appliance execute(Object[] obj){
		Oven oven = new Oven();
		oven.setPowerConsumption((double) obj[0]);
		oven.setWeight((double) obj[1]);
		oven.setCapacity((double) obj[2]);
		oven.setDepth((double) obj[3]);
		oven.setHeight((double) obj[4]);
		oven.setWidth((double) obj[5]);
		return oven;
    }
}
 
class RefrigeratorCreator implements Command{
	public Appliance execute(Object[] obj){
		Refrigerator refrigerator = new Refrigerator();
		refrigerator.setPowerConsumption((double) obj[0]);
		refrigerator.setWeight((double) obj[1]);
		refrigerator.setFreezerCapacity((double) obj[2]);
		refrigerator.setOverallCapacity((double) obj[3]);
		refrigerator.setHeight((double) obj[4]);
		refrigerator.setWidth((double) obj[5]);
		return refrigerator;
	}
}

class VacuumCleanerCreator implements Command{
	public Appliance execute(Object[] obj){
		VacuumCleaner vacuumCleaner = new VacuumCleaner();
		vacuumCleaner.setPowerConsumption((double) obj[0]);
		vacuumCleaner.setFilterType((String) obj[1]);
		vacuumCleaner.setBagType((String) obj[2]);
		vacuumCleaner.setWandType((String) obj[3]);
		vacuumCleaner.setMotorSpeedRegulation((double) obj[4]);
		vacuumCleaner.setCleaningWidth((double) obj[5]);
		return vacuumCleaner;
	}
}

class TabletPCCreator implements Command{
	public Appliance execute(Object[] obj){
		TabletPC tabletPC = new TabletPC();
		tabletPC.setBatteryCapacity((double) obj[0]);
		tabletPC.setDisplayInches((double) obj[1]);
		tabletPC.setMemoryROM((double) obj[2]);
		tabletPC.setFlashMemoryCapacity((double) obj[3]);
		tabletPC.setColor((String) obj[4]);
		return tabletPC;
	}
}

class SpeakersCreator implements Command{
	public Appliance execute(Object[] obj){
		Speakers speakers = new Speakers();
		speakers.setPowerConsumption((double) obj[0]);
		speakers.setNumberOfSpeakers((double) obj[1]);
		speakers.setFrequencyRange((String) obj[2]);
		speakers.setCordLength((double) obj[3]);
		return speakers;
	}
}

class ApplianceDirector{
	
	Map<String, Command> map = new HashMap<>();
               
	ApplianceDirector(){
		map.put("Oven", new OvenCreator());
		map.put("Laptop", new LaptopCreator());
		map.put("Refrigerator", new RefrigeratorCreator());
		map.put("VacuumCleaner", new VacuumCleanerCreator());
		map.put("TabletPC", new TabletPCCreator());
		map.put("Speakers", new SpeakersCreator());
    	}
               
    	Command getCommand(String typeName){
		Command command;
		command = map.get(typeName);
		return command;
	}
}
