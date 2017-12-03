package lib.eventor.exception;

/**
 * Created by naderhajlaoui on 03/12/2017.
 */
public class EventorException extends RuntimeException {
    public EventorException() {
    }

    public EventorException(String m) {
        super(m);
    }

    public EventorException(String m, Throwable e) {
        super(m, e);
    }

    public EventorException(Throwable t) {
        super(t);
    }
}
