package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO{

	//@Override
	ApplianceDirector director = new ApplianceDirector();
	 
	public <E> Appliance find(Criteria<E> criteria) {
		
		Appliance appliance = null;
		String file = "src"+File.separator +"main" +File.separator +"resources"+ File.separator + "appliances_db.txt";
		BufferedReader bufferedReader = null;
		try {   
			bufferedReader = new BufferedReader(new FileReader(file));
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				if(isRightApplianceType(criteria, line)){
					if (isRightAppliance(criteria, line)){
						appliance = createAppliance(line);
						break;
					} 
				}else{
					skipLines(bufferedReader,3);
				}
			}
		} catch (IOException e){
			 e.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {    
					e.printStackTrace();
				}   
			}  
		}
		return appliance;
	}
	private <E> boolean isRightApplianceType(Criteria<E> criteria, String line) {
		String applianceType = line.split("\\s")[0];
		return applianceType.equalsIgnoreCase(criteria.getApplianceType());
	}
	private Appliance createAppliance(String line) {
		Appliance appliance;
		String applianceType = line.split("\\s")[0];
		Command command = director.getCommand(applianceType);
		Object[] obj = getParametr(line);
		appliance = command.execute(obj);
		return appliance;
	}
	private void skipLines(BufferedReader br, int n) throws IOException {
		for (int i=0;i<n;i++){
			br.readLine();
		}
	}

	protected <E> boolean isRightAppliance(Criteria <E> criteria,String applianceString) {
		for (Entry <E, Object> criterion : criteria.getCriteria().entrySet()){
			String criteriaApplianceString = criterion.toString().toLowerCase();
			Pattern pattern = Pattern.compile(criteriaApplianceString+"(,|;)");
			Matcher matcher = pattern.matcher(applianceString.toLowerCase());
			if(!matcher.find()) {
				return false;
			}
		}
		return true;
	}
	
	protected Object[] getParametr(String applianceString){
		Object[] obj = new Object[6];
		Pattern pattern = Pattern.compile("(=([0-9.a-zA-Z-]+),)|(=([0-9.a-zA-Z-]+|);)");
        	Matcher matcher = pattern.matcher(applianceString);
        	int i = 0;
		while(matcher.find()){
			Pattern pattern2 = Pattern.compile("([0-9.a-zA-Z-]+)");
			Matcher matcher2 = pattern2.matcher(matcher.group());
			if(matcher2.find()){
				if(matcher2.group().matches("[0-9.]+")){
				obj[i] =  Double.parseDouble(matcher2.group());
				}else{
					obj[i] = matcher2.group();
				}
				i++;
			}
		}
		return obj;
	}

}


//you may add your own new classes
