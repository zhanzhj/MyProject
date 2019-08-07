package com.map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class TestMap {
	Map map = new ConcurrentHashMap();

	Map<String,Object> map2 = new HashMap(16);

	Map map3 = new Hashtable();

	Map map4 = new ConcurrentHashMap();

	public static void  main(String[] args){
		Map<String, Object> pMap = new HashMap<>();
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		pMap.put("list", list);
		List<String> list2 = (List<String>) pMap.get("list");
		Iterator<String> iterator = list2.iterator();
		while (iterator.hasNext()){
			String next = iterator.next();
			if("B".equals(next)){
				iterator.remove();
			}
		}
		System.out.print(pMap);
	}
}
