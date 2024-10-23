package com.travelcompany.eshop;

import com.travelcompany.eshop.domain.Customer;
import com.travelcompany.eshop.domain.Itinerary;
import com.travelcompany.eshop.enumeration.AirportCode;
import com.travelcompany.eshop.enumeration.Category;
import com.travelcompany.eshop.enumeration.Nationality;
import com.travelcompany.eshop.enumeration.PaymentMethod;
import com.travelcompany.eshop.service.*;

import java.math.BigDecimal;

public class TravelCompanyEShop {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerServiceImpl();
        ItineraryService itineraryService = new ItineraryServiceImpl();
        TicketService ticketService = new TicketServiceImpl();

        customerService.add(new Customer("Dionysis Petrotos", "d.petrotos@codehub.gr",
                "Stadiou 2", Nationality.GREEK, Category.BUSINESS));
        customerService.add(new Customer("Giannis", "giannis@example.com",
                "Stadiou 1", Nationality.GREEK, Category.INDIVIDUAL));

        System.out.println(customerService.findAll());

        itineraryService.add(new Itinerary(AirportCode.ATH, AirportCode.PAR, "2024-30-11 09:00:00", "Some Airline", BigDecimal.valueOf(300L)));

        ticketService.create(customerService.get(1L), itineraryService.get(1L), PaymentMethod.CASH);
        System.out.println(ticketService.findAll());
    }
}
