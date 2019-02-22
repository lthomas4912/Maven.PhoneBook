package com.zipcodewilmington.phonebook;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    private Map<String,String>phoneBook = new TreeMap<>();


    public void add(String name, String number){

        phoneBook.put(name, number);
    }

    public void remove(String name) {
        phoneBook.remove(name);
    }


    public int size() {
        return phoneBook.size();
    }


    public Map<String, String> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(Map<String, String> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String lookup(String name) {
        String number = phoneBook.get(name);
        return number;
    }

}
