package org.droidplanner.core.drone.variables;

import org.droidplanner.core.drone.DroneInterfaces.DroneEventsType;
import org.droidplanner.core.drone.DroneVariable;
import org.droidplanner.core.model.Drone;

public class MissionStats extends DroneVariable {
    private double distanceToWp = 0;
    private int currentWP = -1;
    private int lastReachedWP = -1;

    public MissionStats(Drone myDrone) {
        super(myDrone);
    }

    public void setDistanceToWp(double disttowp) {
        this.distanceToWp = disttowp;
    }

    public void setWpno(int seq) {
        if (seq != currentWP) {
            this.currentWP = seq;
            myDrone.notifyDroneEvent(DroneEventsType.MISSION_WP_UPDATE);
        }
    }

    public void setLastReachedWaypointNumber(int seq) {
        if (seq != lastReachedWP) {
            this.lastReachedWP = seq;
            myDrone.notifyDroneEvent(DroneEventsType.MISSION_WP_REACHED);
        }
    }

    public int getCurrentWP() {
        return currentWP;
    }

    public int getLastReachedWP(){
        return lastReachedWP;
    }

    public double getDistanceToWP() {
        return distanceToWp;
    }

}
