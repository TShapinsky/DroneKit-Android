package com.o3dr.services.android.lib.drone.mission.action;

import com.o3dr.services.android.lib.util.Utils;

/**
 * Created by Fredia Huya-Kouadio on 1/19/15.
 */
public class MissionActions {

    public static final String ACTION_GENERATE_DRONIE = Utils.PACKAGE_NAME + ".action.GENERATE_DRONIE";

    public static final String ACTION_SET_MISSION = Utils.PACKAGE_NAME + ".action.SET_MISSION";
    public static final String ACTION_START_MISSION = Utils.PACKAGE_NAME + ".action.START_MISSION";

    public static final String EXTRA_MISSION = "extra_mission";
    public static final String EXTRA_PUSH_TO_DRONE = "extra_push_to_drone";
    public static final String EXTRA_FORCE_MODE_CHANGE = "extra_force_mode_change";
    public static final String EXTRA_FORCE_ARM = "extra_force_arm";

    public static final String ACTION_LOAD_WAYPOINTS = Utils.PACKAGE_NAME + ".action.LOAD_WAYPOINTS";

    public static final String ACTION_BUILD_COMPLEX_MISSION_ITEM = Utils.PACKAGE_NAME + ".action" +
            ".BUILD_COMPLEX_MISSION_ITEM";
}
