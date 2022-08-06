package Exercise3;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Person> personList = new ArrayList<>();

    public void employ(Person person) {
        if (person.getPosition().equals("manager") || person.getPosition().equals("welder") || person.getPosition().equals("carpenter") || person.getPosition().equals("plumber")) {
            if ((getManager() != null) && person.getPosition().equals("manager")) {
                System.out.println("The 'manager' position already taken!");
            } else {
                personList.add(person);
            }
        } else {
            System.out.println("'" + person.getPosition() + "' is unavailable. Please try something else.");
        }
    }

    public Person getManager() {
        for (Person person : personList) {
            if (person.getPosition().equals("manager")) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getPersons(String profession) {
        List<Person> listOfPeopleWithProfession = new ArrayList<>();
        for (Person person : personList) {
            if (person.getPosition().equals(profession)) {
                listOfPeopleWithProfession.add(person);
            }
        }
        return listOfPeopleWithProfession;
    }

    public List<Person> getPersonsOlder(int age) {
        List<Person> listOfPeopleOlderThan = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() > age) {
                listOfPeopleOlderThan.add(person);
            }
        }
        return listOfPeopleOlderThan;
    }

    public List<Person> getPerson(String filterName) {
        List<Person> listOfPeopleWithTheName = new ArrayList<>();
        for (Person person : personList) {
            if (person.getName().equals(filterName)) {
                listOfPeopleWithTheName.add(person);
            }
        }
        return listOfPeopleWithTheName;
    }
}
