package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Customer;
import com.travelcompany.eshop.domain.Itinerary;
import com.travelcompany.eshop.domain.Ticket;
import com.travelcompany.eshop.enumeration.PaymentMethod;

import java.util.ArrayList;
import java.util.List;

public class TicketServiceImpl implements TicketService {
    private static List<Ticket> tickets = new ArrayList<>();

    @Override
    public void create(Customer customer, Itinerary itinerary, PaymentMethod paymentMethod) {
        Long id = tickets.size() + 1L;
        tickets.add(new Ticket(id, customer, itinerary));
    }

    @Override
    public List<Ticket> findAll() {
        return tickets;
    }
}
