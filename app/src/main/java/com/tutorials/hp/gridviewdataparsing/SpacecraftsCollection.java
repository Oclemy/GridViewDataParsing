package com.tutorials.hp.gridviewdataparsing;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Oclemy on 1/5/2017 for ProgrammingWizards Channel and http://www.camposha.com.
 * CLAS IMPLEMENTS SERIALIZABLE
 */
public class SpacecraftsCollection implements Serializable {

    private ArrayList<String> spacecrafts;

    public ArrayList<String> getSpacecrafts() {
        return spacecrafts;
    }

    public void setSpacecrafts(ArrayList<String> spacecrafts) {
        this.spacecrafts = spacecrafts;
    }
}
