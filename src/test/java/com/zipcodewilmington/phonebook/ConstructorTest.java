package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ConstructorTest {
    @Test
    public void testNullaryConstructor() {
        // given

        // when
        PhoneBook phoneBook = new PhoneBook();

        // then
        Assert.assertTrue(phoneBook.getMap() instanceof LinkedHashMap); //changed it to from HashMap to LinkedHasMap
    }

    @Test
    public void testNonNullaryConstructor() {
        // given
        Map<String, List<String>> dependency = new HashMap<>();

        // when
        PhoneBook phoneBook = new PhoneBook(dependency);

        // then
        Assert.assertEquals(dependency, phoneBook.getMap());
    }
}
