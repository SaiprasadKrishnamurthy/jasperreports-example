package be.nbb.jasper;

import java.util.ArrayList;
import java.util.List;

import be.nbb.jasper.domain.Address;
import be.nbb.jasper.domain.Person;

public class PersonDataSourceFactory {

    public PersonDataSourceFactory() {
    }

    /**
     * Create a list of {@link Person}s with {@link Address}es
     * 
     * @return the items
     */
    public static List<Person> getPersonList() {
        return createPersons(createAddresses());
    }

    public static List<Person> createPersons(final List<Address> addresses) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Peter", "Janssens", addresses.subList(0, 5)));
        personList.add(new Person("Jan", "Peeters", addresses.subList(0, 1)));
        personList.add(new Person("Tom", "Janssens", addresses.subList(2, 4)));
        personList.add(new Person("Piet", "Pieters", addresses.subList(4, 5)));
        return personList;
    }

    public static List<Address> createAddresses() {
        List<Address> addresses = new ArrayList<Address>();
        addresses.add(new Address.Builder().setStreet("Berlaimontlaan 14").setCity("Brussel").setZipCode("1000").build());
        addresses.add(new Address.Builder().setStreet("Koekoekstraat 70").setCity("Melle").setZipCode("9111").build());
        addresses.add(new Address.Builder().setStreet("Wetstraat 1").setCity("Brussel").setZipCode("1000").build());
        addresses.add(new Address.Builder().setStreet("Veldstraat 2").setCity("Gent").setZipCode("9000").build());
        addresses.add(new Address.Builder().setStreet("Meir 5").setCity("Antwerpen").setZipCode("2000").build());
        return addresses;
    }

}
