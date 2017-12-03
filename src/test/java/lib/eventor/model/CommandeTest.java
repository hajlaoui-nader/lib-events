package lib.eventor.model;

import model.CommandCancelledEvent;
import model.Commande;
import model.CommandeFuckedEvent;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by naderhajlaoui on 03/12/2017.
 */

public class CommandeTest {

    @Test
    public void should_appy_events_test() {
        Commande commande = Commande.builder().build();
        CommandeFuckedEvent commandeFuckedEvent = CommandeFuckedEvent.builder().build();
        CommandCancelledEvent commandCancelledEvent = CommandCancelledEvent.builder().build();

        commande.applyEvent(commandCancelledEvent);
        assertThat(commande.getStatus()).isEqualTo("cancelled");
        commande.applyEvent(commandeFuckedEvent);
        assertThat(commande.getStatus()).isEqualTo("fucked");
    }
}
