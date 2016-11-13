package mx.iteso.mediator.aircrafts.impl;

import mx.iteso.mediator.commandCenter.Mediator;
import mx.iteso.mediator.aircrafts.Aircraft;

/**
 * Created by fernando on 10/11/16.
 */
public class Helicopter extends Aircraft {

    public Helicopter(Mediator controlTower, String name) {
        super(controlTower);
        this.name = name;
    }

    public String receiveMessage(String message) {
        return this.getName() + "receive: " + message;
    }
}
