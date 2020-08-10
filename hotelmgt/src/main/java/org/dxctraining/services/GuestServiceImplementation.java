package org.dxctraining.services;

import org.dxctraining.dao.GuestDaoImplem;
import org.dxctraining.dao.IguestDao;
import org.dxctraining.entities.Guest;
import org.dxctraining.exceptions.NullException;

import java.util.List;
public class GuestServiceImplementation implements IguestService{
    private IguestDao guestDao=new GuestDaoImplem();
    @Override
    public void register(Guest guest) {
        guestDao.register(guest);
    }
    @Override
    public void removeGuest(String id) {
     validateId(id);
     guestDao.remove(id);
    }

    private void validateId(String id) {
        if(id==null || id.isEmpty())
        {
            throw  new NullException("id cant be empty and null");
        }
    }
    @Override
    public List<Guest> display() {
        List<Guest>list=guestDao.guestlist();
        return list;
    }
    @Override
    public Guest findById(String id) {
        validateId(id);
        Guest guest=guestDao.findById(id);
        return guest;
    }
}
