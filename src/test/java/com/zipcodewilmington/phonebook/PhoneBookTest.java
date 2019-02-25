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
        String name = "Sheila";
        String number = "3028578983";

        //When
        phoneBook.add(name, number);

        //Then

        Assert.assertEquals(number,phoneBook.lookup(name));


    }

    @Test

    public void removeTest(){
        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Sheila";
        String number = "3028578983";

        //When
        phoneBook.add(name, number);
        phoneBook.removeName(name);


        //Then

        Assert.assertEquals(phoneBook,phoneBook.lookup(name));

    }

    @Test

    public void lookUpTest(){

        //Given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Sheila";
        String number = "3028578983";



        //When
        phoneBook.add(name, number);

        //Then
        Assert.assertEquals(phoneBook,phoneBook.lookup(name));

    }

    @Test

    public void testPrintListOfNames() {

        //Given
        PhoneBook phoneBook = new PhoneBook();

        String name1 = "Momma MayI";
        String name2 = "Chick Fila";
        String name3 = "Burger King";
        String num1 = "3024323385";
        String num2 = "1223455672";
        String num3 = "3930383833";
        String expected = "Momma MayI 3024323385\n"+
                          "Chick Fila 1223455672\n"+
                          "Burger King 3930383833\n";


        //When
        phoneBook.add(name3, num3);
        phoneBook.add(name2, num2);
        phoneBook.add(name1, num1);

        //Then

        Assert.assertEquals(expected, phoneBook.listNamesAndNumbers());
        }


}
