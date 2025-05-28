package com.github.msrebello._05.phone_book;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class PhoneBookDemo {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhonesPerson(
                new Person(1L, "Matheus"),
                List.of(new Phone(1L, "18 99809-6546"),
                        new Phone(1L, "18 99809-6546"),
                        new Phone(1L, "18 99809-6546"))
        );

        printPhoneBook(phoneBook);
        showAllNumbers(phoneBook);
    }

    private static void printPhoneBook(PhoneBook phoneBook) {
        phoneBook.getPhonesPerPerson()
                .forEach(((person, phones) -> {
                    StringBuilder builder = new StringBuilder();
                    builder
                            .append("Person: ")
                            .append(person.nome())
                            .append(" - ")
                            .append("His number(s): ");

                    phones.forEach(phone -> {
                        builder.append(" ").append(phone.number());
                    });

                    System.out.println(builder);
                })
        );
    }

    private static void showAllNumbers(PhoneBook phoneBook) {
        System.out.println("\nAll numbers:");

        Collection<List<Phone>> collection = phoneBook
                .getPhonesPerPerson()
                .values();
        collection.stream()
                .flatMap(List::stream)
                .map(Phone::number)
                .forEach(number -> System.out.printf("Number: %s", number));

    }

}
