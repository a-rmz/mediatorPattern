package mx.iteso.mediator.aircrafts.impl;

import mx.iteso.mediator.aircrafts.Aircraft;
import mx.iteso.mediator.commandCenter.Mediator;

/**
 * Created by a-rmz on 11/10/16.
 */
public class Airplane extends Aircraft {

    public Airplane(Mediator controlTower, String name) {
        super(controlTower);
        this.name = name;
    }

    String (String message) {
        return this.getName() + "receive: " + message;
    }

}
