package com.company;

/**
 * Created by Kevin on 20-Oct-16.
 */
public class Entity {
    public int hitPoints;
    public int lifeTime;
    public String name;
    public String title;
    public int[] location;

    public Entity(int hitPoints, int lifeTime, String name, String title, int[] location) {
        this.hitPoints = hitPoints;
        this.lifeTime = lifeTime;
        this.name = name;
        this.title = title;
        this.location = location;
    }


}
