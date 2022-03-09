package com.CollectionsTopic.org;

import java.util.HashMap;
import java.util.Map;

public class MapFunc {
	
	public static void main(String[] args) {
		
		Map<String,String> m = new HashMap <String, String>();
		m.put("Karur", "TN");
		m.put("Trichy", "TN");
		m.put("Coimbatore", "TN");
		m.put("Chennai", "TN");
		
		System.out.println(m);
		
		System.out.println(m.entrySet());
		
		System.out.println(m.keySet());
		
		System.out.println(m.values());
		
		int size = m.size();
		System.out.println(size);
		
	}

}
