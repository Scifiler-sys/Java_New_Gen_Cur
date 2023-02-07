import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Map.Entry;

import CustomCollection.CustomArray;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("============= List Interface =============");

        //ArrayList
        //Like an array but dynamically changing size
        //Random access O(1)
        //Insert and removal is still O(n)
        List<Integer> listOfInt = new ArrayList<>();

        //Since it inherits the List interface it will have all the methods available there
        listOfInt.add(10);

        //LinkedList
        //Works like the linked list DS
        //Traversal is O(n)
        //Insert and removal is O(1)
        listOfInt = new LinkedList<>();

        listOfInt.add(10);

        //Vector
        //Thread-safe implementation of ArrayList
        //Have dynamically changing size
        //Slower than ArrayList since it is a legacy class (old)
        //Useful if you are using asynchronous programming
            //Ex: two methods running at the same time
        listOfInt = new Vector<>();

        listOfInt.add(10);

        System.out.println("============= Set Interface =============");
        
        // HashSet
        // Does not maintain the order
        // Uses the hash algorithm 
            //The process of converting something into a numerical representation of it
        // O(1) for add, removal, and retrieval
        // O(n) for traversal
        Set<Integer> set = new HashSet<>();
        set.add(10);

        //TreeSet
        //Maintains the sorted order whenever something is inserted
        //O(log(n)) for add, removal due to the sorting it inheritly does
        //Since it is sorted, searching for a value is O(log(n))
        set = new TreeSet<>();
        set.add(5);
        set.add(10);
        set.add(1);
        System.out.println(set);

        System.out.println("=============== Iterable and Iterator =================");
        CustomArray ca = new CustomArray(10);
        for (Integer integer : ca) {
            System.out.println(integer);
        }

        System.out.println("=============== Map =================");
        //Map does not implement the collection interface
        //It doesn't implement Iterable, what does that tell you?
        //Key - value pair
        //Useful for cases like a setting menu or phonebook, basically any data retrieval that needs more description than using zero-based indexing

        Map<String, String> someMap = new HashMap();
        // someMap.add() add method doesn't exist because again doesn't inherit collection interface
        someMap.put("someKey", "someValue");
        someMap.put("anotherKey", "anotherValue");

        //So how can we traverse in a map that doesn't implement iterable?
        //There is a nice method in map that converts our map into a Set which does implement iterable
        //We usually don't iterate through a map so this is rarely used
        Set<Entry<String, String>> aSetVersionOfMap = someMap.entrySet();
        for (Entry<String,String> entry : aSetVersionOfMap) {
            System.out.println(entry);
        }

        //TreeMap
        //It is sorted like a TreeSet
        //It will also sort the order for you as you add more items to this map
        someMap = new TreeMap<>();
        someMap.put("someKey", "someValue");

        //HashTable
        //Similar to how Vector is to ArrayList
        //thread-safe version of HashMap
        someMap = new Hashtable<>();

        System.out.println("================= Collections class ====================");
        //A bunch of static methods with useful behaviors that can be utilize by most things that inherit collection interface
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add(new Random().nextInt(10));
        }

        System.out.println(randomNumbers);

        Collections.sort(randomNumbers); //For fun, it uses merge sort for Java 8, newer version of Java uses even more optimized sorts that was discovered

        System.out.println(randomNumbers);

        int result = Collections.binarySearch(randomNumbers, 5); //Uses binary search algo to find something, must be sorted!
        System.out.println(result);

        
    }
}
