package com.collectionsExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		System.out.println("****** Using Hash Map******");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1000);
		map.put("b", 1900);
		map.put("d", 1900);
		map.put("c", 1800);
		
		Set<Map.Entry<String,Integer>> set = map.entrySet();
		for(Map.Entry<String, Integer> me:set) {
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		
		System.out.println("****** Using Tree Map******");
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("a", 1000);
		tm.put("b", 1900);
		tm.put("d", 1900);
		tm.put("c", 1800);
		
		Set<Map.Entry<String,Integer>> set1 = tm.entrySet();
		for(Map.Entry<String, Integer> me:set1) {
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		
	}

}
