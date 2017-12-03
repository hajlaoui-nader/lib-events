package lib.eventor.exception.client;

import lib.eventor.Event;

public class MissingApplyMethodException extends EventorApplyEventFailedUnexpectedlyException {
    private final Event event;

    public MissingApplyMethodException(Throwable e, Event event) {
        super(e);
        this.event = event;
    }

    public Event getEvent() {
        return event;
    }
}
