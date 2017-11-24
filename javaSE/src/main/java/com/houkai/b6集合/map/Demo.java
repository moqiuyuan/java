package com.houkai.b6集合.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo {
	public static <E> void main(String[] args) {
		//set集合用到的map集合的东西
		Map map1 = new HashMap<Object, Object>();
		Map map2 = new TreeMap<Object, Object>();
		Map map3 = new Hashtable<Object, Object>();  //和hashMap一样  但是线程安全  hashtable的key值不可以null hashmap可以
		//添加
		map1.put("1", "a");
		map1.put("2", "b");
		map1.put("3", "c");
		//判断
		System.out.println(map1.containsKey("a"));
		System.out.println(map1.containsValue("a"));
		//获取
		System.out.println(map1.get("1"));
		System.out.println(map1.size());
		System.out.println(map1.values().toArray()[0]);
		
		//---------遍历1
		Set set = map1.entrySet();
		Iterator<Map> it = set.iterator();
		while(it.hasNext()){
			//Map<K,V>.Entry<K,V>
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		
		//---------遍历2
		Set s = map1.keySet();
		Iterator i = s.iterator();
		while(i.hasNext()){
			Object a = i.next();
			System.out.println(a+"---"+map1.get(a));
		}

	}
}
