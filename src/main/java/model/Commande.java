package model;

import lib.eventor.ReflectiveMutuableEventsProcessing;
import lombok.Builder;
import lombok.Data;

/**
 * Created by naderhajlaoui on 03/12/2017.
 */
@Data
@Builder
public class Commande extends ReflectiveMutuableEventsProcessing<Commande> {

    private String status = "new";

    public void apply(CommandCancelledEvent event) {
        status = "cancelled";
    }

    public void apply(CommandeFuckedEvent event) {
        status = "fucked";
    }

}
