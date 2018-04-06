package labKontenery;

import java.util.*;

public class Main {
	public static void main(String[] args) {
	MojSet mojset=new MojSet();
	HashSet<String> stringHashSet = new HashSet<>();
    TreeSet<String> stringTreeSet= new TreeSet<>();
	
    mojset.addSet(stringHashSet, 5);
    mojset.addSet(stringTreeSet, 5);
    
    mojset.getSet(stringHashSet, 5);
    mojset.getSet(stringTreeSet, 5);
    
    mojset.printSet(stringHashSet, 5);
    mojset.printSet(stringTreeSet, 5);
    
    MojList mojlist=new MojList();
    ArrayList<String> arrayList = new ArrayList<>();
    LinkedList<String> linkedList = new LinkedList<String>();

    mojlist.addList(arrayList, 5);
    mojlist.addList(linkedList, 5);
    
    mojlist.getList(arrayList, 5);
    mojlist.getList(linkedList, 5);
    
    mojlist.printList(arrayList, 5);
    mojlist.printList(linkedList, 5);
    
    MojMap mojmap=new MojMap();
    
    TreeMap<Integer,String> treeMap=new TreeMap<>();
    HashMap<Integer,String> hashMap=new HashMap<>();
    
    
    mojmap.addMap(treeMap, 5);
    mojmap.addMap(hashMap, 5);
    
    mojmap.getMap(treeMap, 5);
    mojmap.getMap(hashMap, 5);
    
    mojmap.printMap(treeMap, 5);
    mojmap.printMap(hashMap, 5);
    
    
    
	}
}
