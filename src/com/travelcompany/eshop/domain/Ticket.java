package com.travelcompany.eshop.domain;

public class Ticket {
    private Long id;
    private Customer customer;
    private Itinerary itinerary;
    // Add paymentMethod and paymentAmount fields

    public Ticket(Long id, Customer customer, Itinerary itinerary) {
        this.id = id;
        this.customer = customer;
        this.itinerary = itinerary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Itinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", customer=" + customer +
                ", itinerary=" + itinerary +
                '}';
    }
}
