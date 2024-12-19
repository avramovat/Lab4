package mk.ukim.finki.wp.lab1.service;

import mk.ukim.finki.wp.lab1.model.Event;
import mk.ukim.finki.wp.lab1.model.SavedBooking;

import java.util.List;
import java.util.Optional;

public interface EventService {
    List<Event> listAll();
    List<Event> searchEvents(String text);
    void deleteById(Long id);
    void changeEventRating(Long id, String type);
    Optional<Event> save(String name, String description, double popularityScore, Long locationId);
    Optional<Event> update(Long id, String name, String description, double popularityScore, Long locationId);
    Optional<Event> findById(Long id);
    List<Event> findAllByLocationId(Long locationId);
}