package com.github.mehrunessky.demo.blog.mother;

import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class PersonMother {

    @NonNull
    private Person person;

    public static PersonMother man() {
        return new PersonMother(
                new Person(
                        "Name", "firstName", 39
                )
        );
    }

    public static PersonMother woman() {
        return new PersonMother(
                new Person(
                        "Name", "firstName", 12
                )
        );
    }

    public PersonMother withLastName(String name) {
        this.person = new Person(
                name,
                person.firstName(),
                person.age()
        );
        return this;
    }

    public Person build() {
        return person;
    }
}
