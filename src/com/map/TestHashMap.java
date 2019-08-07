package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args){
		Map<String,Object> map = new HashMap(16);
		map.put("ABC", "121212");
		map.put("ABCD", "121212");
		map.put("ACD", "121212");
		map.put("ABD", "121212");
		map.put("ABCE", "121212");
		map.put("BBCD", "121212");
		map.put("CBCD", "121212");
		map.put("DBCD", "121212");
		map.put("EBCD", "121212");
		map.put("HBCD", "121212");
		map.put("IBCD", "121212");

		Set<Map.Entry<String, Object>> entries = map.entrySet();
		for(Map.Entry<String, Object> entry : entries){
			System.out.println("key="+ entry.getKey() + "hashCode"+ entry.hashCode());
		}
	}
}
