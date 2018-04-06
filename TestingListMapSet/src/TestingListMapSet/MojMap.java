package labKontenery;

import java.util.*;

public class MojMap {
	public void addMap(Map<Integer,String> map,int amountElements) {
		long start=System.nanoTime();
		for(int i=0;i<amountElements;i++) {
			map.put(i,"tekst");
		}
		long end=System.nanoTime();
		long calosc=end-start;
		if(map instanceof TreeMap) {
			System.out.println("czas dodawania "+amountElements+" elementow TreeMap w nanosekundach to: "+calosc);
			
		}
		if(map instanceof HashMap) {
			System.out.println("czas dodawania "+amountElements+" elementow HashMap w nanosekundach to: "+calosc);
		}
	}
public void getMap(Map<Integer,String> map,int amountElements) {
		long start=System.nanoTime();
		for(int i=0;i<amountElements;i++) {
			map.get(i);
		}
		long end=System.nanoTime();
		long calosc=end-start;
		if(map instanceof TreeMap) {
			System.out.println("czas pobierania "+amountElements+" elementow TreeMap w nanosekundach to: "+calosc);
			
		}
		if(map instanceof HashMap) {
			System.out.println("czas pobierania "+amountElements+" elementow HashMap w nanosekundach to: "+calosc);
		}
}
public void printMap(Map<Integer,String> map,int amountElements) {
	long start=System.nanoTime();
	Iterator <Map.Entry<Integer, String>>iterator=map.entrySet().iterator();
	int ktory=0;
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
		if(ktory==amountElements)ktory++;
	}
	long end=System.nanoTime();
	long calosc=end-start;
	if(map instanceof TreeMap) {
		System.out.println("czas drukowania "+amountElements+" elementow TreeMap w nanosekundach to: "+calosc);
		
	}
	if(map instanceof HashMap) {
		System.out.println("czas drukowania "+amountElements+" elementow HashMap w nanosekundach to: "+calosc);
	}
}
}
