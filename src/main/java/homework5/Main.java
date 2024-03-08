package homework5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Person> compareByName = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };

        Comparator<Person> compareByAge = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };

        TreeSet<Person> personsSortedByName = new TreeSet<>(compareByName);
        personsSortedByName.add(new Person("Mihai", 36));
        personsSortedByName.add(new Person("Alexandru", 33));
        personsSortedByName.add(new Person("Darius", 7));

        System.out.println("Persons sorted by name:");
        for (Person person : personsSortedByName) {
            System.out.println(person.getName() + " " + person.getAge());
        }

        TreeSet<Person> personsSortedByAge = new TreeSet<>(compareByAge);
        personsSortedByAge.add(new Person("Mihai", 36));
        personsSortedByAge.add(new Person("Alexandru", 33));
        personsSortedByAge.add(new Person("Darius", 7));

        System.out.println("\nPersons sorted by age:");
        for (Person person : personsSortedByAge) {
            System.out.println(person.getName() + " " + person.getAge());
        }

        Map<Person, List<Hobby>> personHobbies = new HashMap<>();

        Person mihai = new Person("Mihai", 36);
        Person alexandru = new Person("Alexandru", 33);
        Person darius = new Person("Darius", 7);

        Hobby ciclism = new Hobby("Ciclism", 2, Arrays.asList(new Adress("Pandurilor", "Romania"), new Adress("Iederii", "Romania")));
        Hobby inot = new Hobby("Inot", 2, Arrays.asList(new Adress("Violetelor", "Romania"), new Adress("Palmierilor", "Romania")));

        personHobbies.put(mihai, Arrays.asList(ciclism, inot));
        personHobbies.put(alexandru, Arrays.asList(inot));
        personHobbies.put(darius, Arrays.asList(ciclism));

        // Exemplu pentru afișarea hobiurilor unei persoane specifice, cum ar fi Mihai
        if (personHobbies.containsKey(mihai)) {
            System.out.println(mihai.getName() + " are următoarele hobby-uri:");
            List<Hobby> hobbies = personHobbies.get(mihai);
            for (Hobby hobby : hobbies) {
                System.out.println("Hobby: " + hobby.getName());
                for (Adress address : hobby.getAddresses()) {
                    System.out.println("Locația: " + address.getAddress() + ", Țara: " + address.getCountry());
                }
            }
        } else {
            System.out.println("Nu am găsit hobby-uri pentru persoana " + mihai.getName());
        }
    }
}
