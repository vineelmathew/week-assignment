package org.dxctraining.ui;

import org.dxctraining.entities.Guest;
import org.dxctraining.services.IguestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.List;
@Component
public class GuestUI {
@Autowired
private IguestService guestservice;
    @PostConstruct
    private void runApp() {
        Guest guest1=new Guest("Vineel","V11");
        Guest guest2=new Guest("Rudrapati","R22");
        Guest guest3=new Guest("Leo","L22");
        Guest guest4=new Guest("david","d22");
        guestservice.register(guest1);
        guestservice.register(guest2);
        guestservice.register(guest3);
        guestservice.register(guest4);
        showGuests();
    }

    private void showGuests() {
        List<Guest> list=guestservice.display();
        System.out.println("DISPLAYING ALL THE GUESTS");
        for(Guest guest:list)
        {
            displayGuest(guest);
        }
    }
    private void displayGuest(Guest guest) {
        String name=guest.getName();
        String id=guest.getId();
        System.out.println("The Name is="+name+" The id is="+id);
    }

}
