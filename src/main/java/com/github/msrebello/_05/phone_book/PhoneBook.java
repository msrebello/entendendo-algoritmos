package com.github.msrebello._05.phone_book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PhoneBook {

    private Map<Person, List<Phone>> phonesPerPerson;

    public PhoneBook() {
        phonesPerPerson = new HashMap<>();
    }

    public void addPhonesPerson(Person person, List<Phone> phones) {
        Objects.requireNonNull(person, "Person cannot be null");
        Objects.requireNonNull(phones, "Phone cannot be null");

        phonesPerPerson.putIfAbsent(person, phones);
    }

    public Map<Person, List<Phone>> getPhonesPerPerson() {
        return phonesPerPerson;
    }
}
