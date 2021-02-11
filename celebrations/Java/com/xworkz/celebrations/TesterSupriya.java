package com.xworkz.celebrations;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Properties;

public class TesterSupriya {

	public static void main(String[] args) {
		//HashTable
		//IdentityMap
		
		Map<String, String> map = new TreeMap<String, String>((a,b)->b.compareTo(a));
		map.put("Jai ho", "Vijay Prakash");
		map.put("Kabira", "Arijith singh");
		map.put("Kali quarter bottle", "Vijay Prakash");
		map.put("Pefect", "Ed Sheeran");
		map.put("Happy Agide", "All Ok");
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		entrySet.forEach(entry-> System.out.println("Song is: "+entry.getKey()+"Singer is: "+entry.getValue()));
		
		map.forEach((k,v)-> System.out.println(k+" "+v));
		
		Properties properties = new Properties();
		properties.setProperty("Name", "Email");
		properties.getProperty("Name");
	}

}
