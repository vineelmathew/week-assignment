package org.dxctraining.service;

import org.dxctraining.dao.GuestStore;
import org.dxctraining.entities.Guest;
import org.dxctraining.exceptions.GuestNotFoundException;
import org.dxctraining.exceptions.NullException;
import org.dxctraining.services.GuestServiceImplementation;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ServiceTest {

    GuestServiceImplementation guestservice;
    @BeforeEach
    public void beforeEach()
    {

        guestservice=new GuestServiceImplementation();
    }
    @AfterEach
    public void clear()
    {
        Map<String,Guest>guestMap= GuestStore.getGuestMap();
        guestMap.clear();
    }

    @Test
    public void test1()
    {
        Executable executable=()->guestservice.register(null);
        Assertions.assertThrows(NullPointerException.class,executable);
    }
    @Test
    public void findId()
    {
        int id=121;
        Executable executable=()->guestservice.findById(id+"");
        Assertions.assertThrows(GuestNotFoundException.class,executable);
    }

    @Test
    public void mainTest()
    {
        Guest guest1=new Guest("vineel","v22");
        Guest guest2=new Guest("vineel","v22");
        guestservice.register(guest1);
        guestservice.register(guest2);
        String storedid=guest1.getId();
        Map<String,Guest>guestMap=GuestStore.getGuestMap();
        Collection<Guest>guestCollection=guestMap.values();
        //Map size
        int actualsize=guestMap.size(); //actual is zero
        System.out.println(actualsize);
        Assertions.assertEquals(0,actualsize);   //failed testcases.
        String actualname=guest1.getName();
        Iterator<Guest> iterator=guestCollection.iterator();
        Guest gueststored=iterator.next();
        String storeid=guest1.getId();
        String actualid=gueststored.getId();
        Assertions.assertEquals(actualid,storedid);
    }


}
