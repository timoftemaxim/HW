import Person.Person;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Person> persons = new HashSet<>();

        persons.add(new Person("John", 25));
        persons.add(new Person("Jane", 62));
        persons.add(new Person("Mary", 54));
        persons.add(new Person("Peter", 80));

        for (Person person : persons) {
            if (person.getAge() > 60) {
                System.out.println(person.toString());
            }
        }
    }
}