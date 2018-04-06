package labKontenery;

import java.util.*;

public class MojList {

	public void addList(List<String> list,int amountElements) {
			long start=System.nanoTime();
			for(int i=0;i<amountElements;i++) {
				list.add("tekst"+i);
			}
			long end=System.nanoTime();
			long calosc=end-start;
			if(list instanceof ArrayList) {
				System.out.println("czas dodawania "+amountElements+" elementow ArrayList w nanosekundach to: "+calosc);
				
			}
			if(list instanceof LinkedList) {
				System.out.println("czas dodawania "+amountElements+" elementow LinkedList w nanosekundach to: "+calosc);
			}
		}
	public void getList(List<String> list,int amountElements) {
			long start=System.nanoTime();
			for(int i=0;i<amountElements;i++) {
				list.get(i);
			}
			long end=System.nanoTime();
			long calosc=end-start;
			if(list instanceof ArrayList) {
				System.out.println("czas pobierania "+amountElements+" elementow ArrayList w nanosekundach to: "+calosc);
				
			}
			if(list instanceof LinkedList) {
				System.out.println("czas pobierania "+amountElements+" elementow LinkedList w nanosekundach to: "+calosc);
			}
	}
	public void printList(List<String> list,int amountElements) {
		long start=System.nanoTime();

		for(int i=0;i<amountElements;i++) {
			System.out.println(list.get(i));
		}
		long end=System.nanoTime();
		long calosc=end-start;
		if(list instanceof ArrayList) {
			System.out.println("czas drukowania "+amountElements+" elementow ArrayList w nanosekundach to: "+calosc);
			
		}
		if(list instanceof LinkedList) {
			System.out.println("czas drukowania "+amountElements+" elementow LinkedList w nanosekundach to: "+calosc);
		}
	}
}
