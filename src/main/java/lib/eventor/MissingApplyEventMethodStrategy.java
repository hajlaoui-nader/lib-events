package lib.eventor;


import lib.eventor.aggregate.Aggregate;
import lib.eventor.exception.client.MissingApplyMethodException;

/**
 * Created by naderhajlaoui on 03/12/2017.
 */
public interface MissingApplyEventMethodStrategy {
    boolean supports(Aggregate aggregate, MissingApplyMethodException e);

    void handle(Aggregate aggregate, MissingApplyMethodException e);
}
