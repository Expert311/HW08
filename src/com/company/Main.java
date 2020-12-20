package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        Address a1 = new Address("Minsk", "Kovaleva", 45);

        Person p1 = new Person("Minsk", "Kovaleva", 45, "Maxim", "Lobov");
        Person p2 = new Person("Minsk", "Lobanka", 66, "Ivan", "Ivanovich");
        Person p3 = new Person("Gomel", "Pushkina", 12, "Daniil", "Volkov");
        Person p4 = new Person("Minsk", "Botanicheskaya", 4, "Gleb", null);
        Person p5 = new Person("Minsk", "Lobanka", 66, null, "Ivanovich");
        Person p6 = new Person(null, null, 0, "Daniil", "Volkov");

        List<Person> myList = new LinkedList<>();
        myList.add(p1);
        myList.add(p2);
        myList.add(p3);
        myList.add(p4);
        myList.add(p5);
        myList.add(p6);

//        List<String> modified = myList
//                .stream()
//                .filter(Person -> Person.getImya() != null && Person.getFamiliya() != null && Person.getAddress() != null)

    }
}
