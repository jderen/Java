package labKontenery;
import java.util.*;


public class MojSet {
		private Iterator<String> iterator;
public void addSet(Set<String> set,int amountElements) {
		long start=System.nanoTime();
		for(int i=0;i<amountElements;i++) {
			set.add("tekst"+i);
		}
		long end=System.nanoTime();
		long calosc=end-start;
		if(set instanceof TreeSet) {
			System.out.println("czas dodawania "+amountElements+" elementow TreeSet w nanosekundach to: "+calosc);
			
		}
		if(set instanceof HashSet) {
			System.out.println("czas dodawania "+amountElements+" elementow HashSet w nanosekundach to: "+calosc);
		}
	}
public void getSet(Set<String> set,int amountElements) {
		long start=System.nanoTime();
		iterator=set.iterator();
		int ktory=0;
		String string[]=new String[amountElements];
		while (iterator.hasNext()) {
			string[ktory] = iterator.next();
        if (ktory == amountElements)break;           
        	ktory++;
	}
		long end=System.nanoTime();
		long calosc=end-start;
		if(set instanceof TreeSet) {
			System.out.println("czas pobierania "+amountElements+" elementow TreeSet w nanosekundach to: "+calosc);
			
		}
		if(set instanceof HashSet) {
			System.out.println("czas pobierania "+amountElements+" elementow HashSet w nanosekundach to: "+calosc);
		}
}
public void printSet(Set<String> set,int amountElements) {
	long start=System.nanoTime();
	iterator=set.iterator();
	for(Object s:set) {
		System.out.println(iterator.next());
	}
	long end=System.nanoTime();
	long calosc=end-start;
	if(set instanceof TreeSet) {
		System.out.println("czas drukowania "+amountElements+" elementow TreeSet w nanosekundach to: "+calosc);
		
	}
	if(set instanceof HashSet) {
		System.out.println("czas drukowania "+amountElements+" elementow HashSet w nanosekundach to: "+calosc);
	}
}
}
