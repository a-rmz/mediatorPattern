package mx.iteso.mediator.commandCenter;

import mx.iteso.mediator.aircrafts.Aircraft;

/**
 * Created by a-rmz on 11/10/16.
 */
public interface Mediator {

    void distributeMessage(String message, Aircraft aircraft);
    void registerAircraft(Aircraft aircraft);

}
