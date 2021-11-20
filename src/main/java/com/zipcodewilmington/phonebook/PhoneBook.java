package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        this.phonebook = new LinkedHashMap<>(); // Used LinkedHasMap because it stores key bay order of insertion
    }

    public void add(String name, String phoneNumber) {
        List<String> phoneList = new ArrayList<>();
        this.phonebook.put(name, phoneList);
        this.phonebook.get(name).add(phoneNumber); //gets key and then add to arraylist in key
    }

    public void addAll(String name, String... phoneNumbers) {
        phonebook.put(name, Arrays.asList(phoneNumbers));
    }

    public void remove(String name) {
        this.phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        if (this.phonebook.containsKey(name)) {
            return true;
        }
        return false;
    }
    public boolean hasEntry2(String name, String phoneNumber) {
        if (this.phonebook.containsKey(name) || this.phonebook.containsValue(phoneNumber)) { // checks if phonebook either name or phone number
            return true;
        }
        return false;
    }
    public List<String> lookup(String name) {
        return this.phonebook.get(name);

    }

    public String reverseLookup(String phoneNumber) {
        return null;
    }

    public List<String> getAllContactNames() {
        List<String> listOfName = new ArrayList<>();
        for(String key : phonebook.keySet()){ // Iterate by using .keySet because Maps can't be iterated
         listOfName.add(key);

        }
        return listOfName;
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }


}
