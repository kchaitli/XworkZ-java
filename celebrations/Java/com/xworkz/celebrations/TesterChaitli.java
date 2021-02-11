package com.xworkz.celebrations;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesterChaitli {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String name="Elon Musk";
		int age=49;
		
		map.put(name, age);
		map.put("Steve Jobs", 54);
		map.put("Kalam", 83);
		map.put("Lakshmi V", 22);
		map.put("yash", 35);
		map.put("skanda", 22);
		map.put("pasha", 22);
		map.put(null, null);
		map.put("Rohan", null);
		System.out.println(map.size());
		
		Integer value = map.get("yash");
		System.out.println(value);
		
		Set<String> keys = map.keySet();
		
		keys.forEach(anything->{
			Integer v = map.get(anything);
			System.out.println(anything+" age is "+v);
		});
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println(entrySet.size());
		entrySet.forEach(r->{
			System.out.println(r.getKey());
			System.out.println(r.getValue());
		});
	}

}
