package cs2340.gatech.edu.lab3.model;

import android.util.Log;

public enum ClassStanding {
    FRESHMAN("FR"),
    SOPHOMORE("SO"),
    JUNIOR("JR"),
    SENIOR("SR");

    private String value;

    ClassStanding(String standing) {
        value = standing;
    }
    public final String getValue() { return value; }
    public void setValue(String standing) {
        if (standing.equals("FR") | standing.equals("SO") | standing.equals("JR") | standing.equals("SR")) {
            value = standing;
        } else {
            Log.e("ClassStanding", "Incorrect value entered for standing.");
        }
    }

}
