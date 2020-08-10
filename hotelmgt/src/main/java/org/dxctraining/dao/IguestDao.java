package org.dxctraining.dao;

import org.dxctraining.entities.Guest;

import java.util.List;

public interface IguestDao {
    public Guest findById(String id);
    public void remove(String id);
    public void register(Guest guest);
    public List<Guest> guestlist();

}
