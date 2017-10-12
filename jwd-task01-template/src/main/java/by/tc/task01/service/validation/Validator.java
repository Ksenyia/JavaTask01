package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.Speakers;

import java.util.Map;

import static by.tc.task01.entity.criteria.SearchCriteria.*;


public class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		
		Map <E, Object > criteriaMap = criteria.getCriteria();
		
		String applianceType = criteria.getApplianceType();
		if(criteriaMap.isEmpty()){
			return false;
		}
		if(applianceType.equalsIgnoreCase("Oven")){
			for(E criterion : criteriaMap.keySet()) {
				Object value =criteriaMap.get(criterion);
				try{
					if(check((Oven)criterion, value)){
						continue;
					}else{
						return false;
					}
				}
				catch(ClassCastException E){
					return false;
				}
			}
			return true;
		}
		if(applianceType.equalsIgnoreCase("Laptop")){
			for(E criterion : criteriaMap.keySet()) {
				Object value = criteriaMap.get(criterion);
				try{
					if(check((Laptop)criterion, value)){
						continue;
					}else{
						return false;
					}
				}
				catch(ClassCastException E){
					return false;
				}
			}
			return true;
		}
		if(applianceType.equalsIgnoreCase("Refrigerator")){
			for(E criterion : criteriaMap.keySet()) {
				Object value =criteriaMap.get(criterion);
				try{
					if(check((Refrigerator)criterion, value)){
						continue;
					}else{
						return false;
					}
				}
				catch(ClassCastException E){
					return false;
				}
			}
			return true;
		}
		if(applianceType.equalsIgnoreCase("VacuumCleaner")){
			for(E criterion : criteriaMap.keySet()) {
				Object value =criteriaMap.get(criterion);
				try{
					if(check((VacuumCleaner)criterion, value)){
						continue;
					}else{
						return false;
					}
				}
				catch(ClassCastException E){
					return false;
				}
			}
			return true;		
		}
		if(applianceType.equalsIgnoreCase("TabletPC")){
			for(E criterion : criteriaMap.keySet()) {
				Object value = criteriaMap.get(criterion);
				try{
					if(check((TabletPC)criterion, value)){
						continue;
					}else{
						return false;
					}
				}
				catch(ClassCastException E){
					return false;
				}
			}
			return true;
		}		
		if(applianceType.equalsIgnoreCase("Speakers")){
			for(E criterion : criteriaMap.keySet()) {
				Object value =criteriaMap.get(criterion);
				try{
					if(check((Speakers)criterion, value)){
						continue;
					}else{
						return false;
					}
				}
				catch(ClassCastException E){
					return false;
				}
			}
			return true;
		}
		return false;
	}

	private static boolean checkInt(Object value){
		try{
			Integer.parseInt(value.toString());
			return true;
		}catch(NumberFormatException E){
			try{
				double d = (double)value;
				if((d - Math.ceil(d))==0){
					return true;
				}else{
					return false;
				}
			}
			catch(ClassCastException e){
				return false;
			}
		}
	}	
	private static boolean checkDouble(Object value){
		try{
			Double.parseDouble(value.toString());
			return true;
			}
			catch(NumberFormatException e){
				return false;
			}
		}
	private static boolean checkStr(Object value){
		try{
			@SuppressWarnings("unused")
			String d = (String)value;
			return true;
		}
		catch(ClassCastException E){
			try{
				@SuppressWarnings("unused")
				char d = (char)value;
				return true;
			}catch(ClassCastException e){
				try{
					@SuppressWarnings("unused")
					char[] d = (char[])value;
					return true;
				}catch(ClassCastException e2){
					return false;
				}
			}
		}
	}

	private static boolean check(Speakers criterion, Object value){
		if (criterion.equals(Speakers.FREQUENCY_RANGE)){
			return checkStr(value);
		}else{
			if(criterion.equals(Speakers.CORD_LENGTH)||criterion.equals(Speakers.NUMBER_OF_SPEAKERS)||criterion.equals(Speakers.POWER_CONSUMPTION)){
				return checkInt(value);
			}
		}
		return false;
	}
	private static boolean check(VacuumCleaner criterion, Object value){
		if (criterion.equals(VacuumCleaner.BAG_TYPE)||criterion.equals(VacuumCleaner.FILTER_TYPE)||criterion.equals(VacuumCleaner.WAND_TYPE)){
			return checkStr(value);
		}else{
			if (criterion.equals(VacuumCleaner.CLEANING_WIDTH)||criterion.equals(VacuumCleaner.MOTOR_SPEED_REGULATION)||criterion.equals(VacuumCleaner.POWER_CONSUMPTION)){
			return checkInt(value);
			}
		}
		return false;
	}
	private static boolean check(Laptop criterion, Object value){
		if (criterion.equals(Laptop.CPU)||criterion.equals(Laptop.MEMORY_ROM)){
			return (checkDouble(value));
		}
		else{
			if(criterion.equals(Laptop.OS)){
					return checkStr(value);
			}else {
				if(criterion.equals(Laptop.DISPLAY_INCHS)||criterion.equals(Laptop.SYSTEM_MEMORY)||criterion.equals(Laptop.MEMORY_ROM)){
					return checkInt(value);
				}
			}
		}
		return false;
	}
	private static boolean check(Refrigerator criterion, Object value){
		if (criterion.equals(Refrigerator.OVERALL_CAPACITY)){
			return (checkDouble(value));
		}else{
			if(criterion.equals(Refrigerator.FREEZER_CAPACITY)
					||criterion.equals(Refrigerator.HEIGHT)
					||criterion.equals(Refrigerator.POWER_CONSUMPTION)
					||criterion.equals(Refrigerator.WEIGHT)
					||criterion.equals(Refrigerator.WIDTH)){
				return checkInt(value);
			}
		}
		return false;
	}
	private static boolean check(TabletPC criterion, Object value){
		if (criterion.equals(TabletPC.COLOR)){
			return checkStr(value);
		}else{
			if(criterion.equals(TabletPC.BATTERY_CAPACITY)
					||criterion.equals(TabletPC.DISPLAY_INCHES)
					||criterion.equals(TabletPC.FLASH_MEMORY_CAPACITY)
					||criterion.equals(TabletPC.MEMORY_ROM)){
				return checkInt(value);
			}
		}
		return false;
	}
	private static boolean check(Oven criterion, Object value){
		if (criterion.equals(Oven.HEIGHT)||criterion.equals(Oven.WIDTH)){
			return (checkDouble(value));
		}else{
			if(criterion.equals(Oven.CAPACITY)
					||criterion.equals(Oven.DEPTH)
					||criterion.equals(Oven.POWER_CONSUMPTION)
					||criterion.equals(Oven.WEIGHT)){
				return checkInt(value);
			}
		}
		return false;
	}
}
