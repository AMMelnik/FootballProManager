package com.edmodo.lection6;

/**
 * Created by pc on 06.12.2016.
 */
public enum Country {

    RUSSIA(1, "Russia"),
    GERMANY(2, "Germany"),
    ENGLAND(3, "England"),
    GREECE(4, "Greece"),
    NORWAY(5, "Norway"),
    SPAIN(6, "Spain"),
    ITALY(7, "Italy"),
    NETHERLANDS(8, "Netherlands"),
    MEXICO(9, "Mexico");

    private int id;
    private String countryName;

    Country(int id, String countryName) {
        this.id = id;
        this.countryName = countryName;
    }

    public String getLeagueName() {
        return countryName;
    }

    public int getId() {
        return id;
    }
}
