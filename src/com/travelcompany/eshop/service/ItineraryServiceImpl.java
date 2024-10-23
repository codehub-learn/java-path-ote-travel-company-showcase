package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Itinerary;

import java.util.ArrayList;
import java.util.List;

public class ItineraryServiceImpl implements ItineraryService {
    private static List<Itinerary> itineraries = new ArrayList<>();

    @Override
    public void add(Itinerary itinerary) {
        itinerary.setId(itineraries.size() + 1L);
        itineraries.add(itinerary);
    }

    @Override
    public Itinerary get(Long id) {
        for (Itinerary itinerary : itineraries) {
            if (itinerary.getId().equals(id)) {
                return itinerary;
            }
        }
        return null;
    }
}
