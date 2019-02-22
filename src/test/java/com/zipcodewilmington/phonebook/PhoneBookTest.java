package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook();



    @Test

    public void addTest(){

        //Given


        //When
        phoneBook.add("Sheila", "3028578983");



        //Then
        int expected = phoneBook.size();
        int actual = 1;

        Assert.assertEquals(expected,actual);


    }

    @Test

    public void removeTest(){
        //Given
        phoneBook.add("Sheila", "3028578983");

        //When
        phoneBook.remove("Sheila");


        //Then
        int expected = phoneBook.size();
        int actual = 0;
        Assert.assertEquals(expected,actual);

    }

    @Test

    public void lookUpTest(){
        //Given
        String name = "Sheila";
        phoneBook.add("", "");
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("");

        //When


        //Then
        Assert.assertEquals(expected,actual);


    }



}
