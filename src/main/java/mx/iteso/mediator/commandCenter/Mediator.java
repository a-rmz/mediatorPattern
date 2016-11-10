package mx.iteso.mediator.commandCenter;

import mx.iteso.mediator.aircrafts.Aircraft;

import java.util.ArrayList;

/**
 * Created by a-rmz on 11/10/16.
 */
public interface Mediator {

    public void distributeMessage(String message, Aircraft aircraft);
    public void registerAircraft(Aircraft aircraft);

}
