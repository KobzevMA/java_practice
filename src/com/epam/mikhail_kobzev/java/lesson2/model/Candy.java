package com.epam.mikhail_kobzev.java.lesson2.model;

import java.io.Serializable;

/**
 * Created by Mike on 25.05.2018.
 */
public abstract class Candy implements Serializable {
    private int id;
    private String name;
    private int weight;
    private String type;

    public Candy(int id, String name, int weight, String type) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public abstract int getSumWeight();

    @Override
    public String toString() {
        return "Candy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Candy candy = (Candy) o;

        if (id != candy.id) return false;
        if (weight != candy.weight) return false;
        if (name != null ? !name.equals(candy.name) : candy.name != null) return false;
        return type != null ? type.equals(candy.type) : candy.type == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + weight;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
