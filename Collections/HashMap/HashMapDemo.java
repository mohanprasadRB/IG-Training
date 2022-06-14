package com.java.Collections.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> numberMapping = new HashMap<String, Integer>();

		numberMapping.put("one", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 3);
		numberMapping.put("Four", 4);
		numberMapping.put("Five", 5);
		numberMapping.put(null, 6);

		System.out.println(numberMapping);

		// check Hashmap is empty
		System.out.println(numberMapping.isEmpty());

		// Find Size of HashMap
		System.out.println(numberMapping.size());

		// check if key Exists
		if (numberMapping.containsKey("Four"))
			System.out.println("Exist");

		// check if Value Exists
		if (numberMapping.containsValue(4))
			System.out.println("Exist");

		// Get Value by Key
		Integer v1 = numberMapping.get("one");
		System.out.println(v1);

		// Remove keys from HashMap
		numberMapping.remove("one");
		System.out.println(numberMapping);

		// Get only Keys from HashMap
		Set<String> keys = numberMapping.keySet();
		System.out.println(keys);

		Collection<Integer> values = numberMapping.values();
		System.out.println(values);

		// Iteration over Hashmap
		for (Entry<String, Integer> entry : numberMapping.entrySet()) {
			System.out.print("Key => " + entry.getKey());
			System.out.println(" Value => " + entry.getValue());
		}

		// using Iterator
		Set<Map.Entry<String, Integer>> entries = numberMapping.entrySet();

		Iterator<Map.Entry<String, Integer>> itr = entries.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println("Key->" + entry.getKey() + " value ->" + entry.getValue());

		}

		// Hashmap using Java8
		numberMapping.forEach((k, v) -> {
			System.out.print("k : " + k);
			System.out.println("   v : " + v);
		});

	}
}
