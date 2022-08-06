package Exercise3;
/*
3) create a Person(name, age, position)

        create an object that models a Company 1 manager, the rest are welders, carpenters, plumbers

        - getManager(): Person  - checks all persons and returns the one with position "manager"

        - getPersons(String profession):List<Person>  - returns all the persons that have the received profession

        - getPersonsOlder(int age): List<Person> - returns all the persons that are older than received age

        - getPerson(String filterName):List<Person> - returns all the persons that have names that contain the received string

        - employ(Person) - employs a person. Adds it to the list of persons
 */
public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        company.employ(new Person("Cipri", 42, "manager"));
        company.employ(new Person("Ciprius", 36, "manager"));
        company.employ(new Person("Marcel", 26, "welder"));
        company.employ(new Person("Marius", 37, "carpenter"));
        company.employ(new Person("Mircea", 31, "plumber"));
        company.employ(new Person("Andrei", 28, "welder"));
        company.employ(new Person("Denis", 19, "carpenter"));
        company.employ(new Person("Razvan", 35, "plumber"));
        company.employ(new Person("Andrei", 49, "carpenter"));
        company.employ(new Person("balls", 34, "capenter"));

        System.out.println(company.getManager());
        System.out.println(company.getPersons("welder"));
        System.out.println(company.getPersonsOlder(30));
        System.out.println(company.getPerson("Andrei"));
    }
}
