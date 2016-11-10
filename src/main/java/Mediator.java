import Aircrafts.Aircraft;

import java.util.ArrayList;

/**
 * Created by a-rmz on 11/10/16.
 */
public interface Mediator {

    public ArrayList<Aircraft> aircraftList = new ArrayList<Aircraft>();

    public void distributeMessage(Aircraft aircraft);
    public void registerAircraft(Aircraft aircraft);

}
