package com.com.service;

import java.util.List;

import com.comp.model.TheaterLayout;
import com.comp.model.TheaterRequest;

public interface TheaterSeatingService {
    
    TheaterLayout getTheaterLayout(String rawLayout);
    
    List<TheaterRequest> getTicketRequests(String ticketRequests);
    
    void processTicketRequests(TheaterLayout layout, List<TheaterRequest> requests);

}
