package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Customer;
import com.travelcompany.eshop.domain.Itinerary;
import com.travelcompany.eshop.domain.Ticket;
import com.travelcompany.eshop.enumeration.PaymentMethod;

import java.util.List;

public interface TicketService {
    void create(Customer customer, Itinerary itinerary, PaymentMethod paymentMethod);
    List<Ticket> findAll();
}
