package lib.eventor;


import lib.eventor.exception.client.EventorApplyEventFailedUnexpectedlyException;
import lib.eventor.exception.client.MissingApplyMethodException;

import java.lang.reflect.InvocationTargetException;

/**
 * A mutable aggregate that uses reflection to apply events
 *
 * @param <T> the aggregate class
 * @see Event
 * Created by naderhajlaoui on 03/12/2017.
 */
public abstract class ReflectiveMutuableEventsProcessing<T extends ReflectiveMutuableEventsProcessing<T>> {

    /**
     * Apply an event by invoking an apply() method whose parameter class matches the event's class
     *
     * @param event the event representing the state change
     * @return this
     */
    public T applyEvent(Event event) {
        try {
            getClass().getMethod("apply", event.getClass()).invoke(this, event);
        } catch (InvocationTargetException e) {
            throw new EventorApplyEventFailedUnexpectedlyException(e.getCause());
        } catch (NoSuchMethodException e) {
            throw new MissingApplyMethodException(e, event);
        } catch (IllegalAccessException e) {
            throw new EventorApplyEventFailedUnexpectedlyException(e);
        }
        return (T) this;
    }

}
