package org.dxctraining.dao;

import org.dxctraining.entities.Guest;

import java.util.HashMap;
import java.util.Map;

public class GuestStore {
    private static Map<String, Guest>guestMap=new HashMap<>();
    public static Map<String,Guest>getGuestMap()
    {
        return guestMap;
    }
}
