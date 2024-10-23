package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Itinerary;

public interface ItineraryService {
    void add(Itinerary itinerary);
    Itinerary get(Long id);
}
