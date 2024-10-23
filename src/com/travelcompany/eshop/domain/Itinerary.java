package com.travelcompany.eshop.domain;

import com.travelcompany.eshop.enumeration.AirportCode;

import java.math.BigDecimal;

public class Itinerary {
    private Long id;
    private AirportCode destination;
    private AirportCode departure;
    private String date;
    private String airline;
    private BigDecimal price;

    public Itinerary(AirportCode destination, AirportCode departure, String date, String airline, BigDecimal price) {
        this.destination = destination;
        this.departure = departure;
        this.date = date;
        this.airline = airline;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AirportCode getDestination() {
        return destination;
    }

    public void setDestination(AirportCode destination) {
        this.destination = destination;
    }

    public AirportCode getDeparture() {
        return departure;
    }

    public void setDeparture(AirportCode departure) {
        this.departure = departure;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Itinerary{" +
                "id=" + id +
                ", destination=" + destination +
                ", departure=" + departure +
                ", date='" + date + '\'' +
                ", airline='" + airline + '\'' +
                ", price=" + price +
                '}';
    }
}
