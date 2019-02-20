package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {

    @Test

    public void addTest(String name, String phoneNumber){

        //Given
        String expectedName = "";
        String expectedNumber = "";

        //When
        PhoneBook phoneBook = new PhoneBook();

        //Then
        String actualName = phoneBook.getName();
        String acutalNumber = phoneBook.getNumber();

        Assert.
    }
}
