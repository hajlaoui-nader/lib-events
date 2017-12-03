package lib.eventor.aggregate;


import lib.eventor.Event;

/**
 * Base interface for an Aggregate that uses event sourcing
 *
 * @param <T> the aggregate class
 *            Created by naderhajlaoui on 03/12/2017.
 */
public interface Aggregate<T extends Aggregate<T>> {
    /**
     * Update the aggregate
     *
     * @param event the event representing the state change
     * @return the updated aggregate, which might be this
     */
    T applyEvent(Event event);
}
