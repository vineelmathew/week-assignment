package org.dxctraining.dao;

import org.dxctraining.entities.Guest;
import org.dxctraining.exceptions.GuestNotFoundException;

import java.util.*;

public class GuestDaoImplem implements IguestDao{
private Map<String,Guest> guestMap=new HashMap<>();








    @Override
    public Guest findById(String id) {
        Guest guestid=guestMap.get(id);
        if(guestid==null)
        {
            throw new GuestNotFoundException("Guest not found");
        }
        return guestid;
    }

    @Override
    public void remove(String id) {
        guestMap.remove(id);

    }
    @Override
    public void Register(Guest guest) {
        String id=guest.getId();
        String name=guest.getName();
        guestMap.put(id,guest);
        guest.setId(id);
    }
    @Override
    public List<Guest> guestlist() {
Collection<Guest> guestCollection=guestMap.values();
List<Guest>guestlist=new ArrayList<>();
for(Guest guest:guestCollection)
{
    guestlist.add(guest);
}
return guestlist;
    }
}
