package setInterfaceAssignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetOperations {
	public static void main(String[] args) {
		Set<Person> hashSet = new HashSet<>(); 
		Set<Person> linkedHashSet = new LinkedHashSet<>();
		
		hashSet.add(new Person(1, "Alina", 30));
		hashSet.add(new Person(2, "Rebecca", 25));
		hashSet.add(new Person(3, "Charlie", 35));
		hashSet.add(new Person(1, "Alina", 30)); 

		linkedHashSet.add(new Person(1, "Roy", 30));
		linkedHashSet.add(new Person(2, "Joy", 25));
		linkedHashSet.add(new Person(3, "john", 35));
		linkedHashSet.add(new Person(2, "Joy", 25)); 

		System.out.println("HashSet: " + hashSet);
		System.out.println("LinkedHashSet: " + linkedHashSet);

		Set<Person> unionSet = union(hashSet, linkedHashSet);
		Set<Person> intersectionSet = intersection(hashSet, linkedHashSet);
		Set<Person> differenceSet1 = difference(hashSet, linkedHashSet);
		Set<Person> differenceSet2 = difference(linkedHashSet, hashSet);

		// Printing the results of set operations
		System.out.println("Union: " + unionSet);
		System.out.println("Intersection: " + intersectionSet);
		System.out.println("Difference (HashSet - LinkedHashSet): " + differenceSet1);
		System.out.println("Difference (LinkedHashSet - HashSet): " + differenceSet2);
	}

	private static void addPerson(Set<Person> set, Person person) {
		set.add(person);
	}
    private static Set<Person> union(Set<Person> set1, Set<Person> set2) {
		Set<Person> resultSet = new HashSet<>(set1);
		resultSet.addAll(set2);
		return resultSet;
	}
	private static Set<Person> intersection(Set<Person> set1, Set<Person> set2) {
		Set<Person> resultSet = new HashSet<>(set1);
		resultSet.retainAll(set2);
		return resultSet;
	}
	private static Set<Person> difference(Set<Person> set1, Set<Person> set2) {
		Set<Person> resultSet = new HashSet<>(set1);
		resultSet.removeAll(set2);
		return resultSet;
	}

}
