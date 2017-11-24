package com.houkai.b6����.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo {
	public static <E> void main(String[] args) {
		//set�����õ���map���ϵĶ���
		Map map1 = new HashMap<Object, Object>();
		Map map2 = new TreeMap<Object, Object>();
		Map map3 = new Hashtable<Object, Object>();  //��hashMapһ��  �����̰߳�ȫ  hashtable��keyֵ������null hashmap����
		//���
		map1.put("1", "a");
		map1.put("2", "b");
		map1.put("3", "c");
		//�ж�
		System.out.println(map1.containsKey("a"));
		System.out.println(map1.containsValue("a"));
		//��ȡ
		System.out.println(map1.get("1"));
		System.out.println(map1.size());
		System.out.println(map1.values().toArray()[0]);
		
		//---------����1
		Set set = map1.entrySet();
		Iterator<Map> it = set.iterator();
		while(it.hasNext()){
			//Map<K,V>.Entry<K,V>
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
		
		//---------����2
		Set s = map1.keySet();
		Iterator i = s.iterator();
		while(i.hasNext()){
			Object a = i.next();
			System.out.println(a+"---"+map1.get(a));
		}

	}
}
