package com.digitalacadamy.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class PersonTest {

    private final Person person = new Person("non", "bow", "Jane", 18);

    @Test
    void testGetPerson(){
        assertEquals("noon", person.getFirstName());
        assertEquals("bow", person.getLastName());
        assertEquals("jane", person.getNickName());
        assertEquals(18, person.getAge().intValue());

        assertAll("person",
                () -> assertEquals("noon", person.getFirstName()),
                () -> assertEquals("bow", person.getLastName()),
                () -> assertEquals("jane", person.getNickName()),
                () -> assertEquals(18, person.getAge().intValue())
        );

        String firstName1 = person.getFirstName();
        assertNotNull(firstName1);

        assertAll("first Name",
                () -> assertTrue(firstName1.startsWith("n")),
                () -> assertTrue(firstName1.endsWith("n"))
        );
    }

    @Test
    void TestNewPersonObject(){
        Person person = new Person();
        person.setFirstName("sukibong");
        person.setLastName("yeahyeah");
        person.setNickName("bong");
        person.setAge(20);

        String firstName = person.getFirstName();
        assertAll("first name",
                ()-> assertTrue(firstName.startsWith("s")),
                ()->assertTrue(firstName.endsWith("y"))
        );
    }



}