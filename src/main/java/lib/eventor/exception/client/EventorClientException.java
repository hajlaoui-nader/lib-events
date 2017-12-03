package lib.eventor.exception.client;


import lib.eventor.exception.EventorException;

/**
 * Created by naderhajlaoui on 03/12/2017.
 */
public class EventorClientException extends EventorException {
    public EventorClientException() {
    }

    public EventorClientException(Throwable t) {
        super(t);
    }

    public EventorClientException(String m) {
        super(m);
    }
}
