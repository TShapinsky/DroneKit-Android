package com.o3dr.services.android.lib.drone.mission.item.complex;

import android.os.Parcel;

import com.o3dr.services.android.lib.drone.mission.MissionItemType;
import com.o3dr.services.android.lib.drone.mission.item.MissionItem;

/**
 */
public class SplineSurvey extends Survey {

    public SplineSurvey() {
        super(MissionItemType.SPLINE_SURVEY);
    }

    public SplineSurvey(SplineSurvey copy) {
        this();
        copy(copy);
    }

    private SplineSurvey(Parcel in) {
        super(in);
    }

    @Override
    public MissionItem clone() {
        return new SplineSurvey(this);
    }

    public static final Creator<SplineSurvey> CREATOR = new Creator<SplineSurvey>() {
        public SplineSurvey createFromParcel(Parcel source) {
            return new SplineSurvey(source);
        }

        public SplineSurvey[] newArray(int size) {
            return new SplineSurvey[size];
        }
    };
}
