package setInterfaceAssignment;

import java.util.HashSet;
import java.util.Set;

public class ConferenceClass {
	private Set<Person> attendees = new HashSet<>(); 

	
	public void addParticipant(Person person) {
		attendees.add(person);
	}
	public void removeParticipant(Person person) {
		attendees.remove(person);
	}
	public Set<Person> findDuplicateAttendees() {
		Set<Person> uniqueAttendees = new HashSet<>();
		Set<Person> duplicateAttendees = new HashSet<>();
		for (Person attendee : attendees) {
			if (!uniqueAttendees.add(attendee)) {
				duplicateAttendees.add(attendee);
			}
		}
		return duplicateAttendees;
	}
	public Set<Person> listUniqueAttendees() {
		return new HashSet<>(attendees);
	}
	public Set<Person> findAttendeesWithinAgeRange(int minAge, int maxAge) {
		Set<Person> result = new HashSet<>();
		for (Person attendee : attendees) {
			if (attendee.getAge() >= minAge && attendee.getAge() <= maxAge) {
				result.add(attendee);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		ConferenceClass conference = new ConferenceClass();

		// Adding participants to the conference
		conference.addParticipant(new Person(1, "Alina", 30));
		conference.addParticipant(new Person(2, "Rebecca", 25));
		conference.addParticipant(new Person(3, "Charlie", 35));
		conference.addParticipant(new Person(1, "Alina", 30)); // Duplicate

		// List of all attendees
		System.out.println("All Attendees: " + conference.attendees);
		// Find duplicate attendees
		System.out.println("Duplicate Attendees: " + conference.findDuplicateAttendees());
		// Find unique attendees
		System.out.println("Unique Attendees: " + conference.listUniqueAttendees());
		// Find attendees within age range 20-30
		System.out.println("Attendees aged 20-30: " + conference.findAttendeesWithinAgeRange(20, 30));
	}

}
