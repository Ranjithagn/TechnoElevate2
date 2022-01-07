package map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {
public static void main(String[] args) {
	HashMap<Integer, String> hashMap = new HashMap<>();
	hashMap.put(1, "ramya");
	hashMap.put(2, "sunny");
	hashMap.put(3, "anushka");
	hashMap.put(2, "ranju");
	Set<Integer> keySet = hashMap.keySet();
	for(Integer i:keySet){
		System.out.println("keys: "+i+",values:"+hashMap.get(i));
	}
	Set<Entry<Integer, String>> entrySet = hashMap.entrySet();
	for(Entry<Integer,String> s:entrySet){
		System.out.println(s);
	}
}
}

