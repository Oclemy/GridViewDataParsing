package com.tutorials.hp.gridviewdataparsing;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Oclemy for ProgrammingWizards TV Channel and http://www.camposha.info.
 - Our SpacecraftsCollection class.
 - Implements java.io.Serializeable.
 - This can allows us to convert our class which is normally held in dynamic memory into a fixed sequence of bytes that can be persisted into disk.
 - It uses ObjectOutputStream to serialize and ObjectInputStream to deserialize.
 - This allows us to easily pass collection of data to secondactivity in serialized from and once there,deserialize it back into a collection.
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
