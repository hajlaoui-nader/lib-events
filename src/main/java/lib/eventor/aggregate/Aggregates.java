package lib.eventor.aggregate;


import lib.eventor.Event;
import lib.eventor.MissingApplyEventMethodStrategy;
import lib.eventor.exception.client.MissingApplyMethodException;

import java.util.List;

/**
 * Created by naderhajlaoui on 03/12/2017.
 */
public class Aggregates {

    public static <T extends Aggregate<T>> T applyEventsToMutableAggregate(T aggregate, List<Event> events, MissingApplyEventMethodStrategy missingApplyEventMethodStrategy) {
        for (Event event : events) {
            try {
                aggregate = aggregate.applyEvent(event);
            } catch (MissingApplyMethodException e) {
                missingApplyEventMethodStrategy.handle(aggregate, e);
            }
        }
        return aggregate;
    }

}
