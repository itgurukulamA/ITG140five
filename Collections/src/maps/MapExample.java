package maps;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String> map= new HashMap<Integer,String>();
		map.put(101,"dhoni");
		map.put(102,"rohith");
		map.put(103,"kohli");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		Map<Integer,String> map1= new HashMap<Integer,String>();
		map1.put(101,"dhoni");
		map1.put(102,"rohith");
		map1.put(103,"kohli");
		map.putAll(map1);
		System.out.println(map1);
		map.remove(1);
		
		
	}

}
