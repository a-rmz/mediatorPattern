package mx.iteso.mediator.aircrafts.impl;

import mx.iteso.mediator.aircrafts.Aircraft;
import mx.iteso.mediator.commandCenter.Mediator;

/**
 * Created by fernando on 10/11/16.
 */
public class Jet extends Aircraft {

    public Jet(Mediator controlTower, String name) {
        super(controlTower);
        this.name = name;
    }

    public String receiveMessage(String message) {
        return this.getName() + "receive: " + message;
    }

}
