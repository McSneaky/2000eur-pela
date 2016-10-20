package com.company;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Kevin on 20-Oct-16.
 */
public class Room {
    public int id;
    public String exits;
    public boolean hasAir;
    public boolean hasTrap;
    public String description;

    @Override
    private void writeObject(ObjectOutputStream oos) throws IOException {
        // default serialization
        oos.defaultWriteObject();
        // write the object
        oos.writeInt(id);
        oos.writeChars(exits);
        oos.writeBoolean(hasAir);
        oos.writeBoolean(hasTrap);
        oos.writeChars(description);
    }

    private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
        // default deserialization
        ois.defaultReadObject();
        location = new Room(ois.readInt(), ois.readChar(), ois.readBoolean(), ois.readBoolean(), ois.readChar());
        // ... more code

    }
}
