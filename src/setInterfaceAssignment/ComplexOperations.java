package setInterfaceAssignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ComplexOperations {
	public static void main(String[] args) {
		Set<Person> hashSet = new HashSet<>(); 
		Set<Person> linkedHashSet = new LinkedHashSet<>(); 
		
		
		hashSet.add(new Person(1, "Alina", 30));
		hashSet.add(new Person(2, "Rebecca", 25));
		hashSet.add(new Person(3, "Charlie", 35));

		linkedHashSet.add(new Person(4, "Roy", 20));
		linkedHashSet.add(new Person(5, "Joy", 22));
		linkedHashSet.add(new Person(6, "John", 33));

		// Finding the Person with maximum age in HashSet
		System.out.println("Max age in HashSet: " + findMaxAge(hashSet));
		
		// Finding the Person with minium age in HashSet
		System.out.println("Min age in HashSet: " + findMinAge(hashSet));

		// Finding the Person with maximum age in linkedHashSet
		System.out.println("Max age in LinkedHashSet: " + findMaxAge(linkedHashSet));
		
		// Finding the Person with minium age in linkedHashSet
        System.out.println("Min age in LinkedHashSet: " + findMinAge(linkedHashSet));

		// Sorting the Persons objects in HashSet by age
		List<Person> sortedHashSet = sortByAge(hashSet);
		System.out.println("Sorted HashSet by age: " + sortedHashSet);

		// Sorting the Persons objects in LinkedHashSet by age
		List<Person> sortedLinkedHashSet = sortByAge(linkedHashSet);
		System.out.println("Sorted LinkedHashSet by age: " + sortedLinkedHashSet);

	}

	private static Person findMaxAge(Set<Person> set) {
		return set.stream().max(Comparator.comparingInt(Person::getAge)).orElse(null);
	}
    private static Person findMinAge(Set<Person> set) {
		return set.stream().min(Comparator.comparingInt(Person::getAge)).orElse(null);
	}
	private static List<Person> sortByAge(Set<Person> set) {
		List<Person> list = new ArrayList<>(set);
		list.sort(Comparator.comparingInt(Person::getAge));
		return list;
	}

	}


