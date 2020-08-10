package org.dxctraining.services;

import org.dxctraining.entities.Guest;

import java.util.List;

public interface IguestService {
    public void register(Guest guest);
    public void removeGuest(String id);
    public List<Guest>display();
    public Guest findById(String id);
}
