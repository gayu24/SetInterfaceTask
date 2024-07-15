package setInterfaceAssignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PerformanceAnalysis {
	public static void main(String[] args) {
		int numElements = 1000000; 

		Set<Person> hashSet = new HashSet<>();
		long hashSetAddTime = measureAddPerformance(hashSet, numElements);
		long hashSetRemoveTime = measureRemovePerformance(hashSet, numElements);
		long hashSetContainsTime = measureContainsPerformance(hashSet, numElements);

		System.out.println("HashSet - Add Time: " + hashSetAddTime + "ms");
		System.out.println("HashSet - Remove Time: " + hashSetRemoveTime + "ms");
		System.out.println("HashSet - Contains Time: " + hashSetContainsTime + "ms");

		Set<Person> linkedHashSet = new LinkedHashSet<>();
		long linkedHashSetAddTime = measureAddPerformance(linkedHashSet, numElements);
		long linkedHashSetRemoveTime = measureRemovePerformance(linkedHashSet, numElements);
		long linkedHashSetContainsTime = measureContainsPerformance(linkedHashSet, numElements);

		System.out.println("LinkedHashSet - Add Time: " + linkedHashSetAddTime + "ms");
		System.out.println("LinkedHashSet - Remove Time: " + linkedHashSetRemoveTime + "ms");
		System.out.println("LinkedHashSet - Contains Time: " + linkedHashSetContainsTime + "ms");
	}
	
	private static long measureAddPerformance(Set<Person> set, int numElements) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numElements; i++) {
			set.add(new Person(i, "Person " + i, 20 + (i % 50)));
		}
		return System.currentTimeMillis() - startTime;
	}
	private static long measureRemovePerformance(Set<Person> set, int numElements) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numElements; i++) {
			set.remove(new Person(i, "Person " + i, 20 + (i % 50)));
		}
		return System.currentTimeMillis() - startTime;
	}
	private static long measureContainsPerformance(Set<Person> set, int numElements) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numElements; i++) {
			set.contains(new Person(i, "Person " + i, 20 + (i % 50)));
		}
		return System.currentTimeMillis() - startTime;
	}

}
